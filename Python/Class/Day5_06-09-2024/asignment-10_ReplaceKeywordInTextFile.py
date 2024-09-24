
fileData = ""

def write_function(data):
    try:
        with open("text1.txt", mode="w") as file:
            file.write(data)
        print(f"Data written into file")
    except FileNotFoundError:
        print("File Not Found")

def read_function():
    try:
        with open("text1.txt", mode="r") as file:
            global fileData
            # fileData = file.read()
            fileData = (file.read()).replace("Section", "Omkar")
            print(fileData)
    except FileNotFoundError:
        print("File Not Found")

read_function()
# write_function(fileData)