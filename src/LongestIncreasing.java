
public class LongestIncreasing {

	static int lis(int arr[], int a)
	{
		int lis[] = new int[a];
		int i, j, max = 0;

		
		for (i = 0; i < a; i++)
			lis[i] = 1;

		
		for (i = 1; i < a; i++)
			for (j = 0; j < i; j++)
				if (arr[i] > arr[j] && lis[i] < lis[j] + 1)
					lis[i] = lis[j] + 1;

		
		for (i = 0; i < a; i++)
			if (max < lis[i])
				max = lis[i];

		return max;
	}

	public static void main(String args[])
	{
		int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
		int n = arr.length;
		System.out.println("Length is " + lis(arr, n) + "\n" + "\n");
	}
}
