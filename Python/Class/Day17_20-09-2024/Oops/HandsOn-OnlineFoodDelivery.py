class FoodItem:
    def __init__(self, name, price, category):
        self.name = name
        self.price = price
        self.category = category

    def display_info(self):
        print(f"Name :{self.name}, "
              f"Price: {self.price}, "
              f"Category: {self.category}")

class Customer:
    order_history = []
    def __init__(self, name, customerID):
        self.name = name
        self.customerID = customerID
        self.order_history = []

    def place_order(self, food_item, quantity):
        order_detail = {
            'fooditem': food_item,
            'quantity': quantity,
        }
        self.order_history.append(order_detail)

    def view_order_history(self):
        print(f"All Oreders are: {self.order_history} ")

class RegularCustomer(Customer):

    def __init__(self, name, customerID, discount=7.0):
        super().__init__(name, customerID)
        self.discount = discount

    def place_order(self, name, food_item, quantity):

        order_detail = {
            'fooditem': food_item,
            'quantity': quantity,
        }
        self.order_history.append(order_detail)
        print(order_detail)
    def view_order_history(self):
        print(self.order_history)

class PremiumCustomer(Customer):
    def __init__(self, name, customerID, discount, priority_delivery=True):
        super.__init__(self, name, customerID)
        self.discount = discount
        self.priority_delivery = priority_delivery


    def place_order(self, food_item, quantity):
        order_detail = {
            'fooditem': food_item,
            'quantity': quantity,
            }
        self.order_history.append(order_detail)

class Restaurant():
    def __init__(self):
        self.fooditems = []
        self.customers = []


    def add_food_item(self, fooditem):
        self.fooditem = fooditem
        self.fooditems.append(fooditem)


    def add_customer(self, customer):
        self.customer = customer
        self.customers.append(customer)

    def display_menu(self):
        print(self.fooditems)

    def display_customer(self):
        print(self.customers)

foodItem = FoodItem("BPM",300, "Veg")
regularCustomer = RegularCustomer("om", 123, 5.5)
# premiumCustomer = PremiumCustomer("daksh", 452, 3.2, True)

foodItem.display_info()
regularCustomer.place_order('kunal',foodItem,quantity=5)
# regularCustomer.order_history()




