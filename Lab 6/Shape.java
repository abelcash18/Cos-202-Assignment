// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

abstract class Shape {
    public abstract double getArea();
}

// Circle subclass
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle subclass
class Rectangle extends Shape {
    private double width;
    private double height;
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
}