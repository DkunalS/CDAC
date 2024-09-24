text = "ab cde dcBa"
text1 = text.replace(" ", "").lower()
is_pallindome = text1 == text1[::-1]
print(is_pallindome)