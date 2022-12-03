package practice.objects.movie.assignResponsibility;

import java.time.DayOfWeek;
import java.time.LocalTime;

public class DiscountConditions {
    private DiscountConditonType type;
    private int sequence;
    private DayOfWeek dayOfWeek;
    private LocalTime startTime;
    private LocalTime endTime;

    public boolean isSatisfiedBy(final Screening screening) {
        if (type == DiscountConditonType.PERIOD) {
            return isSatisfiedByPeriod(screening);
        }

        return isSatisfiedBySequence(screening);
    }

    private boolean isSatisfiedByPeriod(final Screening screening) {
        return dayOfWeek.equals(screening.getWhenScreened().getDayOfWeek()) &&
                startTime.compareTo(screening.getWhenScreened().toLocalTime()) <= 0 &&
                endTime.isAfter(screening.getWhenScreened().toLocalTime());
    }

    private boolean isSatisfiedBySequence(final Screening screening) {
        return sequence == screening.getSequence();
    }
}
