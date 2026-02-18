public class Main {
   public static void main(String[] args) {


       Phone phone1 = new Phone();
       phone1.brand = "Samsung";
       phone1.model = "Galaxy S23";
       phone1.batteryPercent = 85;


       Phone phone2 = new Phone();
       phone2.brand = "iPhone";
       phone2.model = "iPhone 15";
       phone2.batteryPercent = 92;


       phone1.displayInfo();
       phone1.call();
       phone1.sendText();


       System.out.println();


       phone2.displayInfo();
       phone2.call();
       phone2.sendText();
   }
}
