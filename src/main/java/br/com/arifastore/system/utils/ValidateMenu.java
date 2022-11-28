package br.com.arifastore.system.utils;

public class ValidateMenu {
    public int menuValidation(String entry, String verifyMenu) {
        int option;

        if(entry.matches(verifyMenu)) {
            option = Integer.parseInt(entry);
        } else {
            option = -1;
        }
        return option;
    }
}
