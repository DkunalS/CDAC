from abc import abstractmethod


class Animal:
    _work = ""
    def __init__(self, work):
        self.work = work
    @abstractmethod
    def action(self):
        pass
class Dog(Animal):
    def __init__(self, work):
        super()._work = work

    def action(self):
        print(super()._work)

dog = Dog("bark")
dog.action()
