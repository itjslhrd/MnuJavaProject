package exam01;

public class Exam_02 {
	public static void main(String[] args) {
		String str="Korea";
		String str1="Korea";
		
		String str2 = new String("Korea");
		String str3 = new String("Korea");

		System.out.println("str == str1 : " + (str==str1));
		System.out.println("str.equals(str1) : " + str.equals(str1));
		System.out.println("str == str2 : " + (str==str2));		
		System.out.println("str.equals(str2) : " + str.equals(str2));
		
		
	}

}
