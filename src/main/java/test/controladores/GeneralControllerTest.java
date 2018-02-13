package test.controladores;

import es.iarjona.controladores.GeneralController;
import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;


public class GeneralControllerTest {

    @Test
    public void testLoginPage() throws Exception {
        GeneralController controller = new GeneralController();
        MockMvc mockMvc = standaloneSetup(controller).build();

        mockMvc.perform(get("/")).andExpect(view().name("acceso/login"));
    }
}