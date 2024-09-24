import re


def translate(text):
    a = re.sub(r'[aeiouAEIOU]','abc',text)
    print(a)



text = "This is fun"
translate(text)
