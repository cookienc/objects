package practice.objects.phonebill;

import practice.objects.Money;

import java.time.Duration;

public class TaxableNightlyDiscountPhone extends NightlyDiscountPhone {
    private double taxRate;

    public TaxableNightlyDiscountPhone(final Money nightlyAmount, final Money regularAmount, final Duration seconds, final double taxRate) {
        super(nightlyAmount, regularAmount, seconds);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
