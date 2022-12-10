package practice.objects.movie.assignResponsibility;

import practice.objects.Money;

import java.time.Duration;

public class AmountDiscountMovie extends Movie {
    private Money discountAmount;

    public AmountDiscountMovie(final String title, final Duration runningTime, final Money fee, final Money discountAmount, final DiscountCondition... discountConditions) {
        super(title, runningTime, fee, discountConditions);
        this.discountAmount = discountAmount;
    }

    @Override
    public Money calculateDiscountAmount() {
        return discountAmount;
    }
}
