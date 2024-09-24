#
dict = {}
tuple1 = tuple(input("Enter the tuples: ").split(":"))
print(tuple1)
list1 = {tuple1}
print(list1)

#
# -------------------------------

# input_key = input("Enter key: ")
# input_val = input("Enter values: ")
list1 = [('a',5),('b',6), ('c',7)]
# str = tuple(str.split(",")) for str in list1
comb_dict = { i:j for i,j in list1}
print(comb_dict)