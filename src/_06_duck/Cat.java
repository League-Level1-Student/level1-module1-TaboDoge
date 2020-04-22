package _06_duck;

public class Cat {
	private String favoriteFood;
	private int numberOfFriends;

	Cat(String favoriteFood, int numberOfFriends) {
        this.favoriteFood = favoriteFood;
        this.numberOfFriends = numberOfFriends;
 }
static void feedCat() {
	System.out.println("Your cat is fed");
}
}
