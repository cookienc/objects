package practice.objects.phonebill;

import practice.objects.Money;

public interface RatePolicy {
    Money calculateFee(final Phone phone);
}
