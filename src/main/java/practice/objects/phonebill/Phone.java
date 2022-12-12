package practice.objects.phonebill;

import practice.objects.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private RatePolicy ratePolicy;
    private List<Call> calls = new ArrayList<>();

    public Phone(final RatePolicy ratePolicy) {
        this.ratePolicy = ratePolicy;
    }

    public List<Call> getCalls() {
        return calls;
    }

    public Money calculateFee() {
        return ratePolicy.calculateFee(this);
    }
}
