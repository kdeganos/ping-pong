import java.io.Console;
import java.util.ArrayList;

public class PingPong {
  public static void main(String[] args) {
    isPingPong(21);
  }

  public static ArrayList isPingPong(Integer number) {
    ArrayList<Object> outputList = new ArrayList<Object>();
    for ( Integer index = 1 ; index <= number ; index++ ) {
      if ( number % 15 == 0 ) {
        outputList.add( "pingpong" );
      } else if ( number % 5 == 0 ) {
        outputList.add( "pong" );
      } else if ( number % 3 == 0 ) {
        outputList.add( "ping");
      } else {
        outputList.add(number);
      }
      return outputList;
    }
    System.out.println(outputList);

    return outputList;
  }
}
