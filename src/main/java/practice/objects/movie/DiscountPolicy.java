package practice.objects.movie;

public interface DiscountPolicy {
    Money calculateDiscountAmount(final Screening screening);
}
