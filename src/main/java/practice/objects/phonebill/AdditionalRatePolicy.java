package practice.objects.phonebill;

import practice.objects.Money;

public abstract class AdditionalRatePolicy implements RatePolicy {
    private RatePolicy next;

    public AdditionalRatePolicy(final RatePolicy next) {
        this.next = next;
    }

    @Override
    public Money calculateFee(final Phone phone) {
        final Money fee = next.calculateFee(phone);
        return afterCalculated(fee);
    }

    protected abstract Money afterCalculated(final Money fee);
}
