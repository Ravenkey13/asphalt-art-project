import org.code.neighborhood.*;


public class NeighborhoodRunner {
  public static void main(String[] args) {
//eric will paint the background green
    MuralPainter eric = new MuralPainter();
    eric.paintBackground("green", 12);
//adrian will paint the actual image which is the soccer ball
    SoccerPainter adrian = new SoccerPainter();
    adrian.resetPosition();
    adrian.paintBall("black","white");
    
}


    
  }