package asbtracta.modelado;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;

import javax.swing.JLabel;
import javax.swing.JSpinner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		//clavePc;
		// numeVentas;
		
		// incentivo
		Cajero cajeroNormal = new Cajero();
		
		cajeroNormal.getClavePc();
		cajeroNormal.getNumeVentas();
		
		Cajero cajeroNormal2 = new CajeroEspecial();
		
		cajeroNormal2.getClavePc();
		cajeroNormal2.getNumeVentas();
		
		CajeroEspecial cajeroEsp = (CajeroEspecial) new Cajero();
		
		cajeroEsp.getIncentivo();
		cajeroEsp.getClavePc();
		
		/**
		 * Cuando bajo de nivel no es necesario el casting
		 * Cuando subo de nivel si es necesario el casting
		 */

		
		
		
		
	}

}
