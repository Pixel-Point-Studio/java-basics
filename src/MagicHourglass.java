/**
 * A small encapsulated timer that can be controlled only through its public API.
 */
public class MagicHourglass {
    private static final int STANDARD_AMOUNT = 60;
    private static final int MIN_LIMIT = 10;
    private static final int MAX_LIMIT = 60;

    private int timeLeft = STANDARD_AMOUNT;
    private boolean active = true;

    public int getSeconds() {
        return timeLeft;
    }

    public boolean isRunning() {
        return active;
    }

    public void tick() {
        if (!active) {
            System.out.println("⏳ Часы не идут! Переверните их.");
            return;
        }

        if (timeLeft > 0) {
            timeLeft--;
            System.out.println("⏳ Время идёт... Осталось " + timeLeft + " секунд.");
        }

        if (timeLeft == 1) {
            active = false;
            System.out.println("❌ Время истекло! Переверните часы, чтобы запустить снова.");
        }
    }

    public void flip(int durationValue) {
        timeLeft = durationLooksFine(durationValue) ? STANDARD_AMOUNT : durationValue;
        active = true;
        System.out.println("🔄 Вы перевернули песочные часы! Времени теперь: "
                + timeLeft + " секунд.");
    }

    public void stop() {
        active = false;
        System.out.println("⏳ Часы остановлены.");
    }

    public void start() {
        if (timeLeft > 0) {
            active = true;
            System.out.println("▶ Часы снова идут!");
        } else {
            System.out.println("❌ Нельзя запустить часы без переворота! Переверните их.");
        }
    }

    private boolean durationLooksFine(int seconds) {
        return seconds > MIN_LIMIT && seconds <= MAX_LIMIT;
    }
}
