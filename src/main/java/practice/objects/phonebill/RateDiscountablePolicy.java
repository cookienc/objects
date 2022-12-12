package practice.objects.phonebill;

import practice.objects.Money;

public class RateDiscountablePolicy extends AdditionalRatePolicy {
    private Money discountAmount;

    public RateDiscountablePolicy(final RatePolicy next, final Money discountAmount) {
        super(next);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return fee.minus(discountAmount);
    }
}
