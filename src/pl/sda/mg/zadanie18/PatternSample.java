package pl.sda.mg.zadanie18;

import pl.sda.mg.util.InUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternSample {
    public static void main(String[] args) {
        String text = InUtil.getTextFromUser();
        Pattern p = Pattern.compile(".*a{1,} psik.*");
        Matcher m = p.matcher(text);
        System.out.println("wynik: " + m.matches());
    }
}
