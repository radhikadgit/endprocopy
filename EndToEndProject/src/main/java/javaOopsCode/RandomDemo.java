package javaOopsCode;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomDemo rm = new RandomDemo();
		rm.generateRandomString();
	}	
	
	public String generateRandomString() { 
		// Random is a java util class, create on object for random class to use random methods
		// random number 
		Random ran = new Random();
		int num = ran.nextInt(10);
		System.out.println(num);
	
        // random upper case alphabets
		// 65 is ASCII Table upper case alphabet A number. total 90 num till Z.
		// There is a formula: 65(lower level), 90(upper level)  
		// l.l + ran.nextInt(u.l - l.l + 1) 
		int j = 65 + ran.nextInt(26);
		char uc = (char) j;       //Type casting(changing int to char)
		System.out.println("random alphabets: "+uc);
		
		// lower case alphabets		
		int z = 97 + ran.nextInt(26);
		char lc = (char) z;
		System.out.println(lc);
		
		String randomString = uc+""+lc+""+num;
		System.out.println("random string: "+ randomString);
		return randomString;
	}

}
