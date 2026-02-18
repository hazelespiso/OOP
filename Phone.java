public class Phone {
   String brand;
   String model;
   int batteryPercent;
   public void call() {
       System.out.println("Calling...");
   }


   public void sendText() {
       System.out.println("Sending text message...");
   }


   public void displayInfo() {
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
       System.out.println("Battery: " + batteryPercent + "%");
   }


}
