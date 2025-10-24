class Phone {
    private String phoneName;
     void phoneInfo(String name){
           this.phoneName = name;
           System.out.println("This is " + phoneName + " phone");
     }
     void call(){
        System.out.println("This Phone was able to make voice calls ");
     }
     void radio(){
        System.out.println("Radio Features");
     }
     void flashLight(){
       System.out.println("Flash light feature");
     }
     void calendar(){
       System.out.println("Calendar available");
     }
     void alarm(){
        System.out.println("Alarm feature");
     }

}

class samsung extends Phone{
     void internet(){
        System.out.println("New feature internet");
     }
     void videoPlayer(){
        System.out.println("Video player feature");
     }
     void camera(){
       System.out.println("Camera Feature");
     }
     @Override
     void call(){
         System.out.println("This version of phone can make both voice and video calls");
     }
}

class apple extends samsung{
       void processor(){
         System.out.println("This phone has its own processor");
       }
       void games(){
         System.out.println("Games available to play");
       }
}

public class RuntimePolymorphism{
     public static void main(String[] args) {
         samsung ph1 = new apple();  // dynamic dispatch happeningnhere but the thing is the obj only acces the properties which are defined in parent and overriden in class not the new one which was defined in child class
         ph1.phoneInfo("Apple");
         ph1.alarm();
         ph1.calendar();
         ph1.flashLight();
         ph1.radio();
         ph1.videoPlayer();
         ph1.internet();
         ph1.camera();
         ph1.call();

         //To acces extra feature of class create its own object
         apple ph2 = new apple();
         ph2.internet();
         ph2.processor();
         ph2.games();
     }
}
