package pl.sda.mg.validations;

public class PeselUtil {

    public static boolean isValidPesel(String pesel) {
        //TODO:: reguły walidujące PESEL
        if (pesel == null || pesel.isBlank() || pesel.length() != 11) {
            return false;
        }

        return true;
    }
}