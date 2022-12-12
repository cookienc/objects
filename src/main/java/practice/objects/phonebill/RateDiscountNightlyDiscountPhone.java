package practice.objects.phonebill;

import practice.objects.Money;

import java.time.Duration;

public class RateDiscountNightlyDiscountPhone extends NightlyDiscountPhone {
    private Money discountAmount;

    public RateDiscountNightlyDiscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration seconds, final Money discountAmount) {
        super(nightlyAmount, regularAmount, seconds);
        this.discountAmount = discountAmount;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return fee.minus(discountAmount);
    }
}
