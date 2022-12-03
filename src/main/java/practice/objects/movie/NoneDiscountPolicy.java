package practice.objects.movie;

public class NoneDiscountPolicy extends DiscountPolicy {
    @Override
    protected Money getDiscountAmount(final Screening screening) {
        return Money.ZERO;
    }
}
