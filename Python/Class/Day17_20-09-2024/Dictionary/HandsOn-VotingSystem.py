movie_list = {}
while True:
    choice = int(input('''Enter the your Choice:
    1- Add new movie
    2- Vote for a movie
    3- Remove a movie
    4- Display voting result
    5- Find the top movie
    6- Exit
    '''))

    match choice:
        case 1:
            print('Enter the movie details :')
            movie_name = input("Movie Name: ")
            movie_list[movie_name] = 0

        case 2:
            print("Vote for your favorite movie:")
            for key in movie_list.items():
                print(movie_list[key])
            movie_name = input()
            movie_list[movie] = +1

        case 3:
            print("Enter the movie which you want to delete: ")
            for key in movie_list.items():
                print(key)
            movie = input()
            del movie_list[movie]

        case 4:
            print("Result is: ")
            for key, value in movie_list.items():
                print(key,value)

        case 5:
            max_vote = max(movie_list, key=movie_list.get())
            print("Movie who got the highest no of votes is:\n", max_vote)
        case 6:
            break
        case _:
            print("Entered Wrong input")


