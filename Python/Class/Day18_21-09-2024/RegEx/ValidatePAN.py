import re
text = '''In our recent financial audit, we reviewed several 
accounts. For instance, John Smith's PAN is ABCDE1234F, while
 Sarah Johnson has PAN FGHIJ5678K. Additionally, Raj Patel's 
 PAN number is LMNOP9012M, and Maria Garcia’s PAN is QRSTU3456N.
  Lastly, our vendor, XYZ Pvt Ltd, submitted a PAN of VWXYZ7890P. 
  It’s crucial to ensure that all PAN numbers are correctly recorded for tax compliance.'''

pattern = r'[A-Z]{5}\d{4}[A-Z]'

print(re.findall(pattern, text))

if re.findall(pattern, text):
    print("Valid")
else:
    print("Invalid")