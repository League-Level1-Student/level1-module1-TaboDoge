package IntroToConstructors;

import javax.swing.JOptionPane;

public class Platypus {
	   private String name;
	   
	public Platypus(String name2) {
this.name = name2;
	}
	  public void setName(String name3) {
this.name = name3;
	  }
	    void sayHi(){
	    
	        System.out.println("The platypus " + name + " is smarter than your average platypus.");
	    }
	}

