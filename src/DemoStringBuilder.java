
public class DemoStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create 2 StringBuilder
		StringBuilder str1 = new StringBuilder("JAVA ");
		StringBuilder str2 = new StringBuilder("ANDROID");
		// use append() to add str2 after str1
		str1.append(str2);
		System.out.println("str1 after append: " + str1);
		
		//insert Hello before str1
		str1.insert(0, "Hello ");
		System.out.println("str1 after insert: " + str1);
		
		//delete from index 6 to 10 in str1
		str1.delete(6, 10);
		System.out.println("str1 after delete: " + str1);
		
		// get length of str1
		int len1 = str1.length();
		System.out.println("Length of str1: " + len1);
		
		// get string from index 3 to 10 in str1
		String subStr = str1.substring(3, 10);
		System.out.println("Sub String: " + subStr);
		
	}

}
