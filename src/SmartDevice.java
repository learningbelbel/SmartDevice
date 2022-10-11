public class SmartDevice {

    //attributes
     String modelo;
     String marca;
     String color;
     int almacenamiento;
     boolean turnOn;
    //constructor
    public SmartDevice(){
    }
    public SmartDevice(String modelo, String marca, String color, int almacenamiento){
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.almacenamiento = almacenamiento;
    }
    //methods
    public void encender(boolean turnOn){
        this.turnOn = true;
        System.out.println("Encendido");
    }

}
