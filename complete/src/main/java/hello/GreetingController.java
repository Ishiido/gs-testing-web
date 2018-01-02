package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

    private final GreetingService service;
    private final SingletonService sS;
    

    public GreetingController(GreetingService service) {
        this.service = service;
        this.sS = null;
    }
    
    public GreetingController(SingletonService service) {
        this.sS = service;
        this.service = null;
    }

    

    @RequestMapping("/greeting")
    public @ResponseBody String greeting() {
        return service.greet();
    }

    @RequestMapping ("/returnString")
    public @ResponseBody String returnString()
    {
        String retVal = "";
        SingletonService singletonService = SingletonService.getInstance("/var/tmp/config");
        if (singletonService==null)
        {
            retVal = "SingletonServcie not initialised";
        } else {
            retVal = singletonService.returnAString();
        }
        return retVal;
    }
    
}
