import re
sample = '''abc1234
A1c3d4e5f 
a12 
A1b@d5e9f6g'''
pat = r'^[a-zA-Z][a-zA-Z0-9]{5,11}\d$'
result = re.search(r'^[a-zA-Z][a-zA-Z0-9]{5,11}\d$',sample)
print(result)
