import re

with open("rawData.csv") as rawData:
    data = rawData.readlines()
    print(data)
pattern = r"(#unitid=[0-9]+#temp=[0-9]+)#datetime=(\d{4}\-\d{2}\-\d{2})T(\d{2}:\d{2}:\d{2})"
#"#unitid=1#temp=38#datetime=2024-09-21T15:30:00"
reformer = r"\1#date=\2#time=\3"
new_lines = []
for line in data:
    new_lines.append(re.sub(pattern, reformer, line))
    # print(re.findall(pattern, line))

with open('rawdata_new.csv', "w") as file:
    file.writelines(new_lines)
# print(new_lines)l