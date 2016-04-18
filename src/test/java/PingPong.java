import java.io.Console;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {
    isPingPong(21);
  }

  public static ArrayList isPingPong(Integer number) {
    ArrayList<Object> outputList = new ArrayList<Object>();
    for ( Integer index = 1 ; index <= number ; index++ ) {
      if ( index % 15 == 0 ) {
        outputList.add( "pingpong" );
      } else if ( index % 5 == 0 ) {
        outputList.add( "pong" );
      } else if ( index % 3 == 0 ) {
        outputList.add( "ping");
      } else {
        outputList.add(index);
      }
    }
    return outputList;
  }
}
