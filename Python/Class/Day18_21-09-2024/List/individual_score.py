text = "gshgsh5gjkhfkghsjkdhjork;ljhsjk5lbfgjl"
print(text[:5])
print(text[-5:])
length = len(text)
lb = length//2
print(length//2)

if (length%2) != 0:
    print(text[lb:(lb+2)])
else:
    print(text[(lb-1):(lb+1)])

print(text[1::2])
msg = input("Enter the msg: ")
print(msg)
