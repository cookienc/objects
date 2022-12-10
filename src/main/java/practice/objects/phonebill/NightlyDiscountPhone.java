package practice.objects.phonebill;

import practice.objects.Money;

import java.time.Duration;

public class NightlyDiscountPhone extends Phone {
    private static final int LATE_NIGHT_HOUR = 22;

    private Money nightlyAmount;

    public NightlyDiscountPhone(final Money amount, final Duration seconds, final double taxRate, final Money nightlyAmount) {
        super(amount, seconds, taxRate);
        this.nightlyAmount = nightlyAmount;
    }

    @Override
    public Money calculateFee() {
        final Money result = super.calculateFee();

        Money nightlyFee = Money.ZERO;
        for (Call call : getCalls()) {
            if (call.getFrom().getHour() >= LATE_NIGHT_HOUR) {
                nightlyFee = nightlyFee.plus(
                        getAmount().minus(nightlyAmount).times(
                                call.getDuration().getSeconds() / getSeconds().getSeconds()
                        )
                );
            }
        }

        return result.minus(nightlyFee.plus(nightlyFee.times(getTaxRate())));
    }
}
