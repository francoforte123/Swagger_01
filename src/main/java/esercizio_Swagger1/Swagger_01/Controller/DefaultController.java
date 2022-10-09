package esercizio_Swagger1.Swagger_01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping
    public String getWelcome(){
        return "welcome!!";
    }
}
