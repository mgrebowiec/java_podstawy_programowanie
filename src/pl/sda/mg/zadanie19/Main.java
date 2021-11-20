package pl.sda.mg.zadanie19;

public class Main {
    public static void main(String[] args) {
//        examples();
        Author author = new Author("Slowacki", "polska");
        Poem firstPoem = new Poem(author, 10);
        Poem secondPoem = new Poem(author, 15);

        Poem thirdPoem = new Poem(new Author("Mickiewicz", "litwa"), 20);

        Poem[] poems = {firstPoem, secondPoem, thirdPoem, new Poem(new Author("Jankowski", "polska"), 21)};
        printAuthorWithLongestStropheNumbers(poems);

    }

    private static void printAuthorWithLongestStropheNumbers(Poem[] poems) {
        Poem longestPoem = null;
        for (Poem poem: poems) {
            if (longestPoem == null) {
                longestPoem = poem;
                continue;
            }

            if (longestPoem.getStropheNumbers() < poem.getStropheNumbers()) {
                longestPoem = poem;
            }
        }

        System.out.println("Author of the logest poem is: " + longestPoem.getCreator().getSurname());

    }


    private static void examples() {
        Author slowacki = new Author("Slowacki", "Polska");
        System.out.println("slowacki= " + slowacki);
//        slowacki.surname = "Slowacki";
//        slowacki.setSurname("NoName");
        slowacki = new Author("NoName", slowacki.getNationality());

        slowacki = new Author("Slowacki", "Polska");
        System.out.println("slowacki= " + slowacki);
        System.out.println(slowacki.getDetails());
//        slowacki.setSurname("Nowe nazwisko");
        slowacki = new Author("Nowe nazwisko", slowacki.getNationality());
        System.out.println(slowacki.getDetails());

        Author emptyAuthor = null;
        System.out.println("emptyAuthor = " + emptyAuthor);
        emptyAuthor = new Author("Mickiewicz", "Polska");
        System.out.println(emptyAuthor.getDetails());


//        System.out.println("nazwisko dla zmiennej slowacki: " + slowacki.surname);
    }
}
