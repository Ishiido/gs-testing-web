package hello;

import static org.hamcrest.Matchers.containsString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest(NonSingletonController.class)
public class WebMockTestNonSingleton {

    @Autowired
    private MockMvc mockMvc;

    
    @MockBean
    private NonSingletonService nonSingletonService;

    
    @Test
    public void singletonServiceShouldReturnMessageFromService() throws Exception
    {
        when(nonSingletonService.returnAString()).thenReturn("BString");
        this.mockMvc.perform(get("/returnString")).andDo(print()).andExpect(status().isOk())
        .andExpect(content().string(containsString("BString")));
    }
    
}
