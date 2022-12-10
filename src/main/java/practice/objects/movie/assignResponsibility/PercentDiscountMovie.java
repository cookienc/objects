package practice.objects.movie.assignResponsibility;

import practice.objects.Money;

import java.time.Duration;

public class PercentDiscountMovie extends Movie {
    private double percent;

    public PercentDiscountMovie(final String title, final Duration runningTime, final Money fee, final double percent, final DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.percent = percent;
    }

    @Override
    public Money calculateDiscountAmount() {
        return getFee().times(percent);
    }
}
