re = int(input("Enter Number: "))

def fun_fact(number):
    result = 1
    if number == 1:
        return result
    else:
        result = number * fun_fact(number-1)
        return result


print(fun_fact(re))