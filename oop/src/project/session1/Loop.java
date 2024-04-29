package project.session1;

public class Loop {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++ ) {//outer loop-> rows
			for(int j=3;j>=i;j--) {//inner loop-> column
				System.out.print(j);
			}
			System.out.println();
			
		}

	}

}
/**
 * 
 * 33333
 * 33333
 * 33333
 * 
 * 
 *321
 *32
 *3 
 */
