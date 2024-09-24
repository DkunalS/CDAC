class Book:

    def __init__(self,title,author,year,available):
        self.title = title
        self.author = author
        self.year = year
        self.available = available

    def display_details(self):
        print(f"Book Information: \nTitle: {self.title} \nAuthor: {self.author} \nYear: {self.year} \nAvailable: {self.available}")

    def borrow_book(self):
        self.available = False
        print("Book has been borrowed")

    def return_book(self):
        self.available = True
        print("Book Has been returned\n")

if __name__ == "__main__":
    book1 = Book("Kunal","Sahu",2025,True)
    book2 = Book("Om","Waghmare",2025,True)

    book1.display_details()
    book1.borrow_book()
    book1.return_book()

    book2.display_details()
    book2.borrow_book()
    book2.return_book()

