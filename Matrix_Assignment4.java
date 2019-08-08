
public class matrixDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mat[] [] = { {10, 20, 30, 40},
						 {15, 25, 35, 45},
						 {27, 29, 37, 48},
						 {32, 33, 39, 50}};
		int j=0;
		int k=0;
		
		for (int i=0; i<4; i++) {
			 k=i % 2;
			 if (k==0) {
				 j=0;
				 while (j<4) { 
				 System.out.print(mat[i][j]+ " ");
				 j++;
				 }
			 }
			 else {
				 j=3;			 
				 while (j>=0 && j<4 ) {
				 System.out.print(mat[i][j]+ " ");
				 j--;
			 }
			 }  
		}
	}
}