import objectdraw.*;
import java.awt.*;

public class Vehicle {
  private VisibleImage carImage;
  int x = 100;
  int y = 200;

  public Vehicle(int carX, int carY, Image i, double speed, DrawingCanvas c) {
    x = carX;
    y = carY;
    carImage = new VisibleImage(i, new Location(x, y), c);

  }

  public void run() {

  }

}
