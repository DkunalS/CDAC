
dict = {1: {"name": 'kunal', "phone no ": [123456, 654321], 'email id': 'abs@abc.com'}}
count = 1
def add_contact(details):
    count=+ 1
    dict[count] = details
    print("Contact Added Successfully!!")
    with open('contact.csv', 'w') as head:
        head.writelines(dict)

def display():
    print(dict)
def del_contact(key):
    del dict[key]
    print("Contact deleted Successfully!!")



while True:
    try:
        choice = input('''Enter the your Choice:
        1 - Add the contact
        2 - Display Contact
        3 - Delete the contact
        4 - Exit''')
        match int(choice):
            case 1:
                name = input("Enter the Name: ")
                phone_no = [input("Enter the phone numbers by separating the comma: ").split(",")]
                email = input("Enter the Email: ")
                details = {'Name': name, 'Nos' : phone_no, 'Email': email}
                add_contact(details)
            case 2:
                display()

            case 3:
                contact = input("Enter the contact Id you want to delete: ")
                del_contact(contact)

            case 4:
                print("Exited Successfully")
                break

            case _:
                print("Entered Wrong choice")
    except ValueError:
        raise ("Entered the wrong values")

