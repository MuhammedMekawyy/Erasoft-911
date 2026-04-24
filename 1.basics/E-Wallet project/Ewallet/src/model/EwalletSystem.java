package model;

import java.util.ArrayList;

public class EwalletSystem {
    private final String name="EraSoft E wallet";
    private ArrayList<Account>Accounts=new ArrayList<>();

    public ArrayList<Account> getAccounts() {
        return Accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        Accounts = accounts;
    }

    public String getName() {
        return name;
    }
}