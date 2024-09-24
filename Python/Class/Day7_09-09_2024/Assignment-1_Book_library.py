class Book:
    title = ""
    author = ""
    year = None
    available = Nonecla

    def display_details(self):
        print(f"Book Information: \nTitle: {self.title} \nAuthor: {self.author} \nYear: {self.year} \nAvailable: {self.available}\n")

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

    book1 = Book()
    book1.title = "Kunal"
    book1.author = "Sahu"
    book1.year = 2025
    book1.available = False

    book2 = Book()
    book2.title = "om"
    book2.author = "waghmare"
    book2.year = 2025
    book2.available = True

    book1.display_details()
    book1.borrow_book()
    book1.return_book()

    book2.display_details()
    book2.borrow_book()
    book2.return_book()

