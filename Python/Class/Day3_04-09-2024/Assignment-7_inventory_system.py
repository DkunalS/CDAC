
dict ={}

def update():
    print(f"Current Inventory {dict}")
    items = input("Enter your Item Name: ")
    quantity = input("Enter new Quantities: ")
    if items in dict:
      # print("")
        dict.update({items:[quantity,price]})
    print(f"Inventory updated {dict}")


while True:
    choice = input("Enter your choice add/update: ").lower()
    if choice == 'add':
        num = int(input("Enter no of Items: "))
        for i in range(num):
            items = input("Enter Item Name: ")
            quantity = input("Enter Quantities: ")
            price = input("Enter Prices: ")
            pro = [quantity,price]
            # for items in range(num):
            dict[items] = pro
        # dict.update()
        print(f"Current Inventory {dict}")

    elif choice == 'update':
        update_choice = input("What You want to update Quantity / Price: ").lower()
        if update_choice == 'quantity':
            update()

        elif update_choice=='price':
            items = input("Enter Item Name: ")
            price = input("Enter new Prices: ")
        else:
            print("Sorry! You Entered Wrong Input")
            break

# def update()