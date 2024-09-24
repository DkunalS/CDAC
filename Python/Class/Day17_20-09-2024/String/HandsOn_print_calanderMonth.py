
num_of_day =  30
start_day = 3
current_position = 0
print("S\tM\tT\tW\tT\tF\tS")
print('\t' * start_day,end='')

for i in range(1, num_of_day + 1):

    print(i,end='\t')
    if (start_day + i) % 7 == 0:
        print()

