import objectdraw.*;
import java.awt.*;
public class Frog{
private VisibleImage frogImage;
  int x = 10;
  int y = 10;
private static final double FROG_HEIGHT = 48;
  public Frog(Image i, DrawingCanvas c){
    frogImage = new VisibleImage(i, new Location(x,y), c);
  }
public boolean overlaps(VisibleImage vehicleImage){
  return frogImage.overlaps(vehicleImage);
}
  private void setX(int nx){
    x = nx;
  }
  private int getX(){
    return x;
  }
  private void setY(int ny){
    y = ny;
  }
  private int getY(){
    return y;
  }
}