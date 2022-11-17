/*Q1 : Write a Java program to create a new array list, add some elements (string) and
print out the collection by using for-each loop
 */

import java.util.*;
public class Q_1 {
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<String>();//created new array_list
        al.add("Ram"); //use add method to add elements in collection
        al.add("Sham");
        al.add("Rina");
        al.add("Rohan");
        al.add("Sita");

        System.out.println("The Created ArrayList : "+al);

        System.out.println("Printing ArrayList using foreach loop : ");
        for(String a : al) //use of foreach loop
        {
            System.out.println(a);
        }

    }
}
