package groomingSalon;

public class Pet {
    public String name;
    public int age;
    public String owner;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOwner() {
        return owner;
    }

    public Pet(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }



    @Override
    public String toString() {
        return String.format("%s %d - (%s)",this.name, this.age, this.owner);
    }
}