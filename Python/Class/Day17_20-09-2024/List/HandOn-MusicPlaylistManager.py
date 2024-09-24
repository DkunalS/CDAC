
emp_list = []
listOfSong = ''

def add_song(titles):
    emp_list.extend(titles)
    print(emp_list)
    print("Title Added Successfully!")

def del_song(titles):
    emp_list.remove(title)
    print("Title deleted Successfully!")

def view_all_song():
    # for title in emp_list:
    #     print(title)
    #     # listOfSong = ','.join(title)
    listOfSong = '\n'.join(emp_list)
    print(listOfSong)
def slice_playlist(sIndex, eIndex):
    sliced_list = emp_list[sIndex:eIndex]
    print(sliced_list)

# emp_list = []
while True:
    try:
        choice = int(input('''Enter the your Choice:
        1- Add new Song
        2- Remove the Song
        3- View all Songs
        4- Slice the Playlist
        5- Exit
        '''))

        match choice:
            case 1:
                titles = input("Enter Song Titles separated by Comma:").split(sep=',')
                # print(titles)
                add_song(titles)

            case 2:
                title = input("Enter Song you want to delete:")
                del_song(titles)

            case 3:
                view_all_song()

            case 4:
                print("Enter the start and ending index to slice:")
                sIndex = int(input("Start Index: "))
                eIndex = int(input("Ending index:"))
                slice_playlist(sIndex,eIndex)
            case 5:
                break

            case _:
                print("Entered the wrong input")

    except ValueError:
        print("Entered the wrong the input")