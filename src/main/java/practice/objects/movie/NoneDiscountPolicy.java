package practice.objects.movie;

import practice.objects.Money;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(final Screening screening) {
        return Money.ZERO;
    }
}
