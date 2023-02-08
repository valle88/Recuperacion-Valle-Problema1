public class Main {
    public static void main(String[] args) {
        Guanchito2000 guanchito2000 = new Guanchito2000("goyo",23);
        System.out.println(guanchito2000.status());
        guanchito2000.batteryLevel();
        System.out.println(guanchito2000.status());
        guanchito2000.move();
        System.out.println(guanchito2000.status());
        guanchito2000.turnOff();
        System.out.println(guanchito2000.status());
        guanchito2000.reload();
        System.out.println(guanchito2000.status());
        guanchito2000.turnOn();
        System.out.println(guanchito2000.status());
        guanchito2000.move();
        System.out.println(guanchito2000.status());
        guanchito2000.reload();
        System.out.println(guanchito2000.status());
    }
}