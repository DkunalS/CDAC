def addBook():
    title = input("Enter the Title: ").lower()
    author = input("Enter the Author: ").lower()
    genre = input("Enter the Genre: ").lower()
    year = input("Enter the Year: ").lower()
    # add_list =[]
    # add_list.append(author)
    # add_list.append(genre)
    # add_list.append(year)
    bookCollection.update({title : {"Author": author, "Genre": genre, "Year": year}})
    print(f"{title} Book is added into Book Collection")
    print(f"Book details are {bookCollection}\n")

def searchBook():
    byAuthorGenre = input("Search the book by Genre/Author: ").lower()
    searchItem = input("please enter Genre or Author Name: ").lower()
    # print(bookCollection.values())
    match byAuthorGenre:
        case "author":
            for booktitle in bookCollection:
                if searchItem == bookCollection[booktitle]["Author"]:
                    print(f"{searchItem} Book is present in the Book Collection!!")
                    print(f"Book details are {bookCollection}\n")
                    return
        case "genre":
            for booktitle in bookCollection:
                if searchItem == bookCollection[booktitle]["Genre"]:
                    print(f"{searchItem} Book is present in the Book Collection!!")
                    print(f"Book details are {bookCollection}\n")
                    return
    print(f"{searchItem} Book is not exist in the Book Collection!!\n")

def deleteBook():
    title = input("Enter the Book title you want to delete: ")
    bookCollection.pop(title)
    print(f"{title} Book is deleted from the Book Collection!!\n")

bookCollection ={}
while True:
    choice = int(input("""Enter the operation you want to perform
    1. Add Book
    2. Search Book
    3. Remove Book
    4. Exit \n"""))
    match choice:
        case 1:
            addBook()
        case 2:
            searchBook()
        case 3:
            deleteBook()
        case 4:
            print("Exited Successfully!!")
            break
        case _:
            print("You have entered wrong input\n")