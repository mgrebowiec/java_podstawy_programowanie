package pl.sda.mg.varargs;

public class VarargsExample {

    public static void main(String[] args) {
        String[] sampleTable = {"a", "b", "c"};
        printVarargsTable(sampleTable);

        System.out.println("----");
        printVarargsTable("first");

        System.out.println("----");
        printVarargsTable("first", "second");

        System.out.println("----");
        printVarargsTable();

        System.out.println("----");
        printVarargs(0, sampleTable);

        System.out.println("----");
        printVarargs(0, "first");

        System.out.println("----");
        printVarargs(0, "first", "second");

        System.out.println("----");
        printVarargs(0);
    }

    private static void printVarargsTable(String ... values) {
        for (String value: values) {
            System.out.println("value: " + value);
        }
    }

    private static void printVarargsTable2(String ... values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }

    private static void printVarargs(int intValue, String ... values) {
        System.out.println("int value: " + intValue);
        printVarargsTable(values);
    }

    // varargs w połączeniu z iinymi argumentami wejściowymi MUSI być zawsze jako OSTATNI argument!!!
//    private static void printVarargs(String ... values, int intValue) {
//
//    }
}
