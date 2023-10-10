package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ThucDonController;
import Model.ThucDonModel;

//import Model.ThucDonModel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.ButtonModel;
import javax.swing.JButton;

public class ThucDonView extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

//	 ButtonModel thucDonModel;
	public ThucDonModel thucDonModel;

	public JLabel lblNewLabel_soTien = new JLabel();
	public ThucDonController thucDonController;
	public JRadioButton rdbtnNewRadioButton_com;
	public JRadioButton rdbtnNewRadioButton_suon;
	public JRadioButton rdbtnNewRadioButton_nem;
	public JRadioButton rdbtnNewRadioButton_ga;
	public JRadioButton rdbtnNewRadioButton_cha;
	public JRadioButton rdbtnNewRadioButton_tom;
	public JRadioButton rdbtnNewRadioButton_canh6;
	public JRadioButton rdbtnNewRadioButton_cakho;
	public JRadioButton rdbtnNewRadioButton_che;
	public JRadioButton rdbtnNewRadioButton_suaChua;
	public JRadioButton rdbtnNewRadioButton_nho;
	public JRadioButton rdbtnNewRadioButton_nuoc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThucDonView frame = new ThucDonView();
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
	public ThucDonView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		setBounds(100, 100, 629, 777);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.thucDonModel = new ThucDonModel();

		ActionListener actionListener = new ThucDonController(this);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Nhà Hàng TienPV");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBackground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		lblNewLabel.setBounds(106, 44, 358, 57);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_comTrang = new JLabel("Cơm trắng");
		lblNewLabel_comTrang.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_comTrang.setBounds(10, 132, 127, 31);
		contentPane.add(lblNewLabel_comTrang);

		JLabel lblNewLabel_Suon = new JLabel("Sườn chua ngọt");
		lblNewLabel_Suon.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_Suon.setBounds(0, 197, 199, 31);
		contentPane.add(lblNewLabel_Suon);

		JLabel lblNewLabel_nemRan = new JLabel("Nem rán");
		lblNewLabel_nemRan.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_nemRan.setBounds(10, 267, 127, 31);
		contentPane.add(lblNewLabel_nemRan);

		JLabel lblNewLabel_gà = new JLabel("Gà hấp ");
		lblNewLabel_gà.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_gà.setBounds(10, 342, 127, 31);
		contentPane.add(lblNewLabel_gà);

		JLabel lblNewLabel_chaLua = new JLabel("Chả lụa");
		lblNewLabel_chaLua.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_chaLua.setBounds(10, 422, 127, 31);
		contentPane.add(lblNewLabel_chaLua);

		JLabel lblNewLabel_Tom = new JLabel("Tôm sốt me");
		lblNewLabel_Tom.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_Tom.setBounds(10, 507, 148, 31);
		contentPane.add(lblNewLabel_Tom);

		JLabel lblNewLabel_canh = new JLabel("Canh bí đao");
		lblNewLabel_canh.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_canh.setBounds(469, 132, 134, 31);
		contentPane.add(lblNewLabel_canh);

		JLabel lblNewLabel_ca = new JLabel("Cá kho tộ");
		lblNewLabel_ca.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_ca.setBounds(476, 197, 127, 31);
		contentPane.add(lblNewLabel_ca);

		JLabel lblNewLabel_chéam = new JLabel("Chè sâm");
		lblNewLabel_chéam.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_chéam.setBounds(476, 267, 127, 31);
		contentPane.add(lblNewLabel_chéam);

		JLabel lblNewLabel_suaChua = new JLabel("Sữa chua");
		lblNewLabel_suaChua.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_suaChua.setBounds(476, 342, 127, 31);
		contentPane.add(lblNewLabel_suaChua);

		JLabel lblNewLabel_nho = new JLabel("Nho không hạt");
		lblNewLabel_nho.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_nho.setBounds(444, 422, 159, 31);
		contentPane.add(lblNewLabel_nho);

		JLabel lblNewLabel_nuocSuoi = new JLabel("Nước suối");
		lblNewLabel_nuocSuoi.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblNewLabel_nuocSuoi.setBounds(469, 507, 127, 31);
		contentPane.add(lblNewLabel_nuocSuoi);

		JLabel lblNewLabel_comTrang20k = new JLabel("20k");
		lblNewLabel_comTrang20k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_comTrang20k.setBounds(189, 134, 46, 28);
		contentPane.add(lblNewLabel_comTrang20k);

		JLabel lblNewLabel_suon80k = new JLabel("120k");
		lblNewLabel_suon80k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_suon80k.setBounds(180, 199, 55, 28);
		contentPane.add(lblNewLabel_suon80k);

		JLabel lblNewLabel_nemRan80k = new JLabel("80k");
		lblNewLabel_nemRan80k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_nemRan80k.setBounds(189, 269, 46, 28);
		contentPane.add(lblNewLabel_nemRan80k);

		JLabel lblNewLabel_ga200k = new JLabel("200k");
		lblNewLabel_ga200k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_ga200k.setBounds(180, 344, 55, 28);
		contentPane.add(lblNewLabel_ga200k);

		JLabel lblNewLabel_chaLua150k = new JLabel("150k");
		lblNewLabel_chaLua150k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_chaLua150k.setBounds(180, 424, 55, 28);
		contentPane.add(lblNewLabel_chaLua150k);

		JLabel lblNewLabel_tom90k = new JLabel("90k");
		lblNewLabel_tom90k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_tom90k.setBounds(189, 509, 46, 28);
		contentPane.add(lblNewLabel_tom90k);

		JLabel lblNewLabel_canh30k = new JLabel("30k");
		lblNewLabel_canh30k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_canh30k.setBounds(388, 134, 46, 28);
		contentPane.add(lblNewLabel_canh30k);

		JLabel lblNewLabel_ca60k = new JLabel("60k");
		lblNewLabel_ca60k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_ca60k.setBounds(388, 201, 46, 28);
		contentPane.add(lblNewLabel_ca60k);

		JLabel lblNewLabel_che20k = new JLabel("20k");
		lblNewLabel_che20k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_che20k.setBounds(388, 269, 46, 28);
		contentPane.add(lblNewLabel_che20k);

		JLabel lblNewLabel_suaChua10k = new JLabel("10k");
		lblNewLabel_suaChua10k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_suaChua10k.setBounds(388, 344, 46, 28);
		contentPane.add(lblNewLabel_suaChua10k);

		JLabel lblNewLabel_nho90k = new JLabel("90k");
		lblNewLabel_nho90k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_nho90k.setBounds(388, 424, 46, 28);
		contentPane.add(lblNewLabel_nho90k);

		JLabel lblNewLabel_nuocSuoi10k = new JLabel("10k");
		lblNewLabel_nuocSuoi10k.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_nuocSuoi10k.setBounds(392, 509, 46, 28);
		contentPane.add(lblNewLabel_nuocSuoi10k);

		rdbtnNewRadioButton_com = new JRadioButton("Cơm");
		rdbtnNewRadioButton_com.setBounds(241, 140, 23, 23);
		contentPane.add(rdbtnNewRadioButton_com);
		rdbtnNewRadioButton_com.addActionListener(actionListener);

		rdbtnNewRadioButton_suon = new JRadioButton("Sườn");
		rdbtnNewRadioButton_suon.setBounds(241, 207, 23, 23);
		contentPane.add(rdbtnNewRadioButton_suon);
		rdbtnNewRadioButton_suon.addActionListener(actionListener);

		rdbtnNewRadioButton_nem = new JRadioButton("Nem");
		rdbtnNewRadioButton_nem.setBounds(241, 274, 23, 23);
		contentPane.add(rdbtnNewRadioButton_nem);
		rdbtnNewRadioButton_nem.addActionListener(actionListener);

		rdbtnNewRadioButton_ga = new JRadioButton("Gà");
		rdbtnNewRadioButton_ga.setBounds(241, 349, 23, 23);
		contentPane.add(rdbtnNewRadioButton_ga);
		rdbtnNewRadioButton_ga.addActionListener(actionListener);
		rdbtnNewRadioButton_cha = new JRadioButton("Chả");
		rdbtnNewRadioButton_cha.setBounds(241, 432, 23, 23);
		contentPane.add(rdbtnNewRadioButton_cha);
		rdbtnNewRadioButton_cha.addActionListener(actionListener);
		rdbtnNewRadioButton_tom = new JRadioButton("Tôm");
		rdbtnNewRadioButton_tom.setBounds(241, 517, 23, 15);
		contentPane.add(rdbtnNewRadioButton_tom);
		rdbtnNewRadioButton_tom.addActionListener(actionListener);

		rdbtnNewRadioButton_canh6 = new JRadioButton("Canh");
		rdbtnNewRadioButton_canh6.setBounds(359, 142, 23, 23);
		contentPane.add(rdbtnNewRadioButton_canh6);
		rdbtnNewRadioButton_canh6.addActionListener(actionListener);

		rdbtnNewRadioButton_cakho = new JRadioButton("Cá Kho");
		rdbtnNewRadioButton_cakho.setBounds(359, 207, 23, 23);
		contentPane.add(rdbtnNewRadioButton_cakho);
		rdbtnNewRadioButton_cakho.addActionListener(actionListener);

		rdbtnNewRadioButton_che = new JRadioButton("Chè");
		rdbtnNewRadioButton_che.setBounds(359, 277, 23, 23);
		contentPane.add(rdbtnNewRadioButton_che);
		rdbtnNewRadioButton_che.addActionListener(actionListener);

		rdbtnNewRadioButton_suaChua = new JRadioButton("Sữa chua");
		rdbtnNewRadioButton_suaChua.setBounds(359, 352, 23, 23);
		contentPane.add(rdbtnNewRadioButton_suaChua);
		rdbtnNewRadioButton_suaChua.addActionListener(actionListener);

		rdbtnNewRadioButton_nho = new JRadioButton("Nho");
		rdbtnNewRadioButton_nho.setBounds(359, 432, 23, 23);
		contentPane.add(rdbtnNewRadioButton_nho);
		rdbtnNewRadioButton_nho.addActionListener(actionListener);

		rdbtnNewRadioButton_nuoc = new JRadioButton("Nước");
		rdbtnNewRadioButton_nuoc.setBounds(359, 517, 23, 23);
		contentPane.add(rdbtnNewRadioButton_nuoc);
		rdbtnNewRadioButton_nuoc.addActionListener(actionListener);

		JLabel lblNewLabel_TongTien = new JLabel("Tổng:  ");
		lblNewLabel_TongTien.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_TongTien.setBounds(60, 609, 98, 44);
		contentPane.add(lblNewLabel_TongTien);

		lblNewLabel_soTien = new JLabel("");
		lblNewLabel_soTien.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel_soTien.setBounds(168, 609, 170, 44);
		contentPane.add(lblNewLabel_soTien);

		JButton btnNewButton = new JButton("Thanh Toán");
		btnNewButton.addActionListener(actionListener);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton.setBounds(414, 609, 189, 40);
		contentPane.add(btnNewButton);

		JButton btntBn = new JButton("Đặt bàn");
		btntBn.addActionListener(actionListener);
		btntBn.setFont(new Font("Tahoma", Font.BOLD, 22));
		btntBn.setBounds(272, 674, 127, 40);
		contentPane.add(btntBn);

		JButton btnPhtBn = new JButton("Phí đặt bàn");
		btnPhtBn.addActionListener(actionListener);
		btnPhtBn.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPhtBn.setBounds(414, 674, 189, 40);
		contentPane.add(btnPhtBn);
		this.setVisible(true);
	}
	
	public void taiKhoanCuaToi() {
		
	}
}
