name = None
age = None
score_com = None
tuple_date = ()
student_data = []
updated_student_data = []
tuple_com = ()

def add_data():
    while True:
        user_input = input("If you want to add the student data (yes/no): ")
        if(user_input == 'yes'):

            name = input("Enter the name: ")
            age = int(input("Enter the age: "))
            score_hindi = int(input("Enter the Hindi Score: "))
            score_english = int(input("Enter the English Score: "))
            score_marathi = int(input("Enter the Marathi Score: "))
            score_com = (score_hindi, score_english, score_marathi)
            tuple_com = (name, age, score_com)
            student_data.append(tuple_com)

            print(student_data)
        elif user_input == 'no':
            print("Thanks you for using service")
            break
        else:
            print("Invalid Input")

def avg_score_new_list():
    score = [tup[2] for tup in student_data]
    avg = ((score[0][0]) + (score[0][1]) + (score[0][2]))/3
    # avg = (score[0] + score[1] + score[2])/3
    avg_tuple = (avg)
    tuple_com = (student_data[0][0], student_data[0][1], student_data[0][2], avg_tuple)
    print(f"Average Score is {avg_tuple}")
    # print(tuple_com)
    updated_student_data.append(tuple_com)
    print(updated_student_data)




add_data()
avg_score_new_list()