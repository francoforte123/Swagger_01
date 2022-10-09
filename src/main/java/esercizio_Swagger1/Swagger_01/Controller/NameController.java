package esercizio_Swagger1.Swagger_01.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping(value = "/name")
    public String getMyName(){
        return "Emmanuele La Duca";
    }
}
