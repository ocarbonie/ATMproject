package com.company;

public class ATM extends Account {
    private int withdraw = 0;
    private int deposit = 0;


    //Constructor
    public ATM(){}


    public int getWithdraw() {
        return withdraw;
    }

    public void setWithdraw(int withdraw) {
        this.withdraw = withdraw;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    @Override
    public int getBalance(){
        return (super.getBalance() - this.getWithdraw()) + this.getDeposit() ;
    }
}

