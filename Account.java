package Bank;

class Account {
  String account_holder_name;
  String account_number;
}

class LoanAccount extends Account {
  LoanAccount(String account_holder_name,String account_number) {
    this.account_holder_name=account_holder_name;
    this.account_number=account_number;
  }

  public void display() {
    System.out.println("In loan account");
    System.out.println("Account name is :"+account_holder_name);
    System.out.println("Account number is :"+account_number);
  }
}

class SavingsAccount extends Account{
  SavingsAccount(String account_holder_name,String account_number) {
    this.account_holder_name=account_holder_name;
    this.account_number=account_number;
  }

  public void display() {
    System.out.println("In Savings account");
    System.out.println("Account name is :"+account_holder_name);
    System.out.println("Account number is :"+account_number);
  }
}

class CurrentAccount extends Account{
  CurrentAccount(String account_holder_name,String account_number) {
    this.account_holder_name=account_holder_name;
    this.account_number=account_number;
  }

  public void display() {
    System.out.println("In Current account");
    System.out.println("Account name is :"+account_holder_name);
    System.out.println("Account number is :"+account_number);
  }
}

class Main{
  public static void main(String[] args) {
    SavingsAccount sa =new SavingsAccount("java","xyzzzz");
    CurrentAccount ca =new CurrentAccount("python","bnvzxm");
    LoanAccount la=new LoanAccount("c++","pyvbxz");
    sa.display();
    ca.display();
    la.display();
  }
}
     


 

