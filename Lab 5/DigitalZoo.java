// Name: Joseph Abel Olayinka
// Matric no:  EDU2509276
// Faculty: Education
// Department: Curriculum and Instructional Technology
// Course area: Computer Science Education
 // Course: Cos 202
 // Level:200 Direct-Entry

import java.util.ArrayList;
import java.util.List;

class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof");
    }
}
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }
}
class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("chirp");
    }
}
public class DigitalZoo {
    public static void main(String[] args) {
        List<Animal> zoo = new ArrayList<>();
        zoo.add(new Dog());
        zoo.add(new Cat());
        zoo.add(new Bird());

        for (Animal a : zoo) {
            a.makeSound(); // JVM resolves the correct override at RUNTIME
        }
    }
}