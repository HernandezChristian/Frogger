import objectdraw.*;
import java.awt.*;
public class Lilypad{
  private VisibleImage LilyImage;
  private VisibleImage LilyFrogImage;
  private static final double LILYPAD_HEIGHT = 48;
  public Lilypad (Image a,Image b, DrawingCanvas c){
    LilyImage = new VisibleImage(a, new Location(100,100), c);
    LilyFrogImage = new VisibleImage(b, new Location(300,100), c);
  }
}