package curso;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class J15_Hilos3_Interrupcion extends JDialog implements ActionListener {

	private final JPanel contentPanel = new JPanel();
	private Thread hilo1; 
	private JButton btnIniciarHilo;
	private JButton btnDetenerHilo;
	private JButton btnIniciarHilo2;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
			J15_Hilos3_Interrupcion dialog = new J15_Hilos3_Interrupcion();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
	
	}

	/**
	 * Create the dialog.
	 */
	public J15_Hilos3_Interrupcion() {
		setAlwaysOnTop(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setLayout(null);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		textField = new JTextField();
		textField.setBounds(26, 39, 207, 20);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(29, 87, 204, 20);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel buttonPane = new JPanel();
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
		btnIniciarHilo = new JButton("Iniciar Hilo");
		btnIniciarHilo.addActionListener(this);
		buttonPane.add(btnIniciarHilo);
		// Establece el foco en este boton
		getRootPane().setDefaultButton(btnIniciarHilo);
		
		
		btnIniciarHilo2 = new JButton("Iniciar Hilo 2");
		btnIniciarHilo2.addActionListener(this);
		buttonPane.add(btnIniciarHilo2);
		
		btnDetenerHilo = new JButton("Interrumpir");
		btnDetenerHilo.addActionListener(this);
		buttonPane.add(btnDetenerHilo);
			
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (e.getSource() == btnDetenerHilo )
			detenerHilo();	
		
		if (e.getSource() == btnIniciarHilo) 
			iniciarHilo("Hilo1");
		
		if (e.getSource() == btnIniciarHilo2) 
			iniciarHilo("Hilo2");
			
			
		
		
		
	}
	
	private void iniciarHilo(String nameThread) {
		
		//JOptionPane.showMessageDialog(this, "hola iniciar");
	 
		Runnable rn = new ClassBucle();
		hilo1 = new Thread(rn);
		hilo1.setName(nameThread);
		hilo1.start();
		
	}
	private void detenerHilo() {
		//JOptionPane.showMessageDialog(this, "hola detener");
		
		
		System.out.println("Estado del " + hilo1.getName()+ " antes de detenerlo: " + hilo1.isInterrupted() );
		hilo1.interrupt();
		
		System.out.println("Estado del " + hilo1.getName() +" despues de detenerlo: " + hilo1.isInterrupted() );
		System.out.println("Nombre de hilo1: " + hilo1.getName());
		//System.out.println(Thread.interrupted());
	}
	
			
	
}

class ClassBucle implements Runnable{

	@Override
	public void run() {
		
		//System.out.println("Estado del hilo 1 antes de detenerlo: " + Thread.currentThread().isInterrupted() );
		// TODO Auto-generated method stub
		// Thread.currentThread() retorna una referencia del hilo actual que se esta ejecutando 
		
		 System.out.println( "NOmbre de hilo:" + Thread.currentThread().getName());
		
		 while( !Thread.currentThread().isInterrupted()) {
			// System.out.println("holaaa");
			 
		 }
		 //System.out.println("Estado del hilo 1 despues de detenerlo: " +Thread.currentThread().isInterrupted() );
		 
	}
		
}

