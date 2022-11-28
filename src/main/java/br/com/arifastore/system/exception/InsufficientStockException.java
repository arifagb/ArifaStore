package br.com.arifastore.system.exception;

public class InsufficientStockException extends Exception {

    private static final long serialVersionUID = 1L;

    public InsufficientStockException() {
        super("Estoque insuficiente. Não é possível realizar esta operação.");
    }
}
