/**
* Interface for locking an object in a D&D program.
*
* @author Andrew Ross-Sermons
* @version 1.0
* CS131; Lab #2
* Spring 2023
*/

public interface Lockable {
	public void setKey(int key);
	public void lock(int key);
	public void unlock(int key);
	public boolean isLocked();
}//end
