# nested while loop
# for loop with else
# while loop with else

# #Assignment 1

# num = input("Enter the number: ")
# result = 0
# for i in num:
#     result+=int(i)
# print(f"Sum of the digit is {result}")

# Another way of Assignment 1

# num = int(input("Enter the number: "))
# result = 0
# result = num//10
# print(result)

# #Assignment 2
#
# num = int(input("Enter the number: "))
# count = 1
# for i in range(1, 12):
#     mul = count*num
#     count+=1
#     print(f"{num}*{count} = {mul}")

# # Assignment 3
#
# balance_amount = int(input("Enter the balance: "))
# atm_flag = 0
# print("Do you want to withdraw the money press 1 for yes, 2 for check the balance")
# atm_flag = int(input("Enter your choice: "))
# withdrawl_amount = 0
# # if atm_flag == 2:
# #     print(balance_amount)
# # else:
# withdrawl_amount = int(input("Enter the withdrwal amount: "))
# while atm_flag == 1:
#     if withdrawl_amount%10 == 0:
#         if balance_amount >= withdrawl_amount:
#             balance_amount = balance_amount - withdrawl_amount
#             print(f"balance amount is {balance_amount}")
#         else:
#             print("Amount should be multiple of 10")
#     else:
#         print("You have etntered wrong amount")
#     break

# #Assignment 4

# num = int(input("Enter the number: "))
# for i in range(1, 6):
#     for j in range(1, 6):
#         mul = i*j
#         print(f"{i}*{j} = {mul} ")
#     print(f"{1}\n {2}\n {3}\n {4}\n {5}")


# Assignment 5 Triangular pattern
# 1
# 22
# 333
# 4444
# 55555

# num = int(input("Enter the number: "))
# count = 1
# for i in range(1 , num):
#     for j in range(1, i):
#         print(j)
#     # print(i)


# # Assignment 6 (Match case- calculator)
#
# num1 = int(input("Enter the number1: "))
# num2 = int(input("Enter the number2: "))
# operator = input("Enter the operator: ")
#
#  match operator:
#    case


# Assignment 7
# list = []
# num1 = int(input("Enter the number : "))
# if num1 >= 1:
#  for j in range(2, num1):
#   for i in range(2, int((j**0.5)+1)):
#    if (num1%i == 0):
#     print("number is not prime")
#   list.append(j)
#   print("number is prime", j)
#  print(f"list is{list}")


# Assignment 8
# print("1- View, 2- Add, 3- remove, 4 - exit ")
# choice = input("Enter you choice: ")

# toDoList = []
#
#
# while open == 1:
#     print("1- View, 2- Add, 3- remove, 4 - exit ")
#     choice = input("Enter you choice: ")
#     match choice:
#         case '1':
#             print(toDoList)
#         case '2':
#             work = input("Enter work you want to do: ")
#             toDoList.append(work)
#             print(toDoList)
#         case '3':
#             print(toDoList)
#             work = input("Enter work you want to delete: ")
#             toDoList.remove(work)
#             print(toDoList)
#         case '4':
#             print("exited")


# Assignment 10

# original_list = input("Enter the list: ").split(" ")

# print(list_input)
# rotation(list_input, positionToBeShifted, len(list_len))


# Assignment 11 : Tuple manipulation

# original = input("Enter the list: ").split(sep= ",")
# original_tuple = tuple(original)
# print("first element is : ",original_tuple[0])
# print("Last element is : ",original_tuple[-1])
# print("Original tuple is : ",original_tuple)
# print("Excluding first and last number is : ",original_tuple[1:-1])
# print("2nd numbers is : ",original_tuple[::2])
# print("Reverse : ",original_tuple[::-1])


# Assignment 12 : Tuple Packing & unpacking

name, age, city, country = input("Enter INforation : " ).split(sep= ' ')
print(f"Name is {name}\n age is {age}\n city is {city}\n country is {country}")

co_tuple=tuple(city)
cu_tuple=tuple(country)
cou_tuple = (city,country)
all = (name,age,cou_tuple)
# c_tuple=tuple(city,country)
# print(n_tuple)
# print(a_tuple)
# print(co_tuple)
# print(cu_tuple)
# print(cou_tuple)
print(all)


# Assignment 13 : Tuple built-in functions
# dig = input("Enter the list: ")
# digits = tuple(int(x) for x in dig.split(','))
# # digits = map(int, input("Enter the list: ").split(','))
# print(digits)
# suma = sum(digits)
# print(suma)


# Assignment 14 : Tuple sorting & filtring
#
# dig = input("Enter the list: ")
# digits = tuple(int(x) for x in dig.split(','))
# print(sorted(digits))
# thr = int(input("Enter the Threshold: "))
# for i in range(0, len(digits)):
#     if digits[i] > thr:
#         print(digits[i],end=' ')


