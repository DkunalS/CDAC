def fun(name, message = 'Helllo'):
    print(f" {message} {name}")

fun(1, 2)

def fun1(*args):
    print(f"om {args[0]} {args[1]}")

    return args[0], args[1]                            #  return type will be tuple

fun1(2,3)

# def fun2(**kwargs)



