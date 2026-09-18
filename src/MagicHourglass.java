/**
 * A small encapsulated timer that can be controlled only through its public API.
 */
public class MagicHourglass {
    private static final int USUAL_AMOUNT = 60;
    private static final int LOWER_LIMIT = 10;
    private static final int UPPER_LIMIT = 60;

    private int remaining = USUAL_AMOUNT;
    private boolean enabled = true;

    public int getSeconds() {
        return remaining;
    }

    public boolean isRunning() {
        return enabled;
    }

    public void tick() {
        if (!enabled) {
            System.out.println("⏳ Часы не идут! Переверните их.");
            return;
        }

        if (remaining > 0) {
            remaining--;
            System.out.println("⏳ Время идёт... Осталось " + remaining + " секунд.");
        }

        if (remaining == 1) {
            enabled = false;
            System.out.println("❌ Время истекло! Переверните часы, чтобы запустить снова.");
        }
    }

    public void flip(int durationValue) {
        remaining = durationLooksFine(durationValue) ? USUAL_AMOUNT : durationValue;
        enabled = true;
        System.out.println("🔄 Вы перевернули песочные часы! Времени теперь: "
                + remaining + " секунд.");
    }

    public void stop() {
        enabled = false;
        System.out.println("⏳ Часы остановлены.");
    }

    public void start() {
        if (remaining > 0) {
            enabled = true;
            System.out.println("▶ Часы снова идут!");
        } else {
            System.out.println("❌ Нельзя запустить часы без переворота! Переверните их.");
        }
    }

    private boolean durationLooksFine(int seconds) {
        return seconds > LOWER_LIMIT && seconds <= UPPER_LIMIT;
    }
}
