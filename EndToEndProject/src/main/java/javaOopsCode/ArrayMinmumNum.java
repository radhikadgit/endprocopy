package javaOopsCode;

public class ArrayMinmumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       minimumNum();
	}
	
	public static void minimumNum() {
		int array[][] = {{3,6,8},{5,6,29},{2,0,7}};
		int min = array[0][0];
		for(int i=0; i<array.length; i++) {	
			
			for(int j=0; j<array.length; j++) {
				
			//	System.out.print(array[i][j]);
			//	System.out.print(" ");
				if(min>array[i][j]) {
				   min = array[i][j];
				}
				
			}
			System.out.println(" ");
		
		}
		System.out.println(min);
	}

}
