import java.util.ArrayList;

public class Guanchito2000 implements Robot {
    private String nombre;
    private float maxBattery ;
    private float energy;
    private ArrayList<String>movemenList;

    public Guanchito2000(String nombre, float energy) {
        this.nombre = nombre;
        this.maxBattery = 100f;
        this.energy = maxBattery;
        this.movemenList = new ArrayList<>();
    }

    @Override
    public float batteryLevel() {
        return energy;
    }

    @Override
    public void reload() {
        energy += maxBattery;
    }

    @Override
    public void turnOn() {
        if (energy >=5){
            energy -= energy +0.05f;
            movemenList.add("Turn On");
        }else{
            System.out.println("not enough energy to turn on");
        }
    }

    @Override
    public void move() {
        if (energy >= 10){
            energy -= energy * 0.10f;
            movemenList.add("Move");
        }else{
            System.out.println("Not enouhg energy to Robot");
        }

    }

    @Override
    public void turnOff() {
        movemenList.add("turn off");
    }

    @Override
    public String status() {
        StringBuilder sb = new StringBuilder();
        sb.append("El Robot").append(nombre).append("tiene un nivel de energia: ").append(energy).append(" y ha ejecutado " +
                "los siguientes movimientos:\n ");
        for (int i = 0; i< movemenList.size(); i++){
            sb.append("Movimiento ").append(i + 1).append(": ").append(movemenList.get(i)).append("\n");
        }
        return sb.toString();
    }
}
