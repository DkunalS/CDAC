# name = "string variable"
# print("Data type of",name,"is",type(name))
#
# #integer
# value = 7
# print(value)
# print(type(value))
#
# #Float
# f = 7.7
# print(f)
# print(type(f))
#
# b = True
# print(b)
# print(type(b))
#
# n = None
# print(n)
# print(type(n))
#
# PI = 3.1432
# print(PI)
# print(type(PI))
#
# a,b,c = 10,20,30
# print("a:", a)
# print("b:", b)
# print("c:", c)
#
# a=10
# b=20

# a=a+b
# b=a-b
# a=a-b

# print(a,b)
#
# temp = a
# a = b
# b = temp
#
# print(a,b)
#
# x=12
# y=50
#
# x,y = y,x
# print(x)
# print(y)
#
# h,s = 10,20
# andd=h&s
# print(andd)
# orr=h|s
# print(orr)
# xorr=h^s
# print(xorr)
#
# firstname = input("enter first name")
# lastname = input("enter last name")
#
# print("hi my name is {} {}".format(firstname,lastname))
# print("hi my name is {1} {0}".format(firstname,lastname))
# print("hi my name is {fname} {lname}".format(fname=firstname,lname=lastname))

# print("Hello", "world", sep=" ")
# print("Hello", "world", sep="-")
# print("Hello", "world", sep=", ")
#
# print("Hello", "world", end=" ")
# print("how are you")

# print("line1", end="\n\t")
# print("line2")

# str1= input("enter first string")
# str2 = input("enter second string")
#
# print("first string is {} and seocnd string is {}".format(str1,str2))
# print(f"first string is {str1} and seocnd string is {str2}")

# a = int(input("enter first number"))
# b = int(input("enter second number"))
# print("sum of a and b is:", a+b)


# x = (input("enter first number"))
# y = (input("enter second number"))
# print("sum of a and b is:", x+y)

# a = int(input("enter first number"))
# b = int(input("enter second number"))
# c = a+b
# print("sum of a and b is:", c)
# print(type(c))

# a = input("enter first number")
# b = int(input("enter second number"))
# c = int(a)+b
# print("sum of a and b is:", c)
# print(type(c))

# x = float(input("enter a number"))
# y = float(x)
# print(y**2)

# PI = 3.14
# radius = int(input("enter radius of circle"))
# area = PI*(radius**2)
# print("area of circle is:", area)

# MonIncome = float(input("enter monthly income"))
# MonExpenses = float(input("enter monthly expenses"))
#
# TotalSavings = MonIncome - MonExpenses
#
# PercentageIncomeSaved = (TotalSavings * 100)/MonIncome
# PercentageExpenses = 100 - PercentageIncomeSaved
#
# print("total savings is:",{TotalSavings,"0:.2f%"})
# print("percentage of income saved",PercentageIncomeSaved.format(:.2f))
# print("percentage of income spent",{PercentageExpenses,"0:.2f%"})

# var1 = 10
# var2 = 15
#
# print(var1 == var2)
# print(var1 > var2)
# print(var1 < var2)
# print(var1 != var2)

# year = int(input("enter a year"))
# if year % 4 == 0:
#     if year % 100 != 0:
#         if year % 400 == 0:
#             print("year is a leap year")
#         else:
#             print("not a leap year")
#     else:
#         print("not a leap year")
# else:
#     print("not a leap year")


# year = int(input("enter a year"))
# if year % 4 == 0 and (year % 100 != 0 or year % 400 == 0):
#     print("year is a leap year")
# else:
#     print("not a leap year")
# uppercase = 0
# lowercase = 0
# numeric = 0
# special_char = 0
#
# password = input("Enter a password:")
# criteria = 0
#
# for i in password:
#     if i.isupper():
#         uppercase += 1
#     elif i.islower():
#         lowercase += 1
#     elif i.isnumeric():
#         numeric += 1
#     else:
#         special_char += 1
#
# if len(password) >= 8:
#     criteria += 1
# if uppercase >= 1 and lowercase >= 1:
#     criteria += 1
# if numeric >= 1:
#     criteria += 1
# if special_char >=1:
#     criteria += 1
#
# if criteria >= 4:
#     print("strong password")
# elif criteria in (2, 3):
#     print("Moderate password")
# else:
#     print("Weak password")

# age = int(input("Enter your age"))
# ticket = 0
# if age < 5:
#     ticket = "Free"
# elif age >= 5 and age <= 12:
#     ticket = 5
# elif age <= 60:
#     ticket = 10
# else:
#     ticket = 7
#
# print("Ticket price is", ticket)

# num = int(input("enter a number"))
# fact = 1
# for i in range(2, num+1):
#     fact *= i
# print(fact)

# num = int(input("enter a number"))
# i = 1
# fact = 1
# while i <= num:
#     fact = fact * i
#     i+=1
# print(fact)

# condition = "y"
# while condition <= num:
#     a = int(input("enter a first number"))
#     b = int(input("enter a second number"))


# for i in range(1,11,2):
#     if i == 5:
#         continue
#     print(i)
#
#
# strg = "hkhnhfk"
# print(strg[2])
"""import random
secret_num = random.randint(1, 101)
condition = True

while condition:
    guess = int(input("Guess the number"))
    if guess > secret_num:
        print("Enter small number")
    elif guess < secret_num:
        print("Enter large number")
    else:
        condition = False

print("You guessed the secret number")"""




















