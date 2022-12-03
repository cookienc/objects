package practice.objects.movie.assignResponsibility;

import practice.objects.movie.Money;

import java.time.Duration;

public class NoneDiscountMovie extends Movie {
    public NoneDiscountMovie(final String title, final Duration runningTime, final Money fee, final DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
    }

    @Override
    public Money calculateDiscountAmount() {
        return Money.ZERO;
    }
}
