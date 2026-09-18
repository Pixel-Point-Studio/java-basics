public class Main {
    public static void main(String[] args) {
        MagicHourglass timerGlass = new MagicHourglass();

        System.out.println("Осталось: " + timerGlass.getSeconds() + " секунд");

        timerGlass.tick();
        timerGlass.tick();
        System.out.println("Осталось: " + timerGlass.getSeconds() + " секунд");

        timerGlass.flip(45);
        System.out.println("Осталось: " + timerGlass.getSeconds() + " секунд");

        timerGlass.stop();
        timerGlass.tick();

        timerGlass.start();

        timerGlass.flip(5);
        System.out.println("Осталось: " + timerGlass.getSeconds() + " секунд");

        timerGlass.start();
    }
}
