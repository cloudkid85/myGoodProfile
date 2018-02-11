package es.iarjona.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
public class GeneralController {

    @RequestMapping(value="/", method = GET)
    public String login(){
        return "acceso/login";
    }
}
