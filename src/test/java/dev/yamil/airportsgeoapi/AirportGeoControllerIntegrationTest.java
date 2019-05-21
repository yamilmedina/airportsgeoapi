package dev.yamil.airportsgeoapi;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@RunWith(SpringJUnit4ClassRunner.class)
@Import(AirportsgeoapiApplicationTests.class)
public class AirportGeoControllerIntegrationTest {

    private MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(AirportGeoController.class).build();
    }

    @Test
    @Ignore
    public void aiportsFunctionalTest() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }
}