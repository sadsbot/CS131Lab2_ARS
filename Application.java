/**
* Contains the main method with calls to an instantiated
* Wizard object to test the Lockable interface.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #2
* Spring 2023
*/

public class Application {

	/**
	 * Main method for Lab #2 interface example.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("\n###======================================================================================###"
				+ "\nFirst, a new Wizard object wizKid is created using the default constructor.");
		Wizard wizKid = new Wizard();
		System.out.println("\nwizKid.toString() returns: " + wizKid.toString());
		System.out.println("\nNext, setters and getters are tested.");
		wizKid.setName("Mike");
		wizKid.setHealth(100);
		wizKid.setKey(123);
		wizKid.setLocked(false);
		System.out.println("\nAll setters have been called. Now all getters will demonstrate their success:"
				+ "\n\nwizKid.getName() returns: " + wizKid.getName()
				+ "\nwizKid.getHealth() returns: " + wizKid.getHealth()
				+ "\nwizKid.getKey() returns: " + wizKid.getKey()
				+ "\nwizKid.isLocked() returns: " + wizKid.isLocked());
		wizKid.takeDamage(25);
		System.out.println("\nTo demonstrate the functionality of takeDamage(), lock(), and unlock()..."
				+ "\n\nAfter calling wizKid.takeDamage(25), wizKid.getHealth() returns: " + wizKid.getHealth());
		wizKid.lock(123);
		wizKid.takeDamage(25);
		System.out.println("\nAfter calling wizKid.lock(123) and wizKid.takeDamage(25), wizKid.getHealth() returns: " + wizKid.getHealth());
		wizKid.unlock(123);
		wizKid.takeDamage(25);
		System.out.println("\nAfter calling wizKid.unlock(123) and wizKid.takeDamage(25), wizKid.getHealth() returns: " + wizKid.getHealth());
		System.out.println("###======================================================================================###");
	}//end main
}//end
