import java.io.Console;
import java.util.ArrayList;

import java.util.Map;
import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/pingPongOutput", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/pingPongOutput.vtl");

      String inputString = request.queryParams("inputString");
      Integer inputInteger = Integer.parseInt(inputString);
      ArrayList isPingPong = isPingPong(inputInteger);
      model.put("isPingPong", isPingPong);
      // model.put("listOutput", listOutput);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
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
