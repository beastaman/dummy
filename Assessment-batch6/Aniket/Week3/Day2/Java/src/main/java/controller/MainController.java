package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestParam("/add")
    public String getString() {
        // will return view
        return "index";
    }
}
