import javax.swing.*;
import java.awt.*;

public class JavaLibs5026211142 {
	public static void main(String[] args) {

		String Perkenalan, Umur, Gender, Perasaan;


        	String[] options = new String[]{"Iya","Tidak"};
        	int introInt = JOptionPane.showOptionDialog(null, "Hai, Apakah Kamu Manusia?", "WARNING!", 0, 2, null, options, options[0]);
        	if (introInt != 0 ){
            	JOptionPane.showMessageDialog(null, "Sampai Bertemu Lagi!","Sampai Jumpa! :(",2);
            	System.exit(0);
		};

 		// Perkenalan
                String perkenalan = JOptionPane.showInputDialog("Halo, Namamu siapa?");
                JOptionPane.showMessageDialog(null, "Halo "+perkenalan+", Salam Kenal!");
           
                // Umur
                String umur = JOptionPane.showInputDialog("Saat ini umur berapa?");
                int umurConvert=Integer.parseInt(umur);
                if ( umurConvert > 40 ) {
                    JOptionPane.showMessageDialog(null, "Wah kamu cukup dewasa ya");
                } else if ( umurConvert == 18 ) {
                    JOptionPane.showMessageDialog(null, "wahh "+perkenalan+" kita seumuran.");
                } else {
                    JOptionPane.showMessageDialog(null, "Ohh kamu "+umur+" tahun.");
                }


		// Gender
                String[] acceptablevalues = {"Laki-laki" , "Perempuan"};
                String gender = (String)JOptionPane.showInputDialog(null, "Kamu", "jenis kelamin",2,null,acceptablevalues,acceptablevalues[1]);


                // Perasaan 
                String[] option = new String[]{"Iyaaaa","ENGGAKKK!!"};
        	int sukaInt = JOptionPane.showOptionDialog(null, "Kamu suka aku ngga ?", "PERHATIAN!", 0, 2, null, options, options[0]);
        	if (sukaInt != 0 ){
            	JOptionPane.showMessageDialog(null, "Sampai Bertemu Lagi! Sedih nihh hiks	","Sedih Nih :(",2);
		}else {
		JOptionPane.showMessageDialog(null, "Terimakasih banyak Kak " +perkenalan+ " :D " );
            	System.exit(0);
	};
               

     }
}
