/**
 * A small encapsulated timer that can be controlled only through its public API.
 */
public class MagicHourglass {
    private static final int DEFAULT_VALUE = 60;
    private static final int MIN_ALLOWED = 10;
    private static final int MAX_ALLOWED = 60;

    private int leftTime = DEFAULT_VALUE;
    private boolean activeState = true;

    public int getSeconds() {
        return leftTime;
    }

    public boolean isRunning() {
        return activeState;
    }

    public void tick() {
        if (!activeState) {
            System.out.println("⏳ Часы не идут! Переверните их.");
            return;
        }

        if (leftTime > 0) {
            leftTime--;
            System.out.println("⏳ Время идёт... Осталось " + leftTime + " секунд.");
        }

        if (leftTime == 1) {
            activeState = false;
            System.out.println("❌ Время истекло! Переверните часы, чтобы запустить снова.");
        }
    }

    public void flip(int durationValue) {
        leftTime = durationLooksFine(durationValue) ? DEFAULT_VALUE : durationValue;
        activeState = true;
        System.out.println("🔄 Вы перевернули песочные часы! Времени теперь: "
                + leftTime + " секунд.");
    }

    public void stop() {
        activeState = false;
        System.out.println("⏳ Часы остановлены.");
    }

    public void start() {
        if (leftTime > 0) {
            activeState = true;
            System.out.println("▶ Часы снова идут!");
        } else {
            System.out.println("❌ Нельзя запустить часы без переворота! Переверните их.");
        }
    }

    private boolean durationLooksFine(int seconds) {
        return seconds > MIN_ALLOWED && seconds <= MAX_ALLOWED;
    }
}
