public class Main {
    public static void main(String[] args) {
        MagicHourglass glassTimer = new MagicHourglass();

        System.out.println("Осталось: " + glassTimer.getSeconds() + " секунд");

        glassTimer.tick();
        glassTimer.tick();
        System.out.println("Осталось: " + glassTimer.getSeconds() + " секунд");

        glassTimer.flip(45);
        System.out.println("Осталось: " + glassTimer.getSeconds() + " секунд");

        glassTimer.stop();
        glassTimer.tick();

        glassTimer.start();

        glassTimer.flip(5);
        System.out.println("Осталось: " + glassTimer.getSeconds() + " секунд");

        glassTimer.start();
    }
}
