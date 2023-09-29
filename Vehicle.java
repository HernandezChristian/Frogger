import objectdraw.*;
import java.awt.*;

public class Vehicle extends ActiveObject{
  private VisibleImage carImage;
 private double carSpeed;
  boolean alive = true;

  public Vehicle(int carX, int carY, Image i, double speed, DrawingCanvas c) {

    carImage = new VisibleImage(i, new Location(carX, carY), c);
carSpeed = speed;
    this.start();
  }

  public void run() {
   
//Loop for car to run
    double rate = -1;
    double time = 5;

while( carImage.getX() < 1500 && carImage.getX() > -100 && alive){

  long time = System.currentTimeMillis(); 
   pause(20.0);
    long Actualtime = System.currentTimeMillis() - time; 
      double distance = (carSpeed* time);
 carImage.move(distance, 0);
  if  (juan.overlaps(carImage, true))
  {
    alive = false;
  }

   }
}

 
}
