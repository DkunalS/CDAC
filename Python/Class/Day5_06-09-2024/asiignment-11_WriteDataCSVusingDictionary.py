import csv

studentDictList = [{"ID": 12345,"Name": "Omkar","Age": 50,"Grade": "A"},
               {"ID": 54321,"Name": "Karmo","Age": 55,"Grade": "D"}]
fileName = "students.csv"

def write_students_to_csv(filename: str, studentDictList: list):
    if not studentDictList:
        return
    with open(filename, 'w', newline='') as file:
        fieldnames = studentDictList[0].keys()
        writer = csv.DictWriter(file,fieldnames=fieldnames)
        writer.writeheader()
        writer.writerows(studentDictList)

write_students_to_csv(fileName, studentDictList)
