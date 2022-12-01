package practice.objects.movie;

public interface DiscountCondition {
    boolean isSatisfiedBy(final Screening screening);
}
