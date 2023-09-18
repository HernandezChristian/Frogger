import objectdraw.*;
import java.awt.*;
public class Frog{
private VisibleImage frogImage;
private static final double FROG_HEIGHT = 48;
  public Frog(Image i, DrawingCanvas c){
    frogImage = new VisibleImage(i, new Location(100,100), c);
  }
public boolean overlaps(VisibleImage vehicleImage){
  return frogImage.overlaps(vehicleImage);
}

public void hop(String direction){
		if(direction.equals("L")){
  frogImage.move(-20, 0);
      }
     
    if(direction.equals("R")){
    frogImage.move(20, 0);
      }

    // UP
    if(direction.equals("U")){
      frogImage.move(0, -20);
      }

    //DOWN
    if(direction.equals("D")){
      frogImage.move(0, 20);
      }
     
	}
 
  
}