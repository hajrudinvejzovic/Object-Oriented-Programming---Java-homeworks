/* 1) package week3.java;

public class week3 {
	
	public class task1week3 {
	    public static void main(String[] args) {
	        double result = average(3,4,6,1);
	        System.out.println(result);
	    }


	public static double average(int num1, int num2, int num3, int num4) {
	    double result = num1 + num2 + num3 + num4/4;
	    return result;
	   }
	}


}*/

/* 2) import java.util.Scanner;
public class task2week3{

  public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter your name");
  String name = reader.nextLine();

  for (int i = 0; i < name.length(); i++) {
    System.out.println("character at: " + (i+1) + ".: " + name.charAt(i));
  }
}
} */

/* 3) import java.util.Scanner;
public class task3week3 {

  public static void main(String[] args) {
  Scanner reader = new Scanner(System.in);
  System.out.println("Enter your name");
  String name = reader.nextLine();

  for (int i = 0; i < name.length(); i++) {
    System.out.println("character at: " + (i+1) + ".: " + name.charAt(i));
  }
}
}   */

/* 4) import java.util.Scanner;
public class task4week3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = reader.nextLine();
      
        for (int i = name.length() - 1; i >= 0; i--){
          System.out.print(name.charAt(i));
    
}
    }
} */

/* 5) import java.util.Scanner;
public class task5week3 {
    
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the first word");
    String word1 = reader.nextLine();
    System.out.println("Enter the second word");
    String word2 = reader.nextLine();
  
    if (word2.contains(word1)) {
      System.out.println("The word is included");
  
      
    }
    
  }
  } */

/* 6) import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class task6week3 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        Scanner reader = new Scanner(System.in);
        
        
        while (true) {
          System.out.println("Enter the  word");
        String word = reader.nextLine();
        if (words.contains(word)) {
          System.out.println("Same word already exists!");
          break;
        }
        words.add(word);
      }
      
      Collections.sort(words);
      
      System.out.println("Ordered:" + words);
        
      }
      }
} */

/* 7)   import java.util.ArrayList;

public class task7week3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        lenghts lenghts = new lenghts();

        list.add("Java");
        list.add("Python");
        list.add("Ruby");
        list.add("Haskell");

        ArrayList<Integer> stringLenghts = lenghts(list);
        System.out.println(stringLenghts);

    }

    public static ArrayList<Integer> lenghts(ArrayList<String> strings) {
        ArrayList<Integer> list = new ArrayList<Integer>();
    
    
        for (String item : strings) {
            list.add(item.length());
        }
        return list;
    }
    
}*/

 /* 8) public class task8week3 {
    static boolean isPalindrome(String str)
    {
 
       
        int i = 0, j = str.length() - 1;
 
       
        while (i < j) {
 
           
            if (str.charAt(i) != str.charAt(j))
                return false;
 
            
            i++;
            j--;
        }
 
        
        return true;
    }

    public static void main(String[] args) {
        String str = "java";
        String str2 = "madam";
 
      
        System.out.print("String 1 :");
 
        if (isPalindrome(str))
            System.out.print("It is a pallindrome");
        else
            System.out.print("It is not a pallindrome");
 
       
        System.out.println();
 
        
        System.out.print("String 1 :");
        if (isPalindrome(str2))
            System.out.print("It is a pallindrome");
        else
            System.out.print("It is not a pallindrome"); */








