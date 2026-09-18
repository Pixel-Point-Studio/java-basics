/**
 * A small encapsulated timer that can be controlled only through its public API.
 */
public class MagicHourglass {
    private static final int DEFAULT_SECONDS = 60;
    private static final int MIN_SECONDS = 10;
    private static final int MAX_SECONDS = 60;

    private int secondsLeft = DEFAULT_SECONDS;
    private boolean running = true;

    public int getTime() {
        return secondsLeft;
    }

    public boolean isRunning() {
        return running;
    }

    public void tick() {
        if (!running) {
            System.out.println("⏳ Часы не идут! Переверните их.");
            return;
        }

        if (secondsLeft > 0) {
            secondsLeft--;
            System.out.println("⏳ Время идёт... Осталось " + secondsLeft + " секунд.");
        }

        if (secondsLeft == 0) {
            running = false;
            System.out.println("❌ Время истекло! Переверните часы, чтобы запустить снова.");
        }
    }

    public void flip(int seconds) {
        secondsLeft = isValidDuration(seconds) ? seconds : DEFAULT_SECONDS;
        running = true;
        System.out.println("🔄 Вы перевернули песочные часы! Времени теперь: "
                + secondsLeft + " секунд.");
    }

    public void stop() {
        running = false;
        System.out.println("⏳ Часы остановлены.");
    }

    public void start() {
        if (secondsLeft > 0) {
            running = true;
            System.out.println("▶ Часы снова идут!");
        } else {
            System.out.println("❌ Нельзя запустить часы без переворота! Переверните их.");
        }
    }

    private boolean isValidDuration(int seconds) {
        return seconds >= MIN_SECONDS && seconds <= MAX_SECONDS;
    }
}
