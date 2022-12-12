package practice.objects.phonebill;

import practice.objects.Money;

import java.util.ArrayList;
import java.util.List;

public abstract class Phone {
    private List<Call> calls = new ArrayList<>();

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            result = result.plus(calculateCallFee(call));
        }

        return result;
    }

    protected Money afterCalculated(final Money fee) {
        return fee;
    }

    protected abstract Money calculateCallFee(final Call call);
}
