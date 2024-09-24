import random

countries_and_capitals = {
    "India": "New Delhi",
    "Australia": "Canberra",
    "Brazil": "Brasília",
    "Canada": "Ottawa",
    "France": "Paris",
    "Germany": "Berlin",
    "Japan": "Tokyo",
    "Russia": "Moscow",
}

score = 0
attempt = 0
# while True:
# if user_input == 'yes':
for country in list(countries_and_capitals.keys()):
    user_input = input("Do you want to play yes/no : ").lower()
    if user_input != 'yes':
        print("Thank You!!")
        print(f"Your score is {score}")
        print(f"Your no of attempt {attempt}")
        break

    answer = input(f"Guess the Capital of {country} : ").lower()
# print(countries_and_capitals[country])
    if answer == countries_and_capitals[country].lower():
        print("you guess is right!!")
        score += 1

        # input("Do you want to play more : ")
    else:
        print("your guess is wrong!!")
        print(f"Right answer is {countries_and_capitals[country]}")
        # attempt += 1
        # input("Do you want to play more : ")
    attempt += 1

# else:
#     print("Thank You!!")
#     print(f"Your score is {score}")
#     print(f"Your no of attempt {attempt}")
#     # break


    # guess = input("Enter your choice : ")

