str1 = input("Enter first string: ").replace(" ", "").lower()
str2 = input("Enter secong string: ").replace(" ", "").lower()

str1 = sorted(str1)
str2 = sorted(str2)
if str1 == str2:
    print("string is Anagram")
