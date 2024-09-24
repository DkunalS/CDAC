class  car:
    wheels = 4
    make = ""
    model = ""
    year = ""
    def __init__(self,make1,model1,year1):
        self.make = make1
        self.model = model1
        self.year = year1
    def display_info(self):
        print(f"Car Information: \nYear of Manufacturing: {self.year} \nMake: {self.year}")

if __name__ == "__main__" :
    car1 = car("Toyota","Corolla","2020")
    car2 = car("Honda","Civic","2022")

    car1.display_info()
    car2.display_info()