import sqlite3

# try:
#
#         conn = sqlite3.connect('kuchbhi.db')
#         cursor = conn.cursor()
#         cursor.execute('''CREATE TABLE IF NOT EXISTS user(
#         id INTEGER PRIMARY KEY,
#         name TEXT,
#         address INTEGER,
#         mobile INTEGER,
#         email TEXT
#         )
#         ''')
#
#         cursor.execute("insert into user(name,address,mobile,email) values ('Omkar','pune',556544,'gdsfshdf')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('kunal','gwalior',5566600544,'gdjtywrdf')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('daksh','indore',556544,'gdsfshdf')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('yash','kolhapur',556544,'gdsfshdf')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('dhruv','dhule',556644,'gdsfs5df')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('kaliya','naag',956544,'gdsfs6df')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('jail','jailer',556544,'gdsfsdf')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('judge','court',356544,'gdsf8hdf')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('criminal','gun',596544,'gd7fshdf')")
#         cursor.execute("insert into user(name,address,mobile,email) values ('advocate','suit',156544,'898dsfshdf')")
#
#         conn.commit()
#
# except ConnectionError:
#     print("Database Connection error")

def userOperations(username, address):
    try:
        conn = sqlite3.connect('kuchbhi.db')
        cursor = conn.cursor()
        query = f"select * from user where name = 'ram' and address = 'jhgfjsgfdaf'"
        cursor.execute(query)
        row = cursor.fetchall()
        if row:
            print("User Already exist")
            print(row)
        else:
            contact = input("Enter the contact: ")
            email = input("Enter the Email")
            cursor.execute(f"insert into user(name,address,mobile,email) values ('Omkar','pune','ram','jhgfjsgfdaf')")
            print("New user added successfullly!!")
    except ConnectionError:
        print(ConnectionError)

userOperations("ram", "jhgfjsgfdaf")