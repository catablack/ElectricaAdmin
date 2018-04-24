package ElectricaAdminMV.controller;

import ElectricaAdminMV.model.Client;
import junit.framework.TestCase;

/**
 * Created by catablack.
 */
public class ClientControllerTest extends TestCase {
    ClientController controller;

    public void setUp() throws Exception {
        super.setUp();
        controller = new ClientController();
    }

    public void tearDown() throws Exception {
    }

    public void testAddClient() {
        controller.AddClient("Test","Sdr","1");
        controller.AddClient("","Sdr","1");
        controller.AddClient("Test","Sdr","1");

    }

    public void testAddClientIndex() {
    }

    public void testListIssue() {
    }
}