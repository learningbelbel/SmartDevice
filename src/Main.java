public class Main {
    public static void main(String[] args) {

        //      SmartPhones

        
        SmartDevice SamgungX = new SmartPhone("samsung S10", "Samsung", "black",128,
                "105px",false);
        SmartDevice Iphone14 = new SmartPhone("iPhone 14", "apple","blue",256,
                "64px",true);

        System.out.println(SamgungX.toString());
        System.out.println(Iphone14.toString());



        //      SmartWatches

        SmartDevice appleWatchS5 = new SmartWatch("Apple Watch" ,"apple", "white", 32,
                "white",2.4);
        SmartDevice galaxyWatch  = new SmartWatch("Galaxy Watch" ,"Samsung", "black", 32,
                "green",3.0);

        System.out.println(appleWatchS5.toString());
        System.out.println(galaxyWatch.toString());


    }
}