package practice.objects.lecture;

public class Grade {
    private String name;
    private int upper;
    private int lower;

    public Grade(final String name, final int upper, final int lower) {
        this.name = name;
        this.upper = upper;
        this.lower = lower;
    }

    public String getName() {
        return name;
    }

    public boolean isName(final String name) {
        return this.name.equals(name);
    }

    public boolean include(final int score) {
        return score >= lower && score <= upper;
    }
}
