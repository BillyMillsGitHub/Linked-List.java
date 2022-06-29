package PractiseProjects;
import java.util.Iterator;
import java.util.LinkedList;
public class LinkedListRunner {

	public static void main(String[] args) {
	var staffName = new LinkedList<String>();
	staffName.add("Billy");
	staffName.add("Bob");
	staffName.add("David");
	staffName.add("Dev");
	staffName.remove("Dev");
System.out.println(staffName);

Iterator<String> itr = staffName.iterator();



while(itr.hasNext()) {
	System.out.println(itr.next());
}
System.out.println(staffName.size());

if (staffName.size() == 0) {
	System.out.println("No staff work here");
}
else {
	System.out.println(staffName.size());
}
if (staffName.size() == 3) {
	System.out.println("The specified amount of staff work here");
}

	}
	

}
