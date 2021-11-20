package pl.sda.mg.validations;

public class Person {
    private String name;
    private String pesel;
    private int age;

    public Person(String name, String pesel, int age) {
        this.name = name;
        this.pesel = pesel;
        this.age = age;
        validate();
    }

    public void validate() {
       validatePesel();
        if (age != getAgeFromPesel()) {
            throw new IllegalStateException("Wiek i pesel nie zgadza sie!!!");
        }
    }

    private int getAgeFromPesel() {
        return 20;
    }

    private void validatePesel() {
        //TODO:: reguły walidujące PESEL
        if (!PeselUtil.isValidPesel(pesel)) {
            throw new IllegalStateException("Pesel jest niepoprawny!!!");
        }
    }
}
