package code;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArraListt {

	public static void main(String[] args) {
	List<Integer> lis = new ArrayList<Integer>();
	lis.add(0);
	lis.add(1);
	lis.add(2);
	lis.add(3);
	lis.add(4);
	lis.add(5);
	lis.add(6);
	lis.add(7);
	lis.add(8);
	lis.add(9);
	lis.add(10);
	lis.remove(3);
	System.out.println(lis);
	Vector<Integer> ve = new Vector<Integer>();
	ve.add(34);
	ve.add(74);
	ve.add(84);
	ve.add(30);
	ve.add(36);
	ve.remove(4);
	System.out.println(ve);
	LinkedList<Integer> fr = new LinkedList<Integer>();
	fr.add(9);
	fr.add(87);
	fr.add(45);
	fr.remove(2);
	System.out.println(fr);
	
	}

}
