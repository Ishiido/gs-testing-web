package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class NonSingletonController {

    private  NonSingletonService service;
    //private  SingletonService sS;
    

//    public void setService( GreetingService service)
//    {
//        this.service = service;
//    }
    
    
//    public void setSS( SingletonService sS)
//    {
//        this.sS = sS;
//    }
    
    public NonSingletonController(NonSingletonService service) {
        this.service = service;
        // this.sS = null;
    }
//    
//    public GreetingController(SingletonService service) {
//        this.sS = service;
//        this.service = null;
//    }

    

    @RequestMapping ("/returnString")
    public @ResponseBody String returnString()
    {
        String retVal = service.returnAString();
        return retVal;
    }
    
}
