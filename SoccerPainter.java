import org.code.neighborhood.*;

public class SoccerPainter extends MuralPainter {
  //what paintBall does has the instructions on how to make the soccer ball
  public void paintBall (String blackSpots, String whiteSpots) {
    getToStartBall();
    paintOutlineBody(whiteSpots);
    paintInsideTheBall(blackSpots, whiteSpots);
  }
  //getToStartBall makes the painter get to the starting position
  public void getToStartBall() {
    move();
    move();
    move();
    move();
    turnRight();
    move();
    turnLeft();
  }
  //paintOutLineBody will make the painter paint the cirlce of the ball
  public void paintOutlineBody(String color) {
    paintLine(color, 4);
    turnRight();
    move();
    paintLine(color, 1);
    turnLeft();
    move();
    paintLine(color, 1);
    turnRight();
    move();
    paintLine(color, 4);
    turnRight();
    move();
    paintLine(color, 1);
    turnLeft();
    move();
    paintLine(color, 1);
    turnRight();
    move();
    paintLine(color, 4);
    turnRight();
    move();
    paintLine(color, 1);
    turnLeft();
    move();
    paintLine(color, 1);
    turnRight();
    move();
    paintLine(color, 4);
    turnRight();
    move();
    paintLine(color, 1);
    turnLeft();
    move();
    paintLine(color, 1);
  }
  //paintInsideTheBall makes the inside of the ball
  public void paintInsideTheBall(String blackSpots, String whiteSpots) {
    turnHalfWay();
    move();
    turnLeft();
    move();
    paintLine(whiteSpots, 1);
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 1);
    move();
    turnRight();
    move();
    turnRight();
    move();
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 2);
    paintLine(blackSpots, 2);
    turnLeft();
    move();
    turnLeft();
    paintLine(whiteSpots, 1);
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 2);
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 1);
    turnRight();
    move();
    turnRight();
    move();
    paintLine(blackSpots, 1);
    paintLine(whiteSpots, 2);
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 2);
    paintLine(blackSpots, 1);
    turnLeft();
    move();
    turnLeft();
    move();
    paintLine(blackSpots, 1);
    paintLine(whiteSpots, 2);
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 2);
    paintLine(blackSpots, 1);
    turnRight();
    move();
    turnRight();
    move();
    paintLine(whiteSpots, 1);
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 2);
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 1);
    turnLeft();
    move();
    turnLeft();
    move();
    move();
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 2);
    paintLine(blackSpots, 2);
    turnRight();
    move();
    turnRight();
    move();
    move();
    paintLine(whiteSpots, 1);
    paintLine(blackSpots, 2);
    paintLine(whiteSpots, 1);
  }
}
