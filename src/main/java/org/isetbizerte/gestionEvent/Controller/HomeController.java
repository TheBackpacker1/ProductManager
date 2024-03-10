package org.isetbizerte.gestionEvent.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(path = {"/","/home","/index"})

    public String home () {

        return "index" ;

    }



}
