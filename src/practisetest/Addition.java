package practisetest;

import javax.swing.SingleSelectionModel;

public class Addition {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		
	String str="pacteraedge";
	
	char OriginalStringArray[]=str.toCharArray();
	int len=OriginalStringArray.length;
	//char reverseString [];
	for(int i=len-1;i>=0;i--){
		
		System.out.print(""+OriginalStringArray[i]+"");*/
		int k=1;
		for(int i=0;i<=4;i++)
		{
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(k+" ");
				k++;
			}
			if(i<4)
			System.out.println();

		}
		
		int x=3;
		for(int i=4;i>0;i--)
		{
			for (int j = 1; j <=5-i; j++) {
				System.out.print(x+" ");
				x+=3;
			}
			System.out.println("");
		}

		
	
	}
}

	
	







