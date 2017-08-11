/*
 * Comparator is the  capability of comparing two different types of objects. 
 * The method required for implementation is compare() or can by this method  
 *  Comparator can be used by sorting method . 
 * 
*/

package assignment18;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListClass {         //created the main class as ArrayListClass

	public static void main(String[] args) { //created main method 
		
		 HDTV tv1 = new HDTV(62, "Samsung"); //created three objects for the HDTV  class 
		  HDTV tv2 = new HDTV(38, "Reliance"); //and initializing the values in it 
		  HDTV tv3 = new HDTV(48, "Panasonic");
		  
		  //creating an ArrayList for HDTV class 
		  ArrayList<HDTV> arraylist = new ArrayList<HDTV>(); 
		  arraylist.add(tv1);  //here passing the objects of the hdtv class in the arraylist 
		  arraylist.add(tv2);
		  arraylist.add(tv3);
		 
		  System.out.println("HDTV objects which are sorted in order :");
		  Collections.sort(arraylist, new SizeComparator()); //here it sorts the elements in the arraylist by the size of comparator 
		  for (HDTV list : arraylist ) {      //here by using for each loop the elements will be sorted by the size and prints the brand names in the 
		   System.out.println(list.getBrand()); //sorted order 
		  }
	}}

		