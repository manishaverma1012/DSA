package src.com.Bitwise.bitwise;

public class Conversion {

	public static void main(String[] args) {
		/*hexa*/
		char a[]= {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
		StringBuilder sb=new StringBuilder();
		int num= 1515;
		if(num==0)
		{
			System.out.println("0");
		}
		while(num!=0)
		{
			sb.append(a[num & 15]);
			num=num>>4;
		}
		System.out.println(sb.reverse().toString());
//		
		
		/*octal*/
//		char a[]= {'0','1','2','3','4','5','6','7'};
//		
//		StringBuilder sb=new StringBuilder();
//		int num= 75;
//		System.out.println(Integer.toBinaryString(num));
//		if(num==0)
//		{
//			System.out.println("0");
//		}
//		while(num!=0)
//		{
//			sb.append(a[num & 7]);
//			System.out.println(num & 7);
//			num=num>>3;
//			System.out.println(num);
//		}
//		System.out.println(sb.reverse().toString());
		
		
		
		
	}

}
