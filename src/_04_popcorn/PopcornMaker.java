package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	Microwave pop = new Microwave();
	String flavors = JOptionPane.showInputDialog("What flavor popcorn do you want?");
	Popcorn popcorn = new Popcorn(flavors);
	pop.putInMicrowave(popcorn);
	String time = JOptionPane.showInputDialog("How long do you want to cook the popcorn?");
	int Time = Integer.parseInt(time);
	pop.setTime(Time);
	pop.putInMicrowave(popcorn);
	pop.startMicrowave();
}
}
