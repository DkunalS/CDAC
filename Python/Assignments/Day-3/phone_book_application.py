def add():
    name = input("Enter the Name: ")
    number = int(input("Enter the Phone Number: "))
    email = input("Enter the Email: ")
    add_list.append(number)
    add_list.append(email)
    phonebook[name] = add_list
    print(f"{name} contact is added into phonebook")
    print(f"Contact details are {phonebook}\n")

def search():
    name = input("Enter the Name: ")
    if name in phonebook:
        print(f"{name} contact is present in the phonebook!!")
        print(f"Contact details are {phonebook[name]}\n")

    else:
        print(f"{name} contact is not exist in the phonebook!!\n")

def update():
    name = input("Enter the Contact Name you want to update: ")
    number = input("Enter the number: ")
    email = input("Enter the email: ")
    phonebook[name] = [number, email]
    print(f"{name} contact is updated in the phonebook!!")
    print(f"Contact details are {phonebook[name]}\n")


def delete():
    name = input("Enter the Contact Name you want to delete: ")
    phonebook.pop(name)
    print(f"{name} contact is deleted from the phonebook!!\n")

phonebook ={}
add_list = []

while True:
    choice = int(input("""Enter the operation you want to perform
    1. Add contact
    2. Search Contact
    3. Update Contact
    4. Delete Contact
    5. Exit \n"""))
    match choice:
        case 1:
            add()
        case 2:
            search()
        case 3:
            update()
        case 4:
            delete()
        case 5:
            print("Exited Successfully!!")
            break
        case _:
            print("You have entered wrong input\n")