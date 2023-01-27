package com.example.classBankAccount;

import com.example.classCustomer.Customer;

import java.time.LocalDate;

public class BankAccount {

    private Long id;
    private Double balance;
    private TypeAccount typeAccount;
    private Double cost;
    private Double reward;
    private Customer customer;
    private LocalDate createDate;

    public BankAccount() {
    }

    public BankAccount(Long id, Double balance, TypeAccount typeAccount, Double cost, Double reward, Customer customer, LocalDate createDate) {
        this.id = id;
        this.balance = balance;
        this.typeAccount = typeAccount;
        this.cost = cost;
        this.reward = reward;
        this.customer = customer;
        this.createDate = createDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    public void setTypeAccount(TypeAccount typeAccount) {
        this.typeAccount = typeAccount;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", typeAccount=" + typeAccount +
                ", cost=" + cost +
                ", reward=" + reward +
                ", customer=" + customer +
                ", createDate=" + createDate +
                '}';
    }
}
