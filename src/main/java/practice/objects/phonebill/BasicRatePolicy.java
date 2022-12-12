package practice.objects.phonebill;

import practice.objects.Money;

public abstract class BasicRatePolicy implements RatePolicy {
    @Override
    public Money calculateFee(final Phone phone) {
        Money result = Money.ZERO;

        for (Call call : phone.getCalls()) {
            result.plus(calculateCallFee(call));
        }

        return result;
    }

    protected abstract Money calculateCallFee(final Call call);
}
