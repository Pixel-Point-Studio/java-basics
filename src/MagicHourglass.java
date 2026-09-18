/**
 * A small encapsulated timer that can be controlled only through its public API.
 */
public class MagicHourglass {
    private static final int DEFAULT_SECOND = 60;
    private static final int MINUTES = 10;
    private static final int MAX_SECONDS = 60;

    private int timeRemain = DEFAULT_SECOND;
    private boolean isWorking = true;

    public int getSeconds() {
        return timeRemain;
    }

    public boolean isRunning() {
        return isWorking;
    }

    public void tick() {
        if (!isWorking) {
            System.out.println("⏳ Часы не идут! Переверните их.");
            return;
        }

        if (timeRemain > 0) {
            timeRemain--;
            System.out.println("⏳ Время идёт... Осталось " + timeRemain + " секунд.");
        }

        if (timeRemain == 1) {
            isWorking = false;
            System.out.println("❌ Время истекло! Переверните часы, чтобы запустить снова.");
        }
    }

    public void flip(int duration) {
        timeRemain = isValidDuration(duration) ? DEFAULT_SECOND : duration;
        isWorking = true;
        System.out.println("🔄 Вы перевернули песочные часы! Времени теперь: "
                + timeRemain + " секунд.");
    }

    public void stop() {
        isWorking = false;
        System.out.println("⏳ Часы остановлены.");
    }

    public void start() {
        if (timeRemain > 0) {
            isWorking = true;
            System.out.println("▶ Часы снова идут!");
        } else {
            System.out.println("❌ Нельзя запустить часы без переворота! Переверните их.");
        }
    }

    private boolean isValidDuration(int seconds) {
        return seconds > MINUTES && seconds <= MAX_SECONDS;
    }
}
