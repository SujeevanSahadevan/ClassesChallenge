package com.sujeevan;

public class Main {

    public static void main(String[] args)
    {
        //Bank Customer = new Bank();

        Bank Customer = new Bank("AAA111",0,
                "Ravi","Emailaddress","0000");

        Customer.setAccountNo("AAA1111");
        Customer.setBalance(0);
        Customer.setCustomerName("Ravi");
        Customer.setEmail("Email address");
        Customer.setPhoneNO("000000");

        System.out.println(Customer.getAccountNo());
        System.out.println("Available blance is "+Customer.getBalance());
        System.out.println(Customer.getCustomerName());
        System.out.println(Customer.getEmail());
        System.out.println(Customer.getPhoneNO());

       Customer.deposit(1000);
       Customer.deposit(4000);

        //System.out.println("Now balance = " + Customer.getBalance());

        Customer.withdraw(5000);
        //System.out.println("Now balance = " + Customer.getBalance());


        Bank Customer2 = new Bank("tim","tim@email.com","0000");
        System.out.println("Phone number " +Customer2.getPhoneNO()+
       "  Name " + Customer2.getCustomerName() );


        Bank Customer3=new Bank();
        System.out.println("Customer name" + Customer3.getCustomerName()
        +"Customer Ac no " + Customer3.getAccountNo());
        System.out.println();
        System.out.println();

        VipCustomer Vip1 = new VipCustomer();
        System.out.println("VCustomer Name " + Vip1.getName()+
        " VLimit " +Vip1.getLimit()+" VEmail " +Vip1.getEmail());


        VipCustomer Vip2 = new VipCustomer("Sujeevan",1000.00);
        System.out.println("VCustomer Name " + Vip2.getName()+
                " VLimit " +Vip2.getLimit()+" VEmail " +Vip2.getEmail());

        VipCustomer Vip3 = new VipCustomer("Don",20000,"Don@");
        System.out.println("VCustomer Name " + Vip3.getName()+
                " VLimit " +Vip3.getLimit()+" VEmail " +Vip3.getEmail());


        System.out.println();
        System.out.println();

        Bank Customer4= new Bank("Don","Don@email"
                ,"00");

        System.out.println(Customer4.getAccountNo());
        System.out.println("Available blance is "+Customer4.getBalance());
        System.out.println(Customer4.getCustomerName());
        System.out.println(Customer4.getEmail());
        System.out.println(Customer4.getPhoneNO());

        Customer4.withdraw(100.55);




    }


}
