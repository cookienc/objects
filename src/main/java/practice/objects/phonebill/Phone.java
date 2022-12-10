package practice.objects.phonebill;

import practice.objects.Money;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static practice.objects.phonebill.Phone.PhoneType.REGULAR;

public class Phone {
    private static final int LAT_NIGHT_HOUR = 22;

    enum PhoneType {
        REGULAR,
        NIGHTLY
    }

    private PhoneType type;

    private Money amount;
    private Money nightlyAmount;
    private Money regularAmount;
    private Duration seconds;
    private List<Call> calls = new ArrayList<>();

    public Phone(final Money amount, final Duration seconds) {
        this.amount = amount;
        this.seconds = seconds;
    }

    public Phone(final Money nightlyAmount, final Money regularAmount, final Duration seconds) {
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
    }

    public Phone(final Money amount, final Money nightlyAmount, final Money regularAmount, final Duration seconds, final List<Call> calls) {
        this.amount = amount;
        this.nightlyAmount = nightlyAmount;
        this.regularAmount = regularAmount;
        this.seconds = seconds;
        this.calls = calls;
    }

    public Money calculateFee() {
        Money result = Money.ZERO;

        for (Call call : calls) {
            if (type == REGULAR) {
                result = result.plus(
                        amount.times(call.getDuration().getSeconds() / seconds.getSeconds())
                );
            } else {
                if (call.getFrom().getHour() >= LAT_NIGHT_HOUR) {
                    result = result.plus(
                            nightlyAmount.times(call.getDuration().getSeconds() / seconds.getSeconds())
                    );
                } else {
                    result = result.plus(
                            regularAmount.times(call.getDuration().getSeconds() / seconds.getSeconds())
                    );
                }
            }
        }

        return result;
    }
}
