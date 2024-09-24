from abc import ABC, abstractmethod

class Vehicle(ABC):
    @abstractmethod   #This method is abtract so we can't instantiate
    def start(self):
        pass
    @abstractmethod
    def stop(self):
        pass

class Car(Vehicle):
    def start(self):
        print("Car has started!!")
    def stop(self):
        print("Car has stopped!!")

class Bike(Vehicle):
    def start(self):
        print("Bike has started!!")

    def stop(self):
        print("Bike has stopped!!")

class Bus(Vehicle):
    def start(self):
        print("Bus has started!!")

    def stop(self):
        print("Bus has stopped!!")

class Garage:
    vehicle_list = []
    def add_vehicle(self, *vehicle):
        for i in vehicle:
            self.vehicle_list.append(i)
        # print(self.vehicle_list)

    def operate_vehicle(self, *vehicle):
        for i in vehicle:
            i.start()
            i.stop()

car = Car()
bike = Bike()
bus = Bus()

garage = Garage()
garage.add_vehicle(car, bike, bus)
garage.operate_vehicle(car,  bike, bus)


