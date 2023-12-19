package javaOopsCode;

public class MultiArrayIntQue {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][] = {{2,5,5},{7,3,0},{8,6,9}};
		//find the minimum number in array
		//identify mini num column
		//find the max num in identify column
		
		int min = a[0][0];
		int minCol = 0;
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=0; j<a.length; j++) {
				
				if(a[i][j]<min) {
					min = a[i][j];
					minCol = j;
				}
			}
		}
		System.out.println(min);
		System.out.println("minCol "+minCol);
		int x=0;
		int max = a[0][minCol];
		
		while(x<a.length) {
			
			if(a[x][minCol]>max) {
				max = a[x][minCol];
			}
			x++;
		}
		System.out.println(max);
	}
	
	

}
