class Book:

    number_of_copies = 0

    def __init__(self,title,author,year,available,price):
        self.title = title
        self.author = author
        self.year = year
        self.available = available
        self.__price = 50
        # self.copies = copies


    def display_details(self):
        print(f"Book Information: \nTitle: {self.title} \nAuthor: {self.author} \nYear: {self.year} \nAvailable: {self.available}\nprice: {self.__price} Rs/-")

    # @classmethod
    # def get_number_of_copies(cls):
    #     cls.number_of_copies += 1
    #     print(f"No of copies are {cls.number_of_copies}")


    def borrow_book(self):
        if self.available == True:
            print(f"Book {self.title} is available ")
            self.available = False
            print(f"Book {self.title} has been borrowed")

        else:
            print(f"Book  {self.title} is not available")
            print("Book has been borrowed")

    def return_book(self):
        self.available = True
        print("Book Has been returned\n")

if __name__ == "__main__":


    book1 = Book("Kunal","Sahu",2025,True,500)
    book2 = Book("Om","Waghmare",2025,True,1000)


book1.display_details()
print(book1.__price)
# book1.borrow_book()
# book1.return_book()
# Book.get_number_of_copies()

# book2.display_details()
# print(book2.__price)
# book2.borrow_book()
# book2.return_book()

