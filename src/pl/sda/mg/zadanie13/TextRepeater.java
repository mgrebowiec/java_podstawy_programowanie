package pl.sda.mg.zadanie13;

import pl.sda.mg.util.InUtil;

public class TextRepeater {
    public static void main(String[] args) {
        String text = InUtil.getTextFromUser();
        String[] words = text.split(" ");
        StringBuilder output = new StringBuilder("");
        for (int i = 0; i < words.length; i++) {
            output.append(words[i]).append(" ").append(words[i]);
            if (i < words.length - 1) {
                output.append(" ");
            }
        }

        System.out.println(output);
    }
}
