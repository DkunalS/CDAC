class Calculator:
    def add(self, *args):
        return sum(args)

calc = Calculator()
calc1 = Calculator()
print(calc.add(5,9))
print(calc1.add(5,9,5))
