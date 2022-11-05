public class Person {

    protected final String name;
    protected final String surname;
    protected int age;
    protected String address;

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public boolean hasAge() {
        if (age == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean hasAddress() {
        if (address == null) {
            return false;
        } else {
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void happyBirthday() {
        if (age != 0) {
            age += 1;
        }
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder personBuilder = new PersonBuilder()
                .setSurname(surname)
                .setAddress(address);
        return personBuilder;
    }

    public String toString() {
        if (age != 0 && address != null) {
            return "Имя = " + name + " Фамилия = " + surname + " Возраст = " + age + " Адрес = " + address;
        } else if (age != 0) {
            return "Имя = " + name + " Фамилия = " + surname + " Возраст = " + age + " Адрес = " + "N/A";
        } else if (address != null) {
            return "Имя = " + name + " Фамилия = " + surname + " Возраст = " + "N/A" + " Адрес = " + address;
        } else {
            return "Имя = " + name + " Фамилия = " + surname + " Возраст = " + "N/A" + " Адрес = " + "N/A";
        }
    }
}