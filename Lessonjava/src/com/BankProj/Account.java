package com.BankProj;

public class Account {
//    have a field that will take the amount
    float amount;
//    have a field that will take the user account name
    String AccName;
//    have a field that will take the account number
    long AccNo;
//    constructor
    Account(String name,int AccounNumber){
        this.amount = 0;
        this.AccName = name;
        this.AccNo = AccounNumber;

    }

//    get the account name
    public void getAccName(){
        System.out.println("The account name is: " + this.AccName);
    }

//    get the Account number
public void getAccNumber(){
    System.out.println("The account number is: " + this.AccNo);
}

//    handle deposits

    void depositAmount(int deposited){
      float dp =  this.amount = this.amount + deposited;
        System.out.println("Account Name: " + AccName);
        System.out.println("Account Number: " + AccNo);
        System.out.println("The amount deposited is: "+"Ksh "+dp);
        System.out.println("_________________________________");
    }

//    handle withdrawals
    void withdrawAmount(int withdrawal){
//        check if amount is less than withdrawal amount
        if(amount < withdrawal){
          System.out.println("sorry! you have insufficient balance to withdraw");
            System.out.println("_________________________________");
        }else{
            System.out.println("Account Name: " + AccName);
            System.out.println("Account Number: " + AccNo);
            float wd = withdrawal;
            System.out.println("The withdrawal amount is: "+"Ksh "+wd);
            System.out.println("_________________________________");}
    }

    //    get the amount in account
    public void getAmount(){
        System.out.println("Amount in your account is: " +"Ksh "+this.amount);
    }

    public static void main(String[] args){
//        create an instance of the Account
        Account Accstatement = new Account("joseph muchene",763766273);

//        deposit amount
        Accstatement.depositAmount(50000);

//        withdraw amount
        Accstatement.withdrawAmount(5000);
        //        get the amount
        Accstatement.getAmount();

    }
}
