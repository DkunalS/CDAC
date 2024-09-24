
text = input("Enter you first text:")
word_list = []
word_set = {}
# new_text =
for i in text:
    word_list.append(i)
    word_set = set(word_list)    #Duplicate remove by converting into set
    word_set = sorted(word_set)

print(word_set)
st1 = ''.join(word_set)
print(st1)

# quick brown fox jumps over the lazy dog

# --------------------------------------------------------------

# Anothor way
text = input("Enter you first text:").lower()
str1 = text.replace(" ", "")
st1 = ''.join(str1)
print(st1)