
def celsius_to_fahrenheit(celsius):
    fahrenheit = (celsius*(9/5))+32
    return fahrenheit

def fahrenheit_to_celsius(fahrenheit):
    celsius = (fahrenheit-32)*(5/9)
    return celsius

def celsius_to_kelvin(celsius):
    kelvin = celsius + 273.15
    return kelvin

while True:
    choice = input(""" Enter your Choice
    1. Celsius to Fahrenheit 
    2. Fahrenheit to Celsius
    3. Celsius to Kelvin
    4. Exit\n""")
    try:
        match choice:
            case "1":
                celsius = float(input("Enter the Celsius: "))
                fahrenheit = celsius_to_fahrenheit(celsius)
                print(f"{celsius} Celsius = {fahrenheit} Fahrenheit")

            case "2":

                    fahrenheit = float(input("Enter the Fahrenheit: "))
                    celsius = fahrenheit_to_celsius(fahrenheit)
                    print(f"{fahrenheit} Fahrenheit = {celsius} Celsius")

            case "3":

                    celsius = float(input("Enter the Celsius: "))
                    kelvin = celsius_to_kelvin(celsius)
                    print(f"{celsius} Celsius = {kelvin} Kelvin")

            case "4":
                print("Thank you for the using program!!!")
                break

            case _:
                print("Entered Invalid Input")

    except ValueError:
        print("Input is not number")
    else:
        print("No Exception was raised")
    finally:
        print("Program execute Successfully!!")
