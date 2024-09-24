dict = {'Alice' : 85,
       'Bob' : 92,
       'Charlie' : 78,
       'David' : 65}
print({student : score + 5 for student, score in dict.items() if score > 80 })