package com.example.classBankAccount;

import java.util.List;

public class BankAccountServiceImpl implements BankAccountService {
    @Override
    public List<BankAccount> findAll() { return null; }

    @Override
    public BankAccount findById(Long id) {
        return null;
    }

    @Override
    public BankAccount findByNif(String nif) {
        return null;
    }

    @Override
    public List<BankAccount> findAllByType(TypeAccount value) {
        return null;
    }

    @Override
    public List<BankAccount> findAllByCurrency() {
        return null;
    }

    @Override
    public BankAccount create(BankAccount bankAccount) {
        return null;
    }

    @Override
    public BankAccount enterBalance(BankAccount bankAccountToEnter) {
        return null;
    }

    @Override
    public BankAccount withdrawBalance(BankAccount bankAccountToWithdraw) {
        return null;
    }

    @Override
    public BankAccount update(BankAccount bankAccountUpdated) {
        return null;
    }

    @Override
    public boolean removeById(Long id) {
        return false;
    }

    @Override
    public boolean transfer(Double amount, BankAccount id) {
        return false;
    }
}
