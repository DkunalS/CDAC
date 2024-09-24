class shape:
    def area(self):
        print("super class")
        # if shape:
            # shape.print_shape_area()

class circle(shape):
    def __init__(self,redius):
        self.redius = redius
    def area(self):
       return 3.14 * (self.redius)**2

class rectancle(shape):
    def __init__(self,length,width):
        self.length = length
        self.width = width
    def area(self):
        return self.length * self.width

def print_shape_area(shape):
    print(f"Area of the circle is {shape.area()}")

# circle1 = circle(5)
rectancle1 = rectancle(5,6)
print_shape_area(rectancle1)
