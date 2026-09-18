public class Main {
    public static void main(String[] args) {
        MagicHourglass hourTimer = new MagicHourglass();

        System.out.println("Осталось: " + hourTimer.getSeconds() + " секунд");

        hourTimer.tick();
        hourTimer.tick();
        System.out.println("Осталось: " + hourTimer.getSeconds() + " секунд");

        hourTimer.flip(45);
        System.out.println("Осталось: " + hourTimer.getSeconds() + " секунд");

        hourTimer.stop();
        hourTimer.tick();

        hourTimer.start();

        hourTimer.flip(5);
        System.out.println("Осталось: " + hourTimer.getSeconds() + " секунд");

        hourTimer.start();
    }
}
