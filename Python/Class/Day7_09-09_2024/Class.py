class  car:
    wheels = 4
    make = ""
    model = ""
    year = ""
    def display_info(self):
        print(f"Car Information: \nYear of Manufacturing: {self.year} \nMake: {self.year}")
if __name__ == "__main__" :
    car1 = car()
    car1.model = "Toyota"
    car1.make= "Corolla"
    car1.year="2020"
    car2 = car()
    car2.model = "Honda"
    car2.make = "Civic"
    car2.year = "2022"

    car1.display_info()
    car2.display_info()