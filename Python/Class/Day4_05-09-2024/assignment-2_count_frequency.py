input = input("Enter String: ").split(" ")
dict = {}
for i in input:
    if i in dict:
        dict[i] +=1
    else:
        dict[i]=1
print(dict)

# Use with dict comprahension