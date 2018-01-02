package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class GreetingController {

    private  GreetingService service;
    //private  SingletonService sS;
    

//    public void setService( GreetingService service)
//    {
//        this.service = service;
//    }
    
    
//    public void setSS( SingletonService sS)
//    {
//        this.sS = sS;
//    }
    
    public GreetingController(GreetingService service) {
        this.service = service;
        // this.sS = null;
    }
//    
//    public GreetingController(SingletonService service) {
//        this.sS = service;
//        this.service = null;
//    }

    

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
