


listOfTuple = [('Om',30),('Daksh',25),('Ram',26)]

# print(listOfTuple)
sorted_list = sorted(listOfTuple, key=lambda person: person[0])   # Sorting on 0th element
sorted_list1 = sorted(listOfTuple, key=lambda person: person[1])   # Sorting on 1st element

for person in sorted_list:
    print(f"{person}")
print()
for person in sorted_list1:
    print(f"{person}")