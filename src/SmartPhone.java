public class SmartPhone  extends SmartDevice{

    String camaraResolution;
    boolean is5G;

    public SmartPhone(String modelo, String marca, String color, int almacenamiento,String camaraResolution, boolean  is5G){
        super(modelo, marca, color, almacenamiento);
        this.camaraResolution = camaraResolution;
        this.is5G   = is5G;
    }

    @Override
    public String toString() {
        return "SmartPhone: " +
                " modelo :" + modelo + ", " +
                "marca: " + marca + ", " +
                "color: " + color + ", " +
                "almacenamiento: " + almacenamiento + "GB, " +
                "camaraResolution: " + camaraResolution + ", " +
                "tiene 5G: " + is5G + " ";
    }
}
