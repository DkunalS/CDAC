sum1 = 0

def calc_sum(*args):


    # for i in args:
    sum1 =  sum(args)
    print(f"local sum = {sum1}")
    global sum1

print(f"Global sum = {sum1}")


calc_sum(1,2,3,4,5,6,7)