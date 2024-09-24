# list = ['a','e','i','o','u']
str = input("Enter String: ")
# out = [str for str in list]
# print(out)
vowels =[char for char in str if char in 'aeiou']
print(vowels)