package students;

import java.util.Objects;

public class Human {
    private String name;
    private String lastName;
    Gender gender;

    public Human(String name, String lastName, Gender gender) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(name, human.name) && Objects.equals(lastName, human.lastName) && gender == human.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, gender);
    }

    @Override
    public String toString() {
        return "Human : \n |Name = " + name + "| \n |Lastname = " + lastName + "| \n |Gender = " + gender + "|";
    }
}
