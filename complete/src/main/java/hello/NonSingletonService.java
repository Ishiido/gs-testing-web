package hello;

import org.springframework.stereotype.Service;

@Service
public class NonSingletonService {
    
    private  NonSingletonService( String pathToProp)
    {
        this.init(pathToProp);
    }
    
    
    /**
     * The method hjust returns a string.
     * @return "AString" is returned.
     */
    public String returnAString()
    {
        return "AString";
    }

    /**
     * Method to do the initialisation of the service. Uses the given config.
     * @param pathToConfig The name of the file for configuring the service.
     */
    private void init(String pathToConfig) {
        // ... do the config
    }
}
