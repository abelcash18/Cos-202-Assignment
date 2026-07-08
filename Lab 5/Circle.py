# // Name: Joseph Abel Olayinka
# // Matric no:  EDU2509276
# // Faculty: Education
# // Department: Curriculum and Instructional Technology
# // Course area: Computer Science Education
# // Course: Cos 202
# // Level:200 Direct-Entry

import math

class Circle:
    def __init__(self, radius):
        self.radius = radius
    def area(self):
        return math.pi * self.radius ** 2

class Rectangle:
    def __init__(self, width, height):
        self.width, self.height = width, height
    def area(self):
        return self.width * self.height

class Triangle:
    def __init__(self, base, height):
        self.base, self.height = base, height
    def area(self):
        return 0.5 * self.base * self.height

shapes = [Circle(5), Rectangle(4, 6), Triangle(3, 8)]
for s in shapes:
    print(f"{s.__class__.__name__} area: {s.area():.2f}")