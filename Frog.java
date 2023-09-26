import objectdraw.*;
import java.awt.*;


public class Frog{
private VisibleImage frogImage;
private boolean isAlive;
private static final double FROG_HEIGHT = 48;
private int lives;
private int score;
  private DrawingCanvas can;
  public Frog(Image i, DrawingCanvas c){
    frogImage = new VisibleImage(i, new Location(350,350), c);
    isAlive = true;
    can = c;
    lives = 3;
    score = 0;
  }
public boolean overlaps(VisibleImage vehicleImage){
  return frogImage.overlaps(vehicleImage);
}

public void hop(String direction){
  if(isAlive){
		if(direction.equals("L")){
  frogImage.move(-20, 0);
      }
     
    if(direction.equals("R")){
    frogImage.move(20, 0);
      }

    // UP
    if(direction.equals("U")){
      frogImage.move(0, -20);
    //reincarnate();
      }

    //DOWN
    if(direction.equals("D")){
      frogImage.move(0, 20);
      //kill();
      }
     if(frogImage.getY() <= 0){
       frogImage.moveTo(350,350);
     }
  if(frogImage.getX() < -10 || frogImage.getX() >= 800){
    kill();
  }
  }
	}
  public void kill(){
    frogImage.hide();
    //can.getGraphics().drawString("OUCH", 350,300);
    isAlive = false;
    lives--;
  }
  public void reincarnate(){
    isAlive = true;
    frogImage.show();
    frogImage.moveTo(350,350);
    score += 100;
  }
  public boolean isHeAlive(){
    return isAlive;
  }
}