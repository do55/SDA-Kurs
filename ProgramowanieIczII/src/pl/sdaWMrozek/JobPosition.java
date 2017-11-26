package pl.sdaWMrozek;

public enum JobPosition {

    MANAGER(10), ANALYST(8), ARCHITECT(6), SENIOR_DEVELOPER(4), DEVELOPER(2), JUNIOR_DEVELOPER(0), TESTER(5);

    private JobPosition(int priority) {  //wywołanie kontstruktora, musi być prywatny
        this.priority = priority;
    }

    private int priority;

    public int getPriority() {
        return priority;
    }
}
