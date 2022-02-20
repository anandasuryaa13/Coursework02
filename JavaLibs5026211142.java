import javax.swing.*;
import java.awt.*;

public class JavaLibs5026211142 {
	public static void main(String[] args) {


        String[] options = new String[]{"Iya","Tidak"};
        int introInt = JOptionPane.showOptionDialog(null, "Hai, Apakah Kamu Manusia?", "WARNING!", 0, 2, null, options, options[0]);
        if (introInt != 0 ){
            JOptionPane.showMessageDialog(null, "Sampai Bertemu Lagi!","Sampai Jumpa! :(",2);
            System.exit(0);
	};

 		// Perkenalan
                String name = JOptionPane.showInputDialog("Halo, Namamu siapa?");
                JOptionPane.showMessageDialog(null, "Halo "+name+", Salam Kenal!");
           
                // Umur
                String age = JOptionPane.showInputDialog("Saat ini umur berapa?");
                int ageConvert=Integer.parseInt(age);
                if ( ageConvert > 40 ) {
                    JOptionPane.showMessageDialog(null, "Wah kamu cukup dewasa ya");
                } else if ( ageConvert == 18 ) {
                    JOptionPane.showMessageDialog(null, "wahh "+name+" kita seumuran nih.");
                } else {
                    JOptionPane.showMessageDialog(null, "Yah "+age+".");
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
		JOptionPane.showMessageDialog(null, "Terimakasih terimakasih Kak " + name+ " :D " );
            	System.exit(0);
	};
               

     }
}