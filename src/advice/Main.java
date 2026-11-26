package advice;

public class Main {
    public static void main(String[] args) {
        Advisor advisor = new DayAdvisor();

        for (Day day : Day.values()) {
            advisor.advise(day);
        }
    }
}