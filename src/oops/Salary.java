package oops;

import java.util.Objects;

public class Salary {
    int monthlyAmount;
    String bankAccountNo;
    String currency;

    Salary(int monthlyAmount, String bankAccountNo, String currency){
        this.currency = !Objects.equals(currency, "") ? currency  : "INR";
    }
}
