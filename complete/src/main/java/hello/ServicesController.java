package hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ServicesController {
    @RequestMapping("/services")
    public String services() {
        return "services";
    }
}
