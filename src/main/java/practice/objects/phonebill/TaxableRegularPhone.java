package practice.objects.phonebill;

import practice.objects.Money;

import java.time.Duration;

public class TaxableRegularPhone extends RegularPhone {
    private double taxRate;

    public TaxableRegularPhone(final Money amount, final Duration seconds, final double taxRate) {
        super(amount, seconds);
        this.taxRate = taxRate;
    }

    @Override
    protected Money afterCalculated(final Money fee) {
        return fee.plus(fee.times(taxRate));
    }
}
