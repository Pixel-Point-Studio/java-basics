/**
 * A small encapsulated timer that can be controlled only through its public API.
 */
public class MagicHourglass {
    private static final int DEFAULT_VALUE = 60;
    private static final int MIN_ALLOWED = 10;
    private static final int MAX_ALLOWED = 60;

    private int remainTime = DEFAULT_VALUE;
    private boolean working = true;

    public int getSeconds() {
        return remainTime;
    }

    public boolean isRunning() {
        return working;
    }

    public void tick() {
        if (!working) {
            System.out.println("⏳ Часы не идут! Переверните их.");
            return;
        }

        if (remainTime > 0) {
            remainTime--;
            System.out.println("⏳ Время идёт... Осталось " + remainTime + " секунд.");
        }

        if (remainTime == 1) {
            working = false;
            System.out.println("❌ Время истекло! Переверните часы, чтобы запустить снова.");
        }
    }

    public void flip(int duration) {
        remainTime = isValidDuration(duration) ? DEFAULT_VALUE : duration;
        working = true;
        System.out.println("🔄 Вы перевернули песочные часы! Времени теперь: "
                + remainTime + " секунд.");
    }

    public void stop() {
        working = false;
        System.out.println("⏳ Часы остановлены.");
    }

    public void start() {
        if (remainTime > 0) {
            working = true;
            System.out.println("▶ Часы снова идут!");
        } else {
            System.out.println("❌ Нельзя запустить часы без переворота! Переверните их.");
        }
    }

    private boolean isValidDuration(int seconds) {
        return seconds > MIN_ALLOWED && seconds <= MAX_ALLOWED;
    }
}
