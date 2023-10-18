import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class NotNullAllowed {
	public static void main(String[] args) {
		//Collection<String> c = new ArrayList<>(); // [B, D, A, C, null, null, null]    order = yes    null = yes multiple
		//Collection<String> c = new HashSet<>();	// [null, A, B, C, D]		order = sorted     null = not multiple
		//Collection<String> c = new LinkedHashSet<>();	//  [B, D, A, C, null]  insertion order = yes    null = not multiple
		Collection<String> c = new TreeSet<>();	//  [A, B, C, D] -----need to comment null    null = not allowed   order sorted
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());
	}
}
