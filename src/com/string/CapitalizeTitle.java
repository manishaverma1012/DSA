package src.com.string;

public class CapitalizeTitle {

	public static void main(String[] args) {
		String title="First leTTeR of EACH Word";
		StringBuilder sb=new StringBuilder();
		System.out.println(title.length());
		int i=1;
		sb.append(Character.toUpperCase(title.charAt(0)));
		while(i<title.length())
		{
			if(title.charAt(i)==' '&& i<title.length())
			{
				sb.append(' ');
				
				sb.append(Character.toUpperCase(title.charAt(i+1)));
				i=i+2;
				
					
			}
			sb.append(Character.toLowerCase(title.charAt(i)));
			i++;
				
			
		}
		System.out.println(sb.toString());
		
	

	}
    

}
