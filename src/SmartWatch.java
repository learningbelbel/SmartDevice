public class SmartWatch  extends SmartDevice{

    String colorBrasalete;
    double timepoBateria;

    public SmartWatch() {
    }


    public SmartWatch(String modelo, String marca, String color, int almacenamiento, String colorBrasalete, double timepoBateria) {
        super(modelo, marca, color, almacenamiento);
        this.colorBrasalete = colorBrasalete;
        this.timepoBateria = timepoBateria;
    }

    @Override
    public String toString() {
        return "SmartWatch: " +
                "  modelo: " + modelo +
                ", marca: " + marca  +
                ", color: " + color  +
                ", almacenamiento: "  + almacenamiento + "GB" +
                ", colorBrasalete: " + colorBrasalete +
                ", timepoBateria: " + timepoBateria + " hours ";
    }
}
