package Practise;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ArrayListManipulsion {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(null);
		al.add(null);
		al.add(null);
		al.add(null);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			// System.out.println(itr.next());
		}
		HashSet hs = new HashSet();
		hs.add(null);
		// hs.add(null);
		// hs.add(null);
		// hs.add(null);
		Iterator itr1 = hs.iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next());

			Hashtable ht = new Hashtable();
			ht.put(null, null);
			// ht.put(null, null);
			// ht.put(null, null);
			Enumeration<Integer> e = ht.keys();
			while (e.hasMoreElements()) {
				int key = e.nextElement();

				System.out.println(key);
			}
		}
	}

}
