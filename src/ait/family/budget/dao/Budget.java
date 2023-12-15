package ait.family.budget.dao;

import ait.family.budget.model.Purchase;

import java.time.LocalDate;

public interface Budget {
    boolean addPurchase(Purchase purchase);
    double calcBudget();
    double budgetByPerson(String person);
    double budgetByStore(String store);
    double budgetByPeriod (LocalDate from, LocalDate to);
    double addMoney(double money);
    boolean checkBudget(Purchase purchase);
    double checkMoney(Purchase purchase);
}
