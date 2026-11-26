package advice;

public class DayAdvisor implements Advisor {

    @Override
    public void advise(Day day) {
        switch (day) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(day + ": Складіть список завдань на день і почніть з найважливішого. "
                        + "Робіть короткі перерви кожні 1-2 години.");
                break;
            case FRIDAY:
                System.out.println(day + ": Happy Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(day + ": Рекомендую відвідати Чернівецький ботанічний сад, "
                        + "парк «Жовтневий» або прогулятися центральною вулицею Ольги Кобилянської.");
                break;
        }
    }
}