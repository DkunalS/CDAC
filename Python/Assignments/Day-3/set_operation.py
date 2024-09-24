math_stu = {'Alice', 'Bob', 'Charlie', 'David' }
science_stu = {'Charlie', 'David', 'Eve', 'Frank' }

print(f"Students who are enrolled in both Maths and Science: {math_stu & science_stu}")
print(f"Students who are enrolled in Maths but not in Science: {math_stu.difference(science_stu)}")
print(f"Students who are enrolled in either Maths or science or in both: {math_stu.union(science_stu)}")
print(f"Students who are enrolled in Science but not in Maths: {science_stu.difference(math_stu)}")