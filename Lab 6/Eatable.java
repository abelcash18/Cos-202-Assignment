// Interface 1
interface Eatable {
    void eat();
}

// Interface 2
interface Printable {
    void printDetails();
}

// Class implementing both Eatable and Printable
class SmartPet implements Eatable, Printable {
    private String name;

    public SmartPet(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating healthy kibble.");
    }

    @Override
    public void printDetails() {
        System.out.println("Pet Profile Name: " + name);
    }
}