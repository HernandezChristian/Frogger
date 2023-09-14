import objectdraw.*;
import java.awt.*;
public class Frog{
private VisibleImage frogImage;
  int x = 100;
  int y = 200;
private static final double FROG_HEIGHT = 48;
  public Frog(Image i, DrawingCanvas c){
    frogImage = new VisibleImage(i, new Location(x,y), c);
  }
public boolean overlaps(VisibleImage vehicleImage){
  return frogImage.overlaps(vehicleImage);
}
  public void setX(int nx){
    x = nx;
  }
  public int getX(){
    return x;
  }
  public void setY(int ny){
    y = ny;
  }
  public int getY(){
    return y;
  }
}

public void hop(String direction)
	{
		if(direction.equals("L"))
	    {  setX(getX()-20);
      }
     
    if(direction.equals("R"))
	    {  setX(getX()+20);
      }

    // UP
    if(direction.equals("U"))
	    {  setY(getY()-20);
      }

    //DOWN
    if(direction.equals("D"))
	    {  setY(getY()+20);
      }
     
	}