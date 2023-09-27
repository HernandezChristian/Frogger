import objectdraw.*;
import java.awt.*;
public class Lilypad{
  //ArrayList<VisibleImage> LilyImages = new ArrayList<VisibleImage>();
  private Image LilyEmpty;
  private VisibleImage LilyFrog;
  
  public Lilypad (Image i,Image LilyFrog, int x, int y, DrawingCanvas c){
    LilyEmpty = i;
    this.LilyFrog = LilyFrog;
    LilyEmpty = new VisibleImage(i, new Location(300,300), c);
     /* for(int i = 0; i < 5; i++){
    LilyImages.add(new VisibleImage(a, new Location(x,y),  c));
    }
    */
    //LilyFrogImage = new Image("lily.jpg");
    //LilyEmpty = new Image("lilyFrog.jpg");
      
  }

  
  
}