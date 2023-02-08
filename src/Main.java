public class Main {
    public static void main(String[] args) {
        Guanchito2000 guanchito2000 = new Guanchito2000("goyo",23);

        guanchito2000.batteryLevel();
        guanchito2000.move();
        guanchito2000.turnOff();
        guanchito2000.reload();
        guanchito2000.turnOn();

        System.out.println(guanchito2000.status());
    }
}