package practice.objects.phonebill;

import java.time.Duration;
import java.time.LocalDateTime;

public class Call {
    private DateTimeInterval interval;

    public Call(final LocalDateTime from, final LocalDateTime to) {
        this.interval = DateTimeInterval.of(from, to);
    }

    public Duration getDuration() {
        return this.interval.duration();
    }

    public LocalDateTime getFrom() {
        return interval.getFrom();
    }

    public LocalDateTime getTo() {
        return interval.getTo();
    }

    public DateTimeInterval getInterval() {
        return interval;
    }
}
