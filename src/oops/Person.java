package oops;

public abstract class Person {
    String name;
    byte age;
    String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public byte getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void greet() {
        System.out.println("Hello Everyone!, My name is "+this.name+" I am " + this.age + " years old. My address is "+this.address);
    }
}
