package ElectricaAdminMV.repository;

import ElectricaAdminMV.model.Client;
import junit.framework.TestCase;

/**
 * Created by catablack.
 */
public class DataManagerTest extends TestCase {

    DataManager dm = new DataManager();

    public void testSaveChanges() {

        dm.Clients.add(new Client("Cata","strada","1"));
        assert(dm.Clients.get(0).idClient == "1");

    }

    public void testGetInvoicesList() {
        assert(true);
    }

    public void testGetClientsList() {
        assert(true);
    }
}