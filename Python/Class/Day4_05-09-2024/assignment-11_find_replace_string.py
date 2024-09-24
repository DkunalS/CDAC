
text = "hithisiscdacandwearelearningpython"

print(text.find('is'))
# print(text.find('is', ))
indices = []
start = 0
while start < len(text):
    index = text.find('is', start)
    if index == -1:
        break
    indices.append(index)
    start = index + 1
print(indices)

print(text.replace('is', 'my', 1))
print(text.replace('my', 'is'))
