package Controller.Main.porder;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import Dao.porder.implPorder;
import Dao.porder.porderDao;
import Model.porder;

import javax.swing.JScrollPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

public class porderUI extends JFrame {

	private JPanel contentPane;
	private JTextField A;
	private JTextField B;
	private JTextField C;
	private JTextField desk;
	private JTextField udesk;
	private JTextField ua;
	private JTextField textField_6;
	private JTextField uc;
	private JTextField id;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					porderUI frame = new porderUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public porderUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(143, 188, 143));
		panel.setBounds(0, 0, 287, 381);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("點餐系統");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 18));
		lblNewLabel.setBounds(111, 10, 131, 31);
		panel.add(lblNewLabel);
		
		JButton add = new JButton("新增\r\n");
		
		
		add.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 13));
		add.setBackground(new Color(255, 255, 240));
		add.setBounds(99, 263, 87, 23);
		panel.add(add);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(143, 188, 143));
		panel_1.setBounds(47, 99, 170, 35);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("A:");
		lblNewLabel_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_2.setBounds(10, 10, 20, 15);
		panel_1.add(lblNewLabel_2);
		
		A = new JTextField();
		A.setBounds(64, 7, 96, 21);
		panel_1.add(A);
		A.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(143, 188, 143));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(47, 144, 170, 35);
		panel.add(panel_1_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("B:");
		lblNewLabel_2_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(10, 10, 20, 15);
		panel_1_1.add(lblNewLabel_2_1);
		
		B = new JTextField();
		B.setColumns(10);
		B.setBounds(64, 7, 96, 21);
		panel_1_1.add(B);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(143, 188, 143));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(47, 202, 170, 35);
		panel.add(panel_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("C:");
		lblNewLabel_2_2.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(10, 10, 20, 15);
		panel_1_2.add(lblNewLabel_2_2);
		
		C = new JTextField();
		C.setColumns(10);
		C.setBounds(64, 7, 96, 21);
		panel_1_2.add(C);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBackground(new Color(143, 188, 143));
		panel_1_3.setLayout(null);
		panel_1_3.setBounds(47, 51, 170, 35);
		panel.add(panel_1_3);
		
		JLabel lblNewLabel_2_3 = new JLabel("桌號:");
		lblNewLabel_2_3.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(10, 10, 44, 15);
		panel_1_3.add(lblNewLabel_2_3);
		
		desk = new JTextField();
		desk.setColumns(10);
		desk.setBounds(64, 7, 96, 21);
		panel_1_3.add(desk);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(143, 188, 143));
		panel_2.setBounds(333, 10, 473, 381);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JButton selectALL = new JButton("查詢");
		
		selectALL.setBounds(28, 10, 75, 23);
		panel_2.add(selectALL);
		
		JButton update = new JButton("修改");
		
		update.setBounds(28, 64, 75, 23);
		panel_2.add(update);
		
		JButton delete = new JButton("刪除");
	
		delete.setBounds(28, 164, 75, 23);
		panel_2.add(delete);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setBackground(new Color(143, 188, 143));
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setBounds(116, 52, 88, 35);
		panel_2.add(panel_1_3_1);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("桌號:");
		lblNewLabel_2_3_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_2_3_1.setBounds(10, 10, 44, 15);
		panel_1_3_1.add(lblNewLabel_2_3_1);
		
		udesk = new JTextField();
		udesk.setColumns(10);
		udesk.setBounds(44, 7, 19, 21);
		panel_1_3_1.add(udesk);
		
		JPanel panel_1_3_1_1 = new JPanel();
		panel_1_3_1_1.setBackground(new Color(143, 188, 143));
		panel_1_3_1_1.setLayout(null);
		panel_1_3_1_1.setBounds(212, 52, 88, 35);
		panel_2.add(panel_1_3_1_1);
		
		JLabel lblNewLabel_2_3_1_1 = new JLabel("A:");
		lblNewLabel_2_3_1_1.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_2_3_1_1.setBounds(10, 10, 44, 15);
		panel_1_3_1_1.add(lblNewLabel_2_3_1_1);
		
		ua = new JTextField();
		ua.setColumns(10);
		ua.setBounds(44, 7, 19, 21);
		panel_1_3_1_1.add(ua);
		
		JPanel panel_1_3_1_2 = new JPanel();
		panel_1_3_1_2.setBackground(new Color(143, 188, 143));
		panel_1_3_1_2.setLayout(null);
		panel_1_3_1_2.setBounds(311, 52, 88, 35);
		panel_2.add(panel_1_3_1_2);
		
		JLabel ub = new JLabel("B:");
		ub.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		ub.setBounds(10, 10, 44, 15);
		panel_1_3_1_2.add(ub);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(44, 7, 19, 21);
		panel_1_3_1_2.add(textField_6);
		
		JPanel panel_1_3_1_3 = new JPanel();
		panel_1_3_1_3.setBackground(new Color(143, 188, 143));
		panel_1_3_1_3.setLayout(null);
		panel_1_3_1_3.setBounds(116, 95, 88, 35);
		panel_2.add(panel_1_3_1_3);
		
		JLabel lblNewLabel_2_3_1_3 = new JLabel("C:");
		lblNewLabel_2_3_1_3.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_2_3_1_3.setBounds(10, 10, 44, 15);
		panel_1_3_1_3.add(lblNewLabel_2_3_1_3);
		
		uc = new JTextField();
		uc.setColumns(10);
		uc.setBounds(44, 7, 19, 21);
		panel_1_3_1_3.add(uc);
		
		JPanel panel_1_3_1_4 = new JPanel();
		panel_1_3_1_4.setBackground(new Color(143, 188, 143));
		panel_1_3_1_4.setLayout(null);
		panel_1_3_1_4.setBounds(113, 152, 88, 35);
		panel_2.add(panel_1_3_1_4);
		
		JLabel lblNewLabel_2_3_1_4 = new JLabel("Id:");
		lblNewLabel_2_3_1_4.setFont(new Font("Yu Gothic UI Semibold", Font.BOLD, 12));
		lblNewLabel_2_3_1_4.setBounds(10, 10, 44, 15);
		panel_1_3_1_4.add(lblNewLabel_2_3_1_4);
		
		id = new JTextField();
		id.setColumns(10);
		id.setBounds(44, 7, 34, 21);
		panel_1_3_1_4.add(id);
		
		JTextArea showAll = new JTextArea();
		showAll.setBounds(10, 210, 453, 161);
		panel_2.add(showAll);
		
		
		//新增
		add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取UI--->getText
				 * 2.A,B,C-->轉型-->int
				 * 3.new porder
				 * 4.add(p)
				 */
				
				String DESK=desk.getText();
				int a=Integer.parseInt(A.getText());
				int b=Integer.parseInt(B.getText());
				int c=Integer.parseInt(C.getText());
				porder p=new porder(DESK,a,b,c); //放進資料庫
				new implPorder().add(p);
				
				
			
			}
		});
		
		
		//查詢all
		selectALL.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.List<porder> l-->selectAll()
				 * 2.String-->for-each-->顯示
				 * 3.List--->轉陣列--->toArray-->顯示 , 統計分析
				 */
		/*		List<porder> l=new implPorder().selectALL();
				String show="";//宣告show為一個字串
				
				for(porder p:l)
				{
					show=show+"id:"+p.getId()+"\t桌號:"+p.getDesk()+  //第一個show是讓後面都變文字
							                         "\tA:"+p.getA()+
							                         "\tB"+p.getB()+
							                         "\tC"+p.getC()+"\n";				
							                         
				}
				showAll.setText(show);*/
				List<porder> l=new implPorder().selectALL();
			/*	Object[] o=l.toArray();
				System.out.println(((porder)o[0]).getA());*/
				porder[] p=l.toArray(new porder[l.size()]); //泛型轉成陣列<T> T[]	toArray(T[] a)   //porder[] p=new         
				//System.out.println(p[0].getId()+"\t"+p[0].getDesk());
				String show="";
				int sum=0;
				for(porder P:p)
				{
					show=show+"id"+P.getId()+"\t桌號:"+P.getDesk()+
							        "\tA:"+P.getA()+
							        "\tB:"+P.getB()+
							        "\tC:"+P.getC()+"\n";
					
				}
				for(int i=0;i<p.length;i++)
				{
					sum=sum+p[i].getA();
				}
				showAll.setText(show+"\nA總共="+sum);
			}
		});
		
		
		//update
		update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取->所有getText
				 * 2.ua,ub,uc,id-->string -->int
				 * 3.selectId-->id
				 * 4.porder-->set修改
				 * 5.update
				 */
				
				String Desk=udesk.getText();
				int A=Integer.parseInt(ua.getText());
				int B=Integer.parseInt(ub.getText());
				int C=Integer.parseInt(uc.getText());
				int ID=Integer.parseInt(id.getText());
				
				porder p=new implPorder().selectId(ID);  //porder靜態class
				p.setDesk(Desk);
				p.setA(A);
				p.setB(B);
				p.setC(C);
				
				new implPorder().update(p);
				
				
			}
		});
		
		
		//delete
		delete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				/*
				 * 1.擷取-->id-->轉型 int
				 * 2.delete
				 */
				int ID=Integer.parseInt(id.getText());
				new implPorder().delete(ID);
			
			}
		});
		
		
	}

}
