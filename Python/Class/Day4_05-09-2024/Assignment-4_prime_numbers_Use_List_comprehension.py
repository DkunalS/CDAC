# Prime number using List Comprehension
print([num for num in range(2,51) if all(num %i !=0 for i in range(2, int(num*0.5) +1))])