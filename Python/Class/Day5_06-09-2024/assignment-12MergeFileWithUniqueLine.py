
file1 = "text1.txt"
file2 = "text2.txt"
merge_unique = "newFile.txt"

def read_function(fileName):
    try:
        with open(fileName, mode="r", encoding="utf-8") as file:
            data = list(file.readlines())
            return data
        print(f"Data read from file")
    except FileNotFoundError:
        print("File not Found!!")

def sortedMergeData(list1,list2):
    newlist = set(list1 + list2)
    return newlist


def write_function(filename, data):
    with open(filename, mode="w", encoding="utf-8") as file:
        file.writelines(data)
    print(f"Data written into file")

file1Data = read_function(file1)
# print(file1Data)
file2Data = read_function(file2)
# print(file2Data)
newFileData = sortedMergeData(file1Data,file2Data)
# print(newFileData)
write_function(merge_unique, newFileData)



