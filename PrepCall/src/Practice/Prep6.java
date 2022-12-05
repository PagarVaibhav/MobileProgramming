package Practice;
//Print the square of diagonal elements from reverse,
//eg1,
//[[1,2,3], [4,5,6], [7,8,9]]
//Output
//81
//25   
//1
public class Prep6 {

	public static void main(String[] args) {
		
		int a [][] = {{1,2,3},
				      {4,5,6},
				      {7,8,9}};
		
		String str="";
		
		for(int i=0;i<a.length;i++) {
			for(int j=0; j<a.length;j++) {
				
				if(a[i]==a[j]) {
					str=(a[i][j]*a[i][j])+ " ," +str;
				}
			}
		}
		System.out.println(str);
	}
}
