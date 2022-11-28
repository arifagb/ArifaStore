package br.com.arifastore.system.controller;

import br.com.arifastore.system.utils.ValidateMenu;

public class MenuController {
    public int validationRegexMenu(String entry, String verifyMenu) {

        // Verifica se o valor digitado é um número e se está dentro do menu
        ValidateMenu validate = new ValidateMenu();
        return validate.menuValidation(entry, verifyMenu);
    }
}
