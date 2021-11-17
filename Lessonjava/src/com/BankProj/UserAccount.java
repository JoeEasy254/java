package com.BankProj;

public class UserAccount {
//    create fields
int acc_no;
String name;
float amount;
//construct values
void insert(int a,String n,float m){
    this.acc_no = a;
    this.name = n;
    this.amount = m;
}
//handle deposits
void deposit(float am){
float deposited =  this.amount = this.amount + am;
    System.out.println("The deposited amount is: " + deposited);
}
//handle withdrawals
void withdraw(float am){
    if(amount < am){
        System.out.println("Sorry! you have insufficient balance");
    }else{

        float withdrawal =  this.amount = this.amount - am;
        System.out.println("The withdrawn amount is: " + withdrawal);
    }
}
//check the balance
    void checkBalance(){
        System.out.println("Balance is: " + amount);
    }
//void display
    void display(){
        System.out.println(acc_no + " " +name+" "+amount);
    }
    public static void main(String[] args){
UserAccount acc = new UserAccount();
acc.insert(1111111111,"sara",4683642);
acc.deposit(500000);
acc.withdraw(4500000);
System.out.println("-------------------");
acc.display();
acc.checkBalance();

    }
}
