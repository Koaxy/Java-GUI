import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class GUI implements ActionListener {

	private int count = 0;
	private JLabel label;
	private JPanel panel;
	private JButton button;
	private JFrame frame;
    private JCheckBox checkBox1;
	
	void AddButtons()
	{
		button = new JButton("Send Nudes");
		button.addActionListener(this);
		panel.add(button);
	}
	void AddCheckBox() 
	{
		checkBox1.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            if (checkBox1.isSelected() == true)
	            {
	            	JOptionPane.showMessageDialog(frame, "is true");
	            	frame.setAlwaysOnTop(true);
	            }
	            else
	            {
	            	JOptionPane.showMessageDialog(frame, "is false");
	            	frame.setAlwaysOnTop(false);
	            }
	         }
	    });  
	}
	void initEverything()
	{
		checkBox1 = new JCheckBox("Always On Top");
		frame = new JFrame();
		label = new JLabel("Nudes sent: 0");
		panel = new JPanel();
		// Add the label and Check Box.
		panel.add(label);
		panel.add(checkBox1);
	}
	
	public GUI()
	{
		this.initEverything();
		this.AddButtons();
		this.AddCheckBox();
		panel.setBorder(BorderFactory.createEmptyBorder(100, 300, 100, 300));
		panel.setLayout(new GridLayout(0, 1));


		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Koaxy - 2022");
		frame.pack();
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		
		new GUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		label.setText("Nudes sent: " + count);
	}

}
