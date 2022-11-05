public class Main {
    public static void main(String[] args) {
        Person father = new PersonBuilder()
                .setName("John")
                .setSurname("Smith")
                .setAge(50)
                .setAddress("Los Angeles")
                .build();
        Person son = father.newChildBuilder()
                .setName("Jack")
                .setAge(25)
                .build();
        father.happyBirthday();
        System.out.println(father);
        System.out.println(son);
    }
}