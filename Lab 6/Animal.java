// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
// Course: Cos 202
// Level:200 Direct-Entry

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    // Abstract method (no implementation here)
    public abstract void makeSound();
}
// Dog implementation
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Woof Woof!");
    }
}
// Cat implementation
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " says: Meow!");
    }
}