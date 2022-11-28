package br.com.arifastore.system;

import br.com.arifastore.system.communication.MainMenu;
import br.com.arifastore.system.exception.InsufficientStockException;
import br.com.arifastore.system.exception.InvalidSaleValueException;
import br.com.arifastore.system.exception.ProductNotFoundException;

/**
 * @author Isaque Arifa
 * @version 1.0
 * @since 11/11/2022
 */

public class Main {
    public static void main( String[] args ) throws InvalidSaleValueException, ProductNotFoundException, InsufficientStockException {

        MainMenu menu = new MainMenu();
    }
}
