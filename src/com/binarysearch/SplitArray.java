package src.com.binarysearch;

public class SplitArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int splitArray(int[] weights,int m)
	{
		int start=0;
		int end=0;
		for(int i=0;i<weights.length;i++)
		{
			start=Math.max(start,  weights[i]);
			end+=weights[i];
		}
		//binary search
		while(start<end)
		{
			//try for the middle as a potential answer
			int mid=start+(end-start)/2;
			//calculate how many pieces you can divide this innwith
			int sum=0;
			int pieces =1;
			for(int num :weights)
			{
				if(sum+num>mid)
				{
					//ypu cannot add this in this subarray, make a new array
					//say you add this num iin new subarray, then the sum=num
					sum=num;
					pieces++;
				}else
					{
						sum+=num;
					}
				}
			if(pieces >m)
			{
				start= mid+1;
			}
			else
			{
				end=mid;
			}
		}
		return end;  //here start==end
	}

}
