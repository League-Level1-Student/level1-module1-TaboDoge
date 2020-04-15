package _05_vault;

import java.util.Random;

public class Vault {
	 int secretCode;
	 public Vault(int secretCode) {
		 this.secretCode = secretCode;
	 }
	public static void main(String[] args) {
		Random Secret = new Random();
		Vault vault = new Vault(Secret.nextInt(1000000));
		vault.tryCode(0);
		JamesBond bond = new JamesBond();
		bond.findCode(vault);
	}
public boolean tryCode(int number) {
if (number == secretCode) {
	System.out.println("Opening vault...");
	return true;
}
	return false;
}
}
