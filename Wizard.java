/**
 * This class represents a wizard for
 * a D&D type game.
 * @author rkelley, Andrew Ross-Sermons
 * @version 1.1
 * CS131; Lab #2
 */

public class Wizard implements Lockable {
	private String name;
	private int health;
	private int key;
	boolean locked;
	
	/**
	 * End constructor to put object into consistent state
	 */
	public Wizard() {
		setName("");
		setHealth(100);
		setKey(0);
		setLocked(false);
	}//end default constructor
	
	/**
	 * Constructor to create object with common
	 * usage. This is the preferred constructor.
	 * @param name
	 */
	public Wizard(String name, int health) {
		setName(name);
		setHealth(health);
		setKey(0);
		setLocked(false);
	}//end preferred constructor
	
	/**
	 * This method processes the 
	 * damage to the object when 
	 * it is hit by other objects
	 * (e.g. weapons, lightening, etc.)
	 * @param power
	 */
	public void takeDamage(int power) {
		if(!locked) health = health - power;
	}//end takeDamage
	
	/**
	 * Sets locked true if the key parameter matches this.key.
	 */
	public void lock(int key) {
		if(key == this.key) locked = true;
	}//end lock
	
	/**
	 * Sets locked false if the key parameter matches this.key.
	 */
	public void unlock(int key) {
		if(key == this.key) locked = false;
	}//end unlock
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}//end getName
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}//end setName

	/**
	 * @return the health
	 */
	public int getHealth() {
		return health;
	}//end getHealth

	/**
	 * @param health the health to set
	 */
	public void setHealth(int health) {
		this.health = health;
	}//end setHealth

	/**
	 * @return the key
	 */
	public int getKey() {
		return key;
	}//end getKey

	/**
	 * @param key the key to set
	 */
	public void setKey(int key) {
		if((key > 0)&&(this.key == 0)) this.key = key;
	}//end setKey

	/**
	 * @return the locked
	 */
	public boolean isLocked() {
		return locked;
	}//end isLocked

	/**
	 * @param locked the locked to set
	 */
	public void setLocked(boolean locked) {
		this.locked = locked;
	}//end setLocked

	@Override
	public String toString() {
		return "Wizard [name=" + name + ", health=" + health + ", key=" + key + ", locked=" + locked + "]";
	}//end toString
	
}//end class
