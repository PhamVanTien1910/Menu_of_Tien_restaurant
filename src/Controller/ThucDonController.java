package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Model.ThucDonModel;
import View.ThucDonView;

public class ThucDonController implements ActionListener {
	ThucDonView thucDonView;
	ThucDonModel thucDonModel;
	public int tongTien = 0;

	public ThucDonController(ThucDonView thucDonView) {

		this.thucDonView = thucDonView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String luaChonMon = e.getActionCommand();

		if (luaChonMon.equals("Cơm")) {
			tongTien += 20;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Sườn")) {
			tongTien += 120;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		}
		if (luaChonMon.equals("Nem")) {
			tongTien += 80;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Gà")) {
			tongTien += 200;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Chả")) {
			tongTien += 150;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Tôm")) {
			tongTien += 90;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Canh")) {
			tongTien += 30;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Cá Kho")) {
			tongTien += 60;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Chè")) {
			tongTien += 20;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Sữa chua")) {
			tongTien += 10;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Nho")) {
			tongTien += 90;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		} else if (luaChonMon.equals("Nước")) {
			tongTien += 10;
			this.thucDonView.lblNewLabel_soTien.setText(tongTien + "k");
		}

		if (luaChonMon.equals("Thanh Toán")) {
			int luachon = JOptionPane.showOptionDialog(thucDonView, "Bạn đã chắc chắn thanh toán ?",
					"Thanh toán hóa đơn!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, e);
			if (luachon == JOptionPane.YES_OPTION) {
				tongTien = 0;
				this.thucDonView.lblNewLabel_soTien.setText(tongTien + "");
			} else {

				JOptionPane.showMessageDialog(thucDonView, "Bạn phải thanh toán số tiền đã mua!");
				System.exit(luachon);
			}
			JOptionPane.showMessageDialog(thucDonView, "Bạn đã thanh toán!");

			while (tongTien >= 880) {
				tongTien = 0;
				this.thucDonView.lblNewLabel_soTien.setText(tongTien + "");
				break;

			}
			this.thucDonView.rdbtnNewRadioButton_com.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_suon.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_ga.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_nem.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_nho.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_nuoc.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_suaChua.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_tom.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_canh6.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_cha.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_che.setSelected(false);
			this.thucDonView.rdbtnNewRadioButton_cakho.setSelected(false);

		}
		if (luaChonMon.equals("Đặt bàn")) {
			String[] options = { "Bàn 4 người", "Bàn 6 người", "Bàn Vip" };
			int choice = JOptionPane.showOptionDialog(null, "Bạn muốn chọn bàn nào ?", "Chọn bàn.",
					JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

			if (choice == 0) {

				JOptionPane.showMessageDialog(thucDonView, "Bạn đã chọn bàn 4 người." + "Mời bạn thanh toán!");
			} else if (choice == 1) {
				JOptionPane.showMessageDialog(thucDonView, "Bạn đã chọn bàn 6 người." + "Mời bạn thanh toán!");
			} else if (choice == 2) {
				JOptionPane.showMessageDialog(thucDonView,
						"Bạn đã chọn bàn Vip." + "Mời bạn thanh toán ở phí đặt bàn!");
			}

		}
		if (luaChonMon.equals("Phí đặt bàn")) {
			JOptionPane.showOptionDialog(thucDonView, "Số tiền của bạn là 200k. Bạn đã chắc chắn đặt chưa ?",
					"Đặt bàn!", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, e);

		}
		
		

	}

}
