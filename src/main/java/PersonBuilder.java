public class PersonBuilder {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        Person person;
        if (name == null || surname == null) {
            throw new IllegalStateException("Не указано имя/фамилия ");
        } else if (age > 200 || age < 0) {
            throw new IllegalArgumentException("Возраст указан некорректно ");
        } else {
            person = new Person(name, surname, age, address);
        }
        return person;
    }
}