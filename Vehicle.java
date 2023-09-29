import objectdraw.*;
import java.awt.*;

public class Vehicle extends ActiveObject{
  private VisibleImage carImage;
 private double carSpeed;
  boolean IsAlive = true;
  private Frog juan;

  public Vehicle(int carX, int carY, Image i, double speed, DrawingCanvas c, Frog sad) {

    carImage = new VisibleImage(i, new Location(carX, carY), c);
carSpeed = speed;
    juan = sad;
    this.start();
  }

  public void run() {
   
//Loop for car to run
  
    

while( carImage.getX() < 1500 && carImage.getX() > -100 && IsAlive){

  long time = System.currentTimeMillis(); 
   pause(20.0);
    long Actualtime = System.currentTimeMillis() - time; 
      double distance = (carSpeed* Actualtime);
   carImage.move(distance, 0);
    if  (juan.overlaps(carImage))
    {
      IsAlive = false;
    }

   }
}

 
}
