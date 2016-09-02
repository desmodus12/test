import java.rmi.RemoteException;

import javax.swing.JOptionPane;
import javax.xml.rpc.ServiceException;

import datcas_pkg.DatcasLocator;

public class main {

	public static void main(String[] args) {
		DatcasLocator dcl = new DatcasLocator();
		String s;
		try {
			s = dcl.getdatcasPort().getCas("datetime");
			JOptionPane.showMessageDialog(null,"It's " + s);
		} catch (RemoteException | ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
