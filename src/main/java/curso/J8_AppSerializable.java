package curso;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



public class J8_AppSerializable {

	/**
	 * Esta aplicacion mostrara una interfaz  para agregar objetos a una lista 
	 * y luego guardar ese objeto lista en un medio de almacenamiento y luego 
	 * leer ese archivo externo,
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ventana miVentana = new Ventana();
		miVentana.setVisible(true);
		
	}

}

class Ventana extends JFrame{
	
	
	public Ventana() {
		
		setSize(600, 500);
		setLocationRelativeTo(null);
		setTitle("Aplicacion Serializable");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Add el panel principal al JFrame
		getContentPane().add(new PanelPrincipal());
	}
	
}


class PanelPrincipal extends JPanel{
	
	
	public PanelPrincipal() {
	
		setLayout(new BorderLayout(10,30));
		setBorder (BorderFactory.createEmptyBorder(10,10, 10, 10));	
		iniciarComponentes();
		
		new ControladorPanelPrincipal(this);
	}
	
	
	
	private void iniciarComponentes() {
		
		
		inicializarTextField();
		inicializarSpinner();
		inicializarBotones();
		
		// Metodo encargaado de agregar los compontentes al Panel
		agregarComponentes();
	}
	
	
	private void inicializarTextField() {
		
		txtCedula = new JTextField(10);
		txtNombre = new JTextField(10);
		txtApellido = new JTextField(10);
	}
	
	private void inicializarSpinner() {
		
		spEdad = new JSpinner();
	}

	private void inicializarBotones() {
		
		btnNuevo = new JButton("Nuevo");
		btnCrear = new JButton("Crear Registro");
		btnCancelar = new JButton("Cancelar");
		btnGuardar = new JButton("Guardar Fichero");
		btnAbrir = new JButton("Abrir Fichero");
		
	}
	
	
	private void agregarComponentes() {
		
		crearEncabezado();
		crearContenidoPrincipal();
		crearPieContendido();
		estilos();
		
	}
	
	private void crearEncabezado() {
		
		JLabel lbTitle = new JLabel("Serializando Objetos");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont( new Font("Arial Black", Font.BOLD, 16));
		this.add(lbTitle,  BorderLayout.NORTH);
	
		
	}
	private void crearContenidoPrincipal() {
		
		JPanel panelContenido = new JPanel();
		panelContenido.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lb = new JLabel("Cedula: ");
		lb.setMaximumSize(new Dimension(150,35));
		lb.setPreferredSize(new Dimension(150,35));
		
		panelContenido.add(lb);
		panelContenido.add(txtCedula);

		panelContenido.add(new JLabel("Nombre: "));
		panelContenido.add(txtNombre);
		
		panelContenido.add(new JLabel("Apellido: "));
		panelContenido.add(txtApellido);
		
		panelContenido.add(new JLabel("Edad: "));
		panelContenido.add(spEdad);
		
		
		
		
		this.add(panelContenido, BorderLayout.CENTER);
		
	}
	
	private void crearPieContendido() {
		
		JPanel panelBotones = new JPanel();
		
		panelBotones.setLayout( new GridLayout(0, 1, 0, 20));
		JPanel  panelBotonesAccion = new JPanel();
		
		panelBotonesAccion.add(btnNuevo);
		panelBotonesAccion.add(btnCrear);
		panelBotonesAccion.add(btnCancelar);

		
		JPanel  panelBotonesArchivos = new JPanel();
		FlowLayout layout  = (FlowLayout) panelBotonesArchivos.getLayout();
		layout.setAlignment(FlowLayout.LEFT);
		panelBotonesArchivos.add(btnGuardar);
		panelBotonesArchivos.add(btnAbrir);
		
		
		panelBotones.add(panelBotonesAccion);
		panelBotones.add(panelBotonesArchivos);
		
		
		this.add(panelBotones, BorderLayout.SOUTH);
		
		
	
	}
	
	private void estilos() {
		
		Font fontBotones = new Font("Arial",Font.BOLD, 12);
		Cursor cursorMano = new Cursor(Cursor.HAND_CURSOR);
		
		btnNuevo.setFont(fontBotones);
		btnCrear.setFont(fontBotones);
		btnCancelar.setFont(fontBotones);
		btnGuardar.setFont(fontBotones);
		btnAbrir.setFont(fontBotones);
	
	
		btnNuevo.setCursor(cursorMano);
		btnCrear.setCursor(cursorMano);
		btnCancelar.setCursor(cursorMano);
		btnGuardar.setCursor(cursorMano);
		btnAbrir.setCursor(cursorMano);
	
	}
	
	
	
public JTextField txtCedula ;		
public JTextField txtNombre ;	
public JTextField txtApellido;
public JSpinner spEdad;
public JButton btnCrear;
public JButton btnGuardar;
public JButton btnAbrir;
public JButton btnNuevo;
public JButton btnCancelar;
	
	
}




class ControladorPanelPrincipal implements ActionListener{
	 
	private PanelPrincipal panelPrincipal;
	private List<Estudiante> listaEstudiantes;
	
	public ControladorPanelPrincipal(PanelPrincipal panelPrincipal) {
		
		this.panelPrincipal = panelPrincipal;
		listaEstudiantes = new ArrayList<Estudiante>();
		setOyentes();
		habilitarCampos(false);
		habiliarBotones(true);
	}
	
	private void setOyentes() {
		
		panelPrincipal.btnNuevo.addActionListener(this);
		panelPrincipal.btnCrear.addActionListener(this);
		panelPrincipal.btnCancelar.addActionListener(this);
		panelPrincipal.btnGuardar.addActionListener(this);
		panelPrincipal.btnAbrir.addActionListener(this);
	}
	
	


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (e.getSource() == panelPrincipal.btnNuevo)
			accionNuevo();;
		
		if (e.getSource() == panelPrincipal.btnGuardar)
			accionGuardar();
		
		if (e.getSource() == panelPrincipal.btnCancelar)
			accionCancelar();
		
		if (e.getSource() == panelPrincipal.btnCrear)
			accionCrear();
		
		if (e.getSource() == panelPrincipal.btnAbrir)
			accionAbrir();
		
		
	}
	
	
	private void accionNuevo() {
		
		habilitarCampos(true);
		habiliarBotones(false);
		
		panelPrincipal.txtCedula.requestFocus();
		
	}
	
	private void habilitarCampos(boolean estado) {
		
		panelPrincipal.txtCedula.setEditable(estado);
		panelPrincipal.txtNombre.setEditable(estado);
		panelPrincipal.txtApellido.setEditable(estado);
		panelPrincipal.spEdad.setEnabled(estado);
		
	}
	
	private void habiliarBotones(boolean estado) {
		
		panelPrincipal.btnNuevo.setEnabled(estado);
		panelPrincipal.btnCrear.setEnabled(!estado);
		panelPrincipal.btnCancelar.setEnabled(!estado);
	} 
	
	
	private void accionCancelar() {
		
		habilitarCampos(false);
		habiliarBotones(true);
		limpiarCampos();
	}
	private void limpiarCampos() {
		
		panelPrincipal.txtCedula.setText("");
		panelPrincipal.txtNombre.setText("");
		panelPrincipal.txtApellido.setText("");
		panelPrincipal.spEdad.setValue(0);
	}
	
	private void accionGuardar() {
		
		if (listaEstudiantes.size()>0) {
			
				JFileChooser jFileChooser = new JFileChooser();
				//jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int opcionPulsada = jFileChooser.showSaveDialog(panelPrincipal);
			
			
				if (opcionPulsada == JFileChooser.APPROVE_OPTION) 	
					accionGuardar_Ejecutar(jFileChooser.getSelectedFile());
				
				return;		
			
		}
		
		JOptionPane.showMessageDialog(panelPrincipal, "No hay objeto para agregar");
		
		
		
	}
	

	private void accionGuardar_Ejecutar(File file) {
	
		try {
		
			
			FileOutputStream fileSalida = new FileOutputStream(file.getAbsolutePath());
			
			ObjectOutputStream escribirFichero = new ObjectOutputStream(fileSalida);
			
			// Escribir fichero
			escribirFichero.writeObject(listaEstudiantes);
			
			escribirFichero.close();
			
			JOptionPane.showMessageDialog(panelPrincipal, "Archivo guardado correctamente");
		} catch (Exception e) {
			// TODO: handle exception
		
			e.printStackTrace();
			//JOptionPane.showMessageDialog(panelPrincipal, "Erro al guardar el archivo");
			//System.out.println(e);
		}
		
		
		
	}
	
	private void accionCrear() {
		
		
		if (!isVacio()) {
			// Obtener valores de los campos
			String cedula   = panelPrincipal.txtCedula.getText().trim();
			String nombre   = panelPrincipal.txtNombre.getText().trim();
			String apellido = panelPrincipal.txtApellido.getText().trim();
			int    edad     = Integer.parseInt(panelPrincipal.spEdad.getValue().toString());
					
					
			// Crear objeto Estudiante
			Estudiante estudiante = new Estudiante();
			estudiante.setCedula(cedula);
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			estudiante.setEdad(edad);
					
					
			// Agregar objeto a la lista
			listaEstudiantes.add(estudiante);
					
			JOptionPane.showMessageDialog(panelPrincipal, "Estudiante registrado correctamente");
			return ;
			
		}
		
		JOptionPane.showMessageDialog(panelPrincipal, "Existen Campos Vacios");
						
	}
	
	
	private boolean isVacio() {
		
		
		return  ( panelPrincipal.txtCedula.getText().isEmpty() ||  panelPrincipal.txtNombre.getText().isEmpty() 
				||  panelPrincipal.txtApellido.getText().isEmpty() );
	}
	
	
	private void accionAbrir() {
		
		JFileChooser jFileChooser = new JFileChooser();
		//jFileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		int opcionPulsada = jFileChooser.showOpenDialog(panelPrincipal);
	
	
		if (opcionPulsada == JFileChooser.APPROVE_OPTION) 	
			accionAbrir_Ejecutar(jFileChooser.getSelectedFile());
				
		
		
	}
	
	private void accionAbrir_Ejecutar(File file) {
		
		try {
			
			FileInputStream fileSalida = new FileInputStream(file.getAbsolutePath());
			
			System.out.println("Ruta del archivo: "  + file.getAbsolutePath());
			ObjectInputStream leerFichero = new ObjectInputStream(fileSalida);
			
			// Leer fichero
			 List<Estudiante>  estudianteRecuperado  = ( ArrayList<Estudiante>) leerFichero.readObject();
			
			// leerFichero.close();
			 estudianteRecuperado.forEach(x -> System.out.println(x));
			
			 
			 
		} catch (Exception e) {
			// TODO: handle exception
		
			e.printStackTrace();
			//JOptionPane.showMessageDialog(panelPrincipal, "Erro al guardar el archivo");
			//System.out.println(e);
		}
		
		
	}
	

	
}

class Estudiante  implements Serializable{
	

	private static final long serialVersionUID = 1L;
	private String cedula;
	private String nombre;
	private String apellido;
	private int edad;
	
	public Estudiante() {
		
	}
	
	
	public Estudiante(String cedula, String nombre, String apellido, int edad) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad
				+ "]";
	}
	
	
	
}


