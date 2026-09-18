public class Main {
    public static void main(String[] args) {
        MagicHourglass sandTimer = new MagicHourglass();

        System.out.println("Осталось: " + sandTimer.getSeconds() + " секунд");

        sandTimer.tick();
        sandTimer.tick();
        System.out.println("Осталось: " + sandTimer.getSeconds() + " секунд");

        sandTimer.flip(45);
        System.out.println("Осталось: " + sandTimer.getSeconds() + " секунд");

        sandTimer.stop();
        sandTimer.tick();

        sandTimer.start();

        sandTimer.flip(5);
        System.out.println("Осталось: " + sandTimer.getSeconds() + " секунд");

        sandTimer.start();
    }
}
