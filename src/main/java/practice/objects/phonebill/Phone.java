package practice.objects.phonebill;

import practice.objects.Money;

import java.time.Duration;

public class Phone extends AbstractPhone {
    private Money amount;
    private Duration seconds;

    public Phone(final Money amount, final Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    public Money getAmount() {
        return amount;
    }

    public Duration getSeconds() {
        return seconds;
    }

    @Override
    protected Money calculateCallFee(final Call call) {
        return amount.times(call.getDuration().getSeconds() / seconds.getSeconds());
    }
}
