package com.sujeevan;

public  class Bank
{
    private String AccountNo;
    private double balance;
    private String CustomerName;
    private String email;
    private String phoneNO;

  public Bank() {
      this("Default no",0000.00,"defaultname",
              "default email","default phone number");
      System.out.println("Empty Constructor Called");
  }





 public Bank (String AccountNo , double balance,String CustomerName,
              String email,String phoneNO)
//Above Bank is a CONSTRUCTOR

 {
this.AccountNo=AccountNo;
this.balance=balance;
this.CustomerName=CustomerName;
this.email=email;
this.phoneNO=phoneNO;
 }

 public Bank(String CustomerName,String email,String phoneNO)
 {
     this("99999",100.55,CustomerName,email,phoneNO);
 }


    //SETTERS

    public void setAccountNo(String AccountNo)
    {

       this.AccountNo = AccountNo;
    }


    public double getBalance()
    {
        //System.out.println("Available balance is " + balance);
        return balance;
    }

    public void setBalance(double balance)
    {
        //System.out.println();
        this.balance = balance;
    }

    public void setCustomerName(String CustomerName)
    {
        this.CustomerName = CustomerName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPhoneNO(String phoneNO)
    {
        this.phoneNO = phoneNO;
    }



    //GETTERS


    public String getAccountNo()
    {
        return AccountNo;
    }



    public String getCustomerName()
    {
        return CustomerName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPhoneNO()
    {
        return phoneNO;
    }

   public double deposit(double amount)
   {
       balance = balance + amount;
       System.out.println("Deposit of " +amount +" Made "
               + " Now Available Balance is " + balance);
       return balance;

   }



   public void withdraw(double withamount)
   {
       if (withamount>balance)
           System.out.println("You Dont have enough balance");
       else
       {
           balance = balance - withamount;
           System.out.println("After withdrawing "
                   + withamount + "Current balance is " + balance);
       }
       //return balance;
   }
}


