package com.example.classBankAccount;
import com.example.classBank.Bank;

import java.util.HashMap;
import java.util.List;

public interface BankAccountService {

    // Buscar TODAS las cuentas
    List<BankAccount> findAll();

    // Buscar cuenta por ID
    BankAccount findById(Long id);

    // Buscar cuenta por NIF
    BankAccount findByNif(String nif);

    // Buscar TODAS las cuentas por tipo de cuenta
    List<BankAccount> findAllByType(TypeAccount value);

    // Buscar TODAS por moneda
    // TODO no estoy seguro de que sea correcto
    List<BankAccount> findAllByCurrency();

    // Agrupar por tipo de cuenta
    HashMap<TypeAccount, List<BankAccount>> accountHashMap = null;

    // Crear cuenta nueva
    BankAccount create(BankAccount bankAccount);

    // Incrementar saldo de una cuenta obtenida por el ID
    BankAccount increaseBalance(BankAccount bankAccountToIncrease);

    // Retira saldo de una cuenta obtenida por ID
    BankAccount decreaseBalance(BankAccount bankAccountToDecrease);

    // Actualizar cuenta
    BankAccount update(BankAccount bankAccountUpdated);

    // Borrar cuenta
    boolean removeById(Long id);

    // Transpaso de una cuenta a otra


}
