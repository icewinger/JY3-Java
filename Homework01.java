import java.util.*;
public class Homework01
{
	public static void main(String[] args) 
	{
		int[] nums = {1,7,9,11,13,15,17,19};
		int[] nums2 = {2,4,6,8,10};
		int[] array = new int[13];
		System.arraycopy(nums,0,array,0,nums.length);
		System.arraycopy(nums2,0,array,8,nums2.length);
		int[] newArray = f(array);
		System.out.print(Arrays.toString(newArray));
	}
	public static int[] f(int[]array2)
	{
		for (int i=0;i<array2.length;i++ )
		{
			for (int j=0;j<array2.length-1-i ;j++ )
			{
				if (array2[j]>array2[j+1])
				{
					int temp = array2[j];
					array2[j] = array2[j+1];
					array2[j+1] = temp;
				}
			}
		}
		return array2;
	}
}