def sum1(*args):
    return sum(i for i in args if i >= 0)

result = sum1(1,-2,3,4,-5, 6, -7)
print(result)

