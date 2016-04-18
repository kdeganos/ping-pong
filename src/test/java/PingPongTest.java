import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;


public class PingPongTest {

  // @Test
  // public void isPingPong_Integer_true() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(true, testPingPong.isPingPong(2));
  // }
  //
  // @Test
  // public void isPingPong_forNumberDivisblebyThree_true() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(true, testPingPong.isPingPong(3));
  // }
  //
  // @Test
  // public void isPingPong_forNumberDivisblebyFive_true() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(true, testPingPong.isPingPong(5));
  // }
  //
  // @Test
  // public void isPingPong_forNumberDivisblebyFifteen_true() {
  //   PingPong testPingPong = new PingPong();
  //   assertEquals(true, testPingPong.isPingPong(15));
  // }
@Test
public void PingPong_countUpToGivenNumber_Array() {
  PingPong testPingPong = new PingPong();
  ArrayList<Object> outputList = new ArrayList<Object>();
  outputList.add(1);
  outputList.add(2);
  outputList.add("ping");
  outputList.add(4);
  outputList.add("pong");
  outputList.add("ping");
  outputList.add(7);
  outputList.add(8);
  outputList.add("ping");
  outputList.add("pong");
  outputList.add(11);
  outputList.add("ping");
  outputList.add(13);
  outputList.add(14);
  outputList.add("pingpong");
  assertEquals(outputList, testPingPong.isPingPong(15));
}
}
