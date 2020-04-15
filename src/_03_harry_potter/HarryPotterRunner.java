package _03_harry_potter;

public class HarryPotterRunner {
public static void main(String[] args) {
//	* 1. create harry potter
 HarryPotter harry = new HarryPotter ();
//	* 2. make him become invisible
harry.makeInvisible(true);
	//* 3. spy on Professor Snape
harry.spyOnSnape();
	 //4. make him become visible again
harry.makeInvisible(false);
	 //5. cast a spell
harry.castSpell("stupify");
}
}
