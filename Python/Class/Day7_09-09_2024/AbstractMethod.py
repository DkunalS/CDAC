from abc import ABC, abstractmethod

class Animal(ABC):
    @abstractmethod   #This method is abtract so we can't instantiate
    def sound(self):
        pass

class Dog(Animal):
    def sound(self):
        return "Woof!"

class Cat(Animal):
    def sound(self):
        return "Meow!"

# objAnimal = Animal()    # it will throw the error TypeError: Can't instantiate abstract class Animal with abstract method sound
objDog = Dog()
print(objDog.sound())