import java.util.Scanner;

public class arrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=0;
		int result = 0;
		int count=1; 
		int size=0;
		boolean flag=true;
		
		int[] myArray=new int[100];
		int[] numberofTimes=new int[100];
		
		int myArraysize=0;
							
		System.out.println("Enter the size of the input integer (S) : ");
		Scanner sc = new Scanner(System.in);
		size = sc.nextInt();
		
		if (size==0) {
			System.out.println("Program Ends!");
		}
		
		if (size!=0)  {
		System.out.println("Enter an integer of size "+size+" (N) : ");
		input = sc.nextInt();
		String inoutSize=""+input;
		myArraysize=inoutSize.length();
		 
		if (input!=0) {
		for (int i=inoutSize.length()-1;i>=0&&inoutSize.length()>0;i--) {
			result = input % 10;
			myArray[i] = result;
			input = input/10;
		}
		 
		if (size==myArraysize) {
		for (int j=0; j<=myArraysize-1; j++) {
			count=0;
			for (int k=0; k<myArraysize; k++) {
				if (myArray[j]==myArray[k]) {
					count++;
				}
			}
			numberofTimes[j]=count;
		}
		for (int j=0;j<myArraysize-1;j++) {
			if (numberofTimes[j]!=numberofTimes[j+1]) {
				flag=false;
				break;
			}
		}
		if (flag==false) {
			System.out.println("NO");
		}
		else {
			System.out.println("YES");
		}
		
	}
	else  {
		System.out.println("Size of the input integer (S) & the Integer size (N) are different ! Program ends!");
	}
	
 }
 else {
	 System.out.println("Program Ends!");
 }
}
sc.close();
}
}
