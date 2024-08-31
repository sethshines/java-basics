import oops.BankAccount;
import oops.Person;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("Rahul Seth");
//        person.setAge((byte) 31);
//        person.setAddress("Ludhiana, Punjab, India");
//        person.greet();
        BankAccount b1 = new BankAccount(1);
        b1.setName("Rahul Seth");
        b1.setAge((byte) 34);
        b1.setAddress("Ludhiana, Punjab, India");
        b1.deposit(2000);
        b1.withdraw(1000);
        System.out.println("Account Id:" + b1.getAccountId());
        System.out.println("Account Name" + b1.getName());
        System.out.println("Balance:" + b1.getBalance());
        BankAccount b2 = new BankAccount(2,5000);
        b2.deposit(2000);
        b2.withdraw(1000);
        System.out.println("Account Id:" + b2.getAccountId());
        System.out.println("Account Name" + b2.getName());
        System.out.println("Balance:" + b2.getBalance());
    }
}