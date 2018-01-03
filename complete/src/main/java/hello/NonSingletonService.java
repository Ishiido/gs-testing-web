package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class NonSingletonService {
	static final Logger logger = LoggerFactory.getLogger(Application.class);

	private String pathToProp;
	public  NonSingletonService( String pathToProp)
    {
    	logger.debug(String.format("Inside Constructor: >%s<", pathToProp));
    	this.pathToProp = pathToProp;
        this.init(pathToProp);
    }
    
	public void setPathToProp(String p)
	{
		this.pathToProp = p;
	}
    
    /**
     * The method hjust returns a string.
     * @return "AString" is returned.
     */
    public String returnAString()
    {
    	logger.debug("Inside returnAString");
        return "AString";
    }

    /**
     * Method to do the initialisation of the service. Uses the given config.
     * @param pathToConfig The name of the file for configuring the service.
     */
    private void init(String pathToConfig) {
    	logger.debug(String.format("Inside init: >%s<", pathToConfig));
        
    }
}
