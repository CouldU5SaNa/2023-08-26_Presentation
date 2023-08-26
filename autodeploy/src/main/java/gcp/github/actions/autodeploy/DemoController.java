package gcp.github.actions.autodeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
  @GetMapping("/")
  JsonObject Demo(){
    return new JsonObject("Hello");
  }
}
record JsonObject(String TestText){};