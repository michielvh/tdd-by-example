package guru.springframework;

public class Sum implements Expression{

    Money augmend;
    Money addmend;

    public Sum(Money augmend, Money addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    //go from 2 money objects to 1
    public Money reduce(String to){
        int amount = augmend.amount+addmend.amount;
        return new Money(amount,to);

    }
}
