try:
    # Code that may raise an exception
    result = 10 / 2
    print("Result:", result)
except ZeroDivisionError:
    # Code to handle the exception
    print("Error: Division by zero.")
else:
    # Code to execute if no exceptions are raised
    print("No exceptions were raised.")
finally:
    # Code that will always execute
    print("This will always execute.")
