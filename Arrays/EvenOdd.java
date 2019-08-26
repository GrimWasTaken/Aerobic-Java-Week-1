
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double arrSize = Math.random()*10;
		int arr[] = new int[(int)arrSize];
		int odd = 0;
		int even = 0;
		
		System.out.print("Random array: ");
		//Make
		for(int i = 0; i < arr.length; i++)
		{
			arr[i] = (int)(Math.random()*100);
			System.out.print(arr[i] + " ");
		}
		
		//Check
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] % 2 == 0)
				even ++;
			else odd ++;
		}
		System.out.println("");
		System.out.println("Number of even elements in the array:" + even);
		System.out.println("Number of odd elements in the array:" + odd);
	}

}
