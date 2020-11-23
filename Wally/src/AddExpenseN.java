import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddExpenseN {

	private JFrame frame;
	private JTextField textField_itemname;
	private JTextField textField_amount;
	private JTextField textField_description;

	/**
	 * Launch the application.
	 */
		public static void NewScreen() {
				EventQueue.invokeLater(new Runnable() {
		 			public void run() {
						try {
							AddExpenseN window = new AddExpenseN();
							window.frame.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			});
		}

	/**
	 * Create the application.
	 */
	public AddExpenseN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1056, 730);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel sidebar = new JPanel();
		sidebar.setBounds(0, 0, 286, 708);
		sidebar.setBackground(new Color(54, 33, 89));

		frame.getContentPane().add(sidebar);
		sidebar.setLayout(null);
		
		JPanel dashboardP = new JPanel();
		dashboardP.setBackground(new Color(54, 33, 89));
		dashboardP.setBounds(0, 169, 285, 59);
		sidebar.add(dashboardP);
		
		JLabel DashboardL = new JLabel();
		Image img = new ImageIcon(this.getClass().getResource("/dashboard.png")).getImage();
		DashboardL.setIcon(new ImageIcon(img));
		DashboardL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
                dashboardP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseClicked(MouseEvent e) {
				dashboardBBB d1= new dashboardBBB();
				d1.NewScreen();
				frame.dispose();
			}
			@Override
			public void mouseExited(MouseEvent e) {
                dashboardP.setBackground(new Color(54,33,89));

			}
		});
		DashboardL.setText("Dashboard");
		DashboardL.setMinimumSize(new Dimension(97, 61));
		DashboardL.setMaximumSize(new Dimension(97, 61));
		DashboardL.setHorizontalAlignment(SwingConstants.CENTER);
		DashboardL.setForeground(Color.WHITE);
		DashboardL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		GroupLayout gl_dashboardP = new GroupLayout(dashboardP);
		gl_dashboardP.setHorizontalGroup(
			gl_dashboardP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 310, Short.MAX_VALUE)
				.addComponent(DashboardL, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
		);
		gl_dashboardP.setVerticalGroup(
			gl_dashboardP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addComponent(DashboardL, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		dashboardP.setLayout(gl_dashboardP);
		
		JPanel AddExpenseP = new JPanel();
		AddExpenseP.setBackground(new Color(54, 33, 89));
		AddExpenseP.setBounds(0, 240, 285, 59);
		sidebar.add(AddExpenseP);
		
		JLabel AddExpenseL = new JLabel();
		Image img1 = new ImageIcon(this.getClass().getResource("/addexpense.png")).getImage();
		AddExpenseL.setIcon(new ImageIcon(img1));
		AddExpenseL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			@Override
			public void mouseEntered(MouseEvent e) {
                AddExpenseP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseExited(MouseEvent e) {
                AddExpenseP.setBackground(new Color(54,33,89));

			}
		});
		AddExpenseL.setText("Add Expense");
		AddExpenseL.setMinimumSize(new Dimension(97, 61));
		AddExpenseL.setMaximumSize(new Dimension(97, 61));
		AddExpenseL.setHorizontalAlignment(SwingConstants.CENTER);
		AddExpenseL.setForeground(Color.WHITE);
		AddExpenseL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		GroupLayout gl_AddExpenseP = new GroupLayout(AddExpenseP);
		gl_AddExpenseP.setHorizontalGroup(
			gl_AddExpenseP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 285, Short.MAX_VALUE)
				.addGap(0, 310, Short.MAX_VALUE)
				.addComponent(AddExpenseL, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
		);
		gl_AddExpenseP.setVerticalGroup(
			gl_AddExpenseP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGap(0, 59, Short.MAX_VALUE)
				.addComponent(AddExpenseL, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		AddExpenseP.setLayout(gl_AddExpenseP);
		
		JPanel ExpenseListP = new JPanel();
		ExpenseListP.setBackground(new Color(54, 33, 89));
		ExpenseListP.setBounds(0, 311, 285, 59);
		sidebar.add(ExpenseListP);
		
		JLabel ExpenseListL = new JLabel();
		Image img2 = new ImageIcon(this.getClass().getResource("/list.png")).getImage();
		ExpenseListL.setIcon(new ImageIcon(img2));
		ExpenseListL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ExpenseListN e1= new ExpenseListN();
				e1.NewScreen();
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
                ExpenseListP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseExited(MouseEvent e) {
                ExpenseListP.setBackground(new Color(54,33,89));

			}
		});
		ExpenseListL.setText("Expense List");
		ExpenseListL.setMinimumSize(new Dimension(97, 61));
		ExpenseListL.setMaximumSize(new Dimension(97, 61));
		ExpenseListL.setHorizontalAlignment(SwingConstants.CENTER);
		ExpenseListL.setForeground(Color.WHITE);
		ExpenseListL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		GroupLayout gl_ExpenseListP = new GroupLayout(ExpenseListP);
		gl_ExpenseListP.setHorizontalGroup(
			gl_ExpenseListP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 285, Short.MAX_VALUE)
				.addGap(0, 310, Short.MAX_VALUE)
				.addComponent(ExpenseListL, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
		);
		gl_ExpenseListP.setVerticalGroup(
			gl_ExpenseListP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGap(0, 59, Short.MAX_VALUE)
				.addComponent(ExpenseListL, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		ExpenseListP.setLayout(gl_ExpenseListP);
		
		JPanel AnalyticsP = new JPanel();
		AnalyticsP.setBackground(new Color(54, 33, 89));
		AnalyticsP.setBounds(0, 382, 285, 59);
		sidebar.add(AnalyticsP);
		
		JLabel AnalyticsL = new JLabel();
		Image img3 = new ImageIcon(this.getClass().getResource("/analytics.png")).getImage();
		AnalyticsL.setIcon(new ImageIcon(img3));
		AnalyticsL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnalyticsN reports= new AnalyticsN();
				reports.NewScreen();
				frame.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
                AnalyticsP.setBackground(new Color(85,69,118));

			}
			@Override
			public void mouseExited(MouseEvent e) {
                AnalyticsP.setBackground(new Color(54,33,89));

			}
		});
		AnalyticsL.setText("Analytics");
		AnalyticsL.setMinimumSize(new Dimension(97, 61));
		AnalyticsL.setMaximumSize(new Dimension(97, 61));
		AnalyticsL.setHorizontalAlignment(SwingConstants.CENTER);
		AnalyticsL.setForeground(Color.WHITE);
		AnalyticsL.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 18));
		GroupLayout gl_AnalyticsP = new GroupLayout(AnalyticsP);
		gl_AnalyticsP.setHorizontalGroup(
			gl_AnalyticsP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 285, Short.MAX_VALUE)
				.addGap(0, 310, Short.MAX_VALUE)
				.addComponent(AnalyticsL, GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
		);
		gl_AnalyticsP.setVerticalGroup(
			gl_AnalyticsP.createParallelGroup(Alignment.LEADING)
				.addGap(0, 59, Short.MAX_VALUE)
				.addGap(0, 59, Short.MAX_VALUE)
				.addComponent(AnalyticsL, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 59, Short.MAX_VALUE)
		);
		AnalyticsP.setLayout(gl_AnalyticsP);
		
		JLabel lblNewLabel = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/dashlogo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img4));
		lblNewLabel.setBounds(10, 50, 266, 59);
		sidebar.add(lblNewLabel);
		
		JPanel main_page = new JPanel();
		main_page.setLayout(null);
		main_page.setBackground(new Color(25, 25, 112));
		main_page.setBounds(284, 0, 770, 708);
		frame.getContentPane().add(main_page);
		
		JLabel lbl_addexpense = new JLabel("Add Expense");
		lbl_addexpense.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		lbl_addexpense.setForeground(new Color(255, 255, 255));
		lbl_addexpense.setBounds(335, 58, 115, 34);
		main_page.add(lbl_addexpense);
		
		JLabel lbl_itemname = new JLabel("Item name :");
		lbl_itemname.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_itemname.setForeground(new Color(255, 255, 255));
		lbl_itemname.setBounds(100, 160, 130, 13);
		main_page.add(lbl_itemname);
		
		JLabel lbl_amount = new JLabel("Amount :");
		lbl_amount.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_amount.setForeground(new Color(255, 255, 255));
		lbl_amount.setBounds(100, 243, 130, 13);
		main_page.add(lbl_amount);
		
		JLabel lbl_description = new JLabel("Description :");
		lbl_description.setForeground(new Color(255, 255, 255));
		lbl_description.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_description.setBounds(100, 329, 130, 21);
		main_page.add(lbl_description);
		
		JLabel lbl_category = new JLabel("Category :");
		lbl_category.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_category.setForeground(new Color(255, 255, 255));
		lbl_category.setBounds(100, 426, 130, 21);
		main_page.add(lbl_category);
		
		JLabel lbl_date = new JLabel("Date :-");
		lbl_date.setFont(new Font("Century Gothic", Font.BOLD, 15));
		lbl_date.setForeground(new Color(255, 255, 255));
		lbl_date.setBounds(100, 514, 130, 13);
		main_page.add(lbl_date);
		
		JComboBox comboBox_category = new JComboBox();
		comboBox_category.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		comboBox_category.setModel(new DefaultComboBoxModel(new String[] {"", "Utilities", "Subscription", "Rent/Emi", "Shopping", "Travel", "Health", "Others"}));
		comboBox_category.setBounds(100, 457, 350, 21);
		main_page.add(comboBox_category);
		
		textField_itemname = new JTextField();
		textField_itemname.setBounds(100, 183, 350, 19);
		main_page.add(textField_itemname);
		textField_itemname.setColumns(10);
		
		textField_amount = new JTextField();
		textField_amount.setBounds(100, 266, 350, 19);
		main_page.add(textField_amount);
		textField_amount.setColumns(10);
		
		textField_description = new JTextField();
		textField_description.setBounds(100, 360, 350, 19);
		main_page.add(textField_description);
		textField_description.setColumns(10);
		
		JDateChooser dateChooser_date = new JDateChooser();
		dateChooser_date.setBounds(100, 537, 139, 19);
		main_page.add(dateChooser_date);
		
		JButton btn_enter = new JButton("Enter");
		btn_enter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wally","root","12345678");
					Statement stmt = con.createStatement();
					String sql = "Insert into expense_list (category_name,item_name,amount,exp_date,description) values ('"+comboBox_category.getSelectedItem().toString()+"','"+textField_itemname.getText()+"','"+textField_amount.getText()+"','"+((JTextField)dateChooser_date.getDateEditor().getUiComponent()).getText()+"','"+textField_description.getText()+"')";
					stmt.executeUpdate(sql);
					con.close();
				}catch(Exception e1) {System.out.print(e1);}
						frame.dispose();
						ss s1 = new ss();
						s1.NewScreen();
			}
		});
		btn_enter.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btn_enter.setBounds(219, 623, 85, 21);
		main_page.add(btn_enter);
		
		JButton btn_cancel = new JButton("Cancel");
		btn_cancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btn_cancel.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		btn_cancel.setBounds(443, 623, 85, 21);
		main_page.add(btn_cancel);
	}
}
