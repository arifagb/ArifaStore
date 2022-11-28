package br.com.arifastore.system.data;

import br.com.arifastore.system.data.interfaces.DataInterface;
import br.com.arifastore.system.model.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionData implements DataInterface {

    public static List<Transaction> list = new ArrayList<>();

    @Override
    public void save(Object object) {
        list.add((Transaction) object);
    }

    @Override
    public List<Transaction> findAll() {
        return list;
    }
}
