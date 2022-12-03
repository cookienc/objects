package practice.objects.movie.assignResponsibility;

public interface DiscountCondition {
    boolean isSatisfiedBy(final Screening screening);
}
