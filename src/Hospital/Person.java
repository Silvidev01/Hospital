package Hospital;

import java.util.Objects;

//this is an abstract class Person//
abstract class Person {

    private String name;
    private String lastname;
    private String address;
    private int age;
    public Person (){name="";lastname="";address="";age=0;}
    public Person (String name, String lastname, String address, int age) { this.name = name; this.lastname = lastname; this.age = age; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
}
    public String getAddress(){
    return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age=age;
    }
    public abstract String print();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() && getName().equals(person.getName()) && getLastname().equals(person.getLastname()) && getAddress().equals(person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastname(), getAge());
    }


    }
}
