/**
 * @author Justynn Palmer
 *
 * @version 1.2
 * 
 * @since 10 minutes
 */

public class Reversal {

	/**
	 * 
	 * @param args Who knows?
	 * 
	 * @see Corner Chris
	 */
	public static void main(String[] args) {
		String sample = "This is the sample text";
		String[] storage = sample.split(" ");
		StringBuilder builder = new StringBuilder();
		String finalStorage = "";
		
		for(int i = 0; i < storage.length; i++)
		{
		storage[i] = new StringBuilder(storage[i]).reverse().toString();
		finalStorage += storage[i] + " ";
		}
		System.out.println(finalStorage);
	}
}
