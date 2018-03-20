package ElectricaAdminMV;

import java.io.BufferedWriter;
import ElectricaAdminMV.repository.DataManager;
import ElectricaAdminMV.controller.ClientController;
import ElectricaAdminMV.ui.ElectricaUI;

public class App {
	public static void main(String[] args) {
		DataManager repo = new DataManager();
		
		ClientController ctrl = new ClientController();
		
		ElectricaUI console = new ElectricaUI(ctrl);
		console.Run();
	}
}
