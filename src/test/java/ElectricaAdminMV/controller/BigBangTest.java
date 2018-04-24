package ElectricaAdminMV.controller;

import ElectricaAdminMV.model.Client;
import ElectricaAdminMV.repository.DataManager;
import junit.framework.TestCase;

/**
 * Created by catablack.
 */
public class BigBangTest extends TestCase {

    private ClientController controller;
    private DataManager dm = new DataManager();

    public void setUp() throws Exception {
        super.setUp();
        controller = new ClientController();
    }

    public void testSaveChanges() {

        dm.Clients.add(new Client("Cata", "strada", "1"));
        assert (dm.Clients.size() > 0);

    }

    public void testAddClient() {
        controller.AddClient("Test", "Sdr", "1");
        controller.AddClient("", "Sdr", "1");
        controller.AddClient("Test", "Sdr", "1");

    }

    public void testFunctionC()
    {
        controller.AddClient("FunctionC", "Sdr2", "12");
        controller.AddClient("", "Sdr2", "12");
        controller.AddClient("FunctionC", "Sdr2", "12");
    }

    public void testBigBang()
    {
        this.testAddClient();
        this.testSaveChanges();
        this.testFunctionC();

    }

}
