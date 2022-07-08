public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder setName(final String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(final String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(final int age) {
        this.age = age;
        if (age < 0) {
            throw new IllegalStateException("Возраст некорректен");
        }
        return this;
    }

    public PersonBuilder setAddress(final String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || name.isEmpty()) {
            throw new IllegalStateException("Имя незаполненно");
        }
        if (surname == null || surname.isEmpty()) {
            throw new IllegalStateException("Фамилия незаполненна");
        }
        return new Person(name, surname, age, address);
    }
}