package practice.objects.phonebill;

import practice.objects.Money;

import java.time.Duration;

public class RateDiscountableAndTaxableNightlyDiscountPhone extends RateDiscountNightlyDiscountPhone {
    private double taxRate;

    public RateDiscountableAndTaxableNightlyDiscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration seconds, final Money discountAmount, final double taxRate) {
        super(nightlyAmount, regularAmount, seconds, discountAmount);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return super.afterCalculated(fee).plus(fee.times(taxRate));
    }
}
