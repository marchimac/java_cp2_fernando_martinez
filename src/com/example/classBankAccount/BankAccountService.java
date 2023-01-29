package com.example.classBankAccount;

import java.util.HashMap;
import java.util.Map;
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
    // TODO no se que debo usar como argumento
    List<BankAccount> findAllByCurrency();

    // Agrupar por tipo de cuenta
    Map<TypeAccount, List<BankAccount>> accountHashMap = new HashMap<>();

    // Crear cuenta nueva
    BankAccount create(BankAccount bankAccount);

    // Incrementar saldo de una cuenta obtenida por el ID
    BankAccount enterBalance(BankAccount bankAccountToEnter);

    // Retira saldo de una cuenta obtenida por ID
    BankAccount withdrawBalance(BankAccount bankAccountToWithdraw);

    // Actualizar cuenta
    BankAccount update(BankAccount bankAccountUpdated);

    // Borrar cuenta
    boolean removeById(Long id);


    // Traspaso de una cuenta a otra
    /**
     * Trasferencia entre cuentas
     * @param amount ES LA CANTIDAD QUE SE DESEA TRANSFERIR
     * @param id ES EL ID DE LA CUENTA A DONDE SE DESEA ENVIAR LA CANTIDAD
     * @return LLAMAMOS A withdrawBalance Y DESPUÉS A enterBalance
     */
    boolean transfer(Double amount, BankAccount id);

}
