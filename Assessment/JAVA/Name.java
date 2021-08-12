package project.first;
import java.util.*;
public class Name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter full Name:  ");
		String name = sc.nextLine();
	    System.out.print("Output is : ");
	    int len = name.length();
	      name = name.trim();
	      String str1 = "";
	      for (int i = 0; i < len; i++) {
	         char ch = name.charAt(i);
	         if (ch != ' ') {
	            str1 = str1 + ch;
	         } else {
	            System.out.print(Character.toUpperCase(str1.charAt(0)) + ". ");
	            str1 = "";
	         }
	      }
	      String str2 = "";
	      for (int j = 0; j < str1.length(); j++) {
	         if (j == 0)
	            str2 = str2 + Character.toUpperCase(str1.charAt(0));
	         else
	            str2 = str2 + Character.toLowerCase(str1.charAt(j));
	      }
	      System.out.println(str2);
	   }

}
