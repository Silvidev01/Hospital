package Hospital;

import java.time.LocalDate;
import java.util.Objects;

//this is an abstract class Person//
abstract class Person {
//Fields //
String name;
    String lastname;
    private String address;

    private LocalDate birthDate;

    // constructors

    public Person() {}

    public Person(String name, String lastname, String address, LocalDate birthDate) {
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        this.birthDate = birthDate;
    }


//getters and setters//
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
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public abstract String print();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) && getLastname().equals(person.getLastname()) && getAddress().equals(person.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastname());
    }

    public abstract String showPerson();
}

