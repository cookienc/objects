package practice.objects.movie.dataPriority;

import practice.objects.movie.Money;

public class ReservationAgency {
    public Reservation rserve(final Screening screening, final Customer customer, final int audienceCount) {
        final Money fee = screening.calculateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
