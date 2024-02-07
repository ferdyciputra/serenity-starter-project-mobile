package steps;

import io.cucumber.java.Before;
import utilities.PropertiesReader;

import java.io.IOException;

public class Hooks {

    @Before
    public void setUp() throws IOException {
        PropertiesReader propertiesReader = new PropertiesReader();
        propertiesReader.initializeProperties();
    }

}
