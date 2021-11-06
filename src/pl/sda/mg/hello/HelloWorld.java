package pl.sda.mg.hello;

import java.math.BigDecimal;

public class HelloWorld {

    String name;
    int typProstyInt = 10;
    double d = 10;
    float f = 20;
    char c = 'c';

    Integer i = Integer.valueOf(0);
    Double dd = Double.valueOf(2);
    Float ff = Float.valueOf(1);

    BigDecimal bd = BigDecimal.valueOf(1);

    String[] ts = {"", " aaa"};
    int[] ti = new int[3];


    HelloWorld() {
        name = "janek";
    }

    private void sample() {
        for (String element : ts) {
            System.out.println(element);
        }

        System.out.println("tablica z intami: ");
        for (int element : ti) {
            System.out.println(element);
        }


        for (int i = 0; i < ti.length; i++) {
            ti[i] = i;
        }

        System.out.println("tablica z intami po uzupelnieniu: ");
        for (int element : ti) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        // glupi komentarz

        HelloWorld hw = new HelloWorld();
        System.out.println(hw.name);
        hw.name = "michał";
        System.out.println(hw.name);
        hw.name = "wojtek";
        System.out.println(hw.name);

        if ( hw.typProstyInt  == 9) {

        }

        if ( hw.name.equals("michał")) {

        }

        hw.name = "michał";
        hw.name = new String("michał");
        if (hw.name.equals("michał")) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        hw.sample();


    }
}
