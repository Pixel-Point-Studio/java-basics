public class Main {
    public static void main(String[] args) {
        MagicHourglass hourglass = new MagicHourglass();

        System.out.println("Осталось: " + hourglass.getTime() + " секунд");

        hourglass.tick();
        hourglass.tick();
        System.out.println("Осталось: " + hourglass.getTime() + " секунд");

        hourglass.flip(45);
        System.out.println("Осталось: " + hourglass.getTime() + " секунд");

        hourglass.stop();
        hourglass.tick();

        hourglass.start();

        hourglass.flip(5);
        System.out.println("Осталось: " + hourglass.getTime() + " секунд");

        hourglass.start();
    }
}
