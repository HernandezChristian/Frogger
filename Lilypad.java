import objectdraw.*;
import java.awt.*;
import java.util.*;
public class Lilypad{
  ArrayList<VisibleImage> LilyImages = new ArrayList<VisibleImage>();
  private Image LilyEmpty;
  private Image LilyFrog;
  
  public Lilypad (Image im,Image LilyFrog, int x, int y, DrawingCanvas c){
    this.LilyFrog = LilyFrog;
    LilyEmpty = im;
      for(int i = 0; i < 5; i++){
    LilyImages.add(new VisibleImage(LilyEmpty, new Location(x +(i*145),y),100,40, c));
    }  
  }
  public VisibleImage getVisImage(int i){
    return LilyImages.get(i);
  }
}