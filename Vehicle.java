import objectdraw.*;
import java.awt.*;

public class Vehicle extends ActiveObject{
  private VisibleImage carImage;
 private double carSpeed;
  boolean alive = true;
  private Frog juan;

  public Vehicle(int carX, int carY, Image i, double speed, DrawingCanvas c, Frog x) {

    carImage = new VisibleImage(i, new Location(carX, carY), c);
carSpeed = speed;
    juan = x;
    this.start();
  }

  public void run() {
   
//Loop for car to run
  
    

while( carImage.getX() < 1500 && carImage.getX() > -100 && alive){

  long time = System.currentTimeMillis(); 
   pause(20.0);
    long Actualtime = System.currentTimeMillis() - time; 
      double distance = (carSpeed* Actualtime);
   carImage.move(distance, 0);
    if  (juan.overlaps(carImage, true))
    {
      alive = false;
    }

   }
}

 
}
