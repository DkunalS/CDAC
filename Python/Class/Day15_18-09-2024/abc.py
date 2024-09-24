import pandas as pd


df = pd.read_csv("retail_sales.csv")
print(df)

# Printing the top 10 product
print(df.head(10))

# Date to datetime
df['Date'] = pd.to_datetime(df['Date'])
print(df)

# Filtering the duplicates
filtered_duplicate = df.drop_duplicates()
print(filtered_duplicate)

# Calculating the Quantifiers
Q1 = filtered_duplicate['Sales'].quantile(0.25)
Q3 = filtered_duplicate['Sales'].quantile(0.75)
IQR = Q3 - Q1
print(IQR)

# Determining the lower bound and upper bound
lower_bound = Q1 - 1.5 * IQR
upper_bound = Q3 + 1.5 * IQR
median_sales = filtered_duplicate['Sales'].median()
filtered_duplicate['Sales'] = filtered_duplicate['Sales'].clip(lower=lower_bound, upper=upper_bound)
print(filtered_duplicate.head(20))


# Calculating the total sales and printing the top 5 stores by sales
total_sales = filtered_duplicate.groupby('Store')['Sales'].sum()
print(total_sales.head(5))


# Calculationg the highest average sales
avg_sales = filtered_duplicate.groupby('Category')['Sales'].mean()
sorted_values = avg_sales.sort_values(ascending=False)
print(sorted_values)
# print(avg_sales.head(1))
# print(f'Highest average sale is {avg_sales['Category'].max()}")