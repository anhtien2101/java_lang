
public class DemoStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create 2 StringBuffer
		StringBuffer str1 = new StringBuffer("Hello");
		StringBuffer str2 = new StringBuffer("2016");
		// use append() to add str2 after str1
		str1.append(str2);
		System.out.println("After append: " + str1);
		
		// Insert str2 to index 1 of str1
		str1.insert(1,str2);
		System.out.println("After Insert: " + str1);
		
		// replace index 1 in str1 by E
		str1.replace(1, 1, " E ");
		System.out.println(str1);
		
		// reverse str2
		str2.reverse();
		System.out.println("str2 After reverse: " + str2);
	}
}
