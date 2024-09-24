import pandas as pd
import numpy as np
import matplotlib.pyplot as plt


x = np.arange(1,11)
y1 = np.array([1,3,4,7,9,12,15,18,19,22])
y2 = np.array([2,5,7,10,12,13,16,18,21,23])

# Line plot
plt.figure(figsize=(8,6))
plt.plot(x, y1, label='Dataset 1 ', color='blue', marker='o', linestyle='--')
plt.plot(x, y2, label='Dataset 2 ', color='red', marker='s', linestyle='-')
plt.title('Line Plot Examle')
plt.xlabel('X axis')
plt.xlabel('Y axis')
plt.legend()
plt.grid(True)
plt.show()



categories = ['Category A','Category B', 'Category C', 'Category D']
values = [4,7,1,8]

plt.figure(figsize=(8,6))
plt.bar(categories,values, color='Black')
plt.title('Bar Chart Example')
plt.xlabel('categories')
plt.xlabel('values')
plt.grid(True)
plt.show()


x = np.random.rand(50)
y = np.random.rand(50)
colors = np.random.rand(50)
sizes = 1000 * np.random.rand(50)

plt.figure(figsize=(8,6))
plt.scatter(x,y, c=colors, s=sizes, alpha=0.5, cmap='ocean')
plt.title('Scatter Plot Example')
plt.xlabel('X axis')
plt.xlabel('Y axis')
plt.colorbar()
plt.grid(True)
plt.show()


months = ['January','February','March','April','May','June','July','August','September','October','November','December']
cols = [i for i in range(1,6)]
prod1 = np.random.randint(50,500,12)
prod2 = np.random.randint(50,500,12)
prod3 = np.random.randint(50,500,12)
prod4 = np.random.randint(50,500,12)
prod5 = np.random.randint(50,500,12)


df = pd.DataFrame(data = {
    'Months': months,
    'prod1' : prod1,
    'prod2' : prod2,
    'prod3' : prod3,
    'prod4' : prod4,
    'prod5' : prod5
})
df



# Line plot
plt.figure(figsize=(15,8))
plt.plot(months, prod1, label='Product 1', color='blue', marker='o', linestyle='--')
plt.plot(months, prod2, label='Product 2', color='Green', marker='o', linestyle='--')
plt.plot(months, prod3, label='Product 3', color='Red', marker='o', linestyle='--')
plt.plot(months, prod4, label='Product 4', color='Black', marker='o', linestyle='--')
plt.plot(months, prod5, label='Product 5', color='Orange', marker='o', linestyle='--')

plt.title('Line Plot Examle')
plt.xlabel('X axis')
plt.xlabel('Y axis')
plt.legend()
plt.grid(True)
plt.show()


sales = [a+b+c+d+e for a,b,c,d,e in zip(prod1,prod2, prod3, prod4, prod5)]
plt.figure(figsize=(20,10))
plt.bar(months,sales, color='Gray')
plt.title('Bar Chart Example')
plt.xlabel('months')
plt.xlabel('sales')
plt.show()


fig, axs = plt.subplot(2, 2, figsize=(12,10))


#1 Line Plot

axs[0,0].plt(months, prod1, label= 'prod1', color='blue', marker='o', linestyle='--')
axs[0,0].plt(months, prod2, label= 'prod2', color='green', marker='s', linestyle='--')
axs[0,0].plt(months, prod3, label= 'prod3', color='red', marker='o', linestyle='--')
axs[0,0].plt(months, prod4, label= 'prod4', color='black', marker='s', linestyle='--')
axs[0,0].plt(months, prod5, label= 'prod5', color='orange', marker='o', linestyle='--')
axs[0,0].set_title('Line Plot Example')
axs[0,0].set_xlabel('X Axis')
axs[0,0].set_ylabel('Y Axis')
axs[0,0].legend()
axs[0,0].grid(True)

