package pl.sda.mg.zadanie19;

public class Author {
    private String surname;
    private String nationality;

    public Author(String surname, String nationality) {
        this.surname = surname;
        this.nationality = nationality;
    }

    //Setter nie jest nam potrzebny bo nie będziemy modyfikować utworzonych obiektów (przez konstruktor)
//    public void setSurname(String surname) {
//        this.surname = surname;
//    }

    public String getSurname() {
        return surname;
    }

    public String getNationality() {
        return nationality;
    }

    public String getDetails() {
        return "Surname: " + surname + ", nationality: " + nationality;
    }
}
