package model;
import java.util.Objects;

public class Human {
    protected String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    protected String surname;
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    protected String patronymic;
    public String getPatronymic() {
        return patronymic;
    }
    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    protected Sex sex;
    public Sex getSex() {
        return sex;
    }
    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {

        return String.format("Human{name='%s', surname='%s', patronymic='%s', sex=%s}",
                name, surname, patronymic, sex);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (!(o instanceof Human human)) return false;

        return Objects.equals(name, human.name) &&
                Objects.equals(surname, human.surname) &&
                Objects.equals(patronymic, human.patronymic) &&
                sex == human.sex;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, patronymic, sex);
    }
}

