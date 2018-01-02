package hello;


public class SingletonService {

    private static SingletonService singletonService;
    
    private  SingletonService()
    {
        
    }
    
    /**
     * Create a new instance of the service and return it or return an existing
     * instance of the service. 
     * @param pathToConfig The path to the property file for configuration
     * @return An instance of the service - either new or existing.
     */
    public static SingletonService getInstance(String pathToConfig)
    {
        if (singletonService!=null)
        {
            return singletonService;
        } else {
            singletonService = new SingletonService();
            singletonService.init(pathToConfig);
        }
        return singletonService;
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
