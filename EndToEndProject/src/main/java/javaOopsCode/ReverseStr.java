package javaOopsCode;

public class ReverseStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ReverseStr rs = new ReverseStr();
        rs.reverseString("Hello");
        rs.reverseString("My name is JAVA");
        rs.reverseString("Reverse String");
	}
	
	public void reverseString (String name) {
		
		for(int i=name.length()-1; i>=0; i--) {
			
			char reverse = name.charAt(i);
			System.out.print(reverse);
		}
		System.out.println(" ");
		
		
	}	

}
