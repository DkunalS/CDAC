class Car:
    num_of_cars = 0

    def __init__(self,brand,model):
        self.brand = brand
        self.model = model
        car.num_of_cars += 1

        @classmethod
        def get_number_of_cars(cls):
            return f"Total numbers of cars created: {cls.num_of_cars}"

    car1 = Car()

    car1.get_number_of_cars()