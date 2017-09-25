import java.util.StringTokenizer;

/*public class Example {
	public static void main(String args[]) {
		String s1 = "Sahiti";
		char ch[] = { 's', 'n', 'i', 'g', 'd', 'h', 'a' };
		String s2 = new String(ch);
		String s3 = new String("Savi");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}*/

// Comparing a String

/*public class Example {
	public static void main(String[] args) {
		String s1 = "SaaS";
		String s2 = "SaaS";
		String s3 = new String("Less");
		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
	}
}*/

//Search Last String

/*public class Example {
	public static void main(String[] args) {
		String strOrig = "Hello world ,Hello Reader";
		int lastIndex = strOrig.lastIndexOf("Hello");

		if (lastIndex == -1) {
			System.out.println("Hello not found");
		} else {
			System.out.println("Last occurrence of Hello is at index " + lastIndex);
		}
	}
}*/

//Replacing a Sub String

/*public class Example {
	public static void main(String args[]) {
		String str = "String";
		System.out.println(str.replace('S', 'T'));
		System.out.println(str.replaceFirst("St", "Tr"));
		System.out.println(str.replaceAll("Ri", "Ha"));
	}
}*/

//Reverse String

/*public class Example{
   public static void main(String[] args) {
      String string = "Pochi";
		String reverse = new StringBuffer(string).reverse().toString();
      System.out.println("Before: "+string);
      System.out.println("After : "+reverse);
   }
}*/

//Search String 

/*public class Example{
   public static void main(String[] args) {
      String strOrig = "Hello All";
      int intIndex = strOrig.indexOf("All");
      
      if(intIndex == - 1) {
         System.out.println("All not found");
      } else {
         System.out.println("Found All at index " + intIndex);
      }
   }
}*/

// Search object in particular Strings

/*public class Example {
   public static void main(String[] args) {
      String text = "Impossible can be spelt as I am possible ";
      System.out.print(text.contains("am"));
   }
}*/

//Split a String

/*public class Example {
	public static void main(String args[]) {
		String s1 = "S N I G D H A";
		String[] words = s1.split("\\s");
		for (String w : words) {
			System.out.println(w);
		}
	}
}*/

//String UpperCase

/*public class Example {
   public static void main(String[] args) {
      String str = " savi  ";
      String strUpper = str.toUpperCase();
      System.out.println("Original String: " + str);
      System.out.println("String: " + strUpper);
   }
}*/

// String LowerCase

/*public class Example {
   public static void main(String[] args) {
      String str = " SAVI  ";
      String strLower = str.toLowerCase();
      System.out.println("Original String: " + str);
      System.out.println("String: " + strLower);
   }
}*/

//Comparing String Buffer

/*public class Example {

	public static void main(String a[]) {

		String c = "Hello World";
		StringBuffer sb = new StringBuffer("Hello Universe");
		if (c.contentEquals(sb)) {
			System.out.println("The content is equal");
		} else {
			System.out.println("The content is not equal");
		}
		StringBuffer asb = new StringBuffer("Hello Universe");
		if (c.contentEquals(asb)) {
			System.out.println("The content is equal");
		} else {
			System.out.println("The content is not equal");
		}
	}
}*/

//

/*public class Example {

	public static int getLineCount(String text) {

		return text.split("[\n|\r]").length;
	}

	public static void main(String a[]) {

		String str = "line1\nline2\nline3\rline4";
		System.out.println(str);
		int count = getLineCount(str);
		System.out.println("Count: " + count);
	}
}*/

// Remove Spaces
 
/*public class Example{
    public static void main(String a[]){
        String str = "  Hello  ";
        System.out.println(str.trim());
    }
}*/

// Trim multiple Spaces

/*public class Example {
    public static void main(String a[]){
        String str = "Hello      Everyone    Hi";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();
        while(st.hasMoreElements()){
            sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}*/
 
//String Buffer

public class Example {
	   public static void main(String []args) {
	      StringBuffer sb = new StringBuffer("hello");
	      sb.append("world");
	      sb.insert(0, "I am Great");
	      System.out.print(sb);
	   }
	}


 
//