public class Main {
    public static void main(String[] args) {
        MagicHourglass sandClock = new MagicHourglass();

        System.out.println("Осталось: " + sandClock.getSeconds() + " секунд");

        sandClock.tick();
        sandClock.tick();
        System.out.println("Осталось: " + sandClock.getSeconds() + " секунд");

        sandClock.flip(45);
        System.out.println("Осталось: " + sandClock.getSeconds() + " секунд");

        sandClock.stop();
        sandClock.tick();

        sandClock.start();

        sandClock.flip(5);
        System.out.println("Осталось: " + sandClock.getSeconds() + " секунд");

        sandClock.start();
    }
}
