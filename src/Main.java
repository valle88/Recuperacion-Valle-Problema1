public class Main {
    public static void main(String[] args) {
        Guanchito2000 guanchito2000 = new Guanchito2000("Goyo",123);

        guanchito2000.batteryLevel();
        guanchito2000.turnOn();
        guanchito2000.move();
        guanchito2000.move();
        guanchito2000.turnOff();

        System.out.println(guanchito2000.status());
        guanchito2000.batteryLevel();
        guanchito2000.reload();
        System.out.println(guanchito2000.status());
        guanchito2000.turnOn();
        guanchito2000.move();
        guanchito2000.turnOff();
        guanchito2000.reload();


        System.out.println(guanchito2000.status());

    }
}