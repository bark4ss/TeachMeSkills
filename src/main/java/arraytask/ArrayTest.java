package arraytask;

public class ArrayTest {

	public static void main(String[] args) {
		int number = 2;
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = number;
			number+=2;	
		}
		StringBuilder builderLine = new StringBuilder();
		StringBuilder builderRow = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			builderLine.append(arr[i] + " ");
			builderRow.append(arr[i] + "\n");
		}
		System.out.println(builderLine.toString());
		System.out.println(builderRow.toString());

	}

}
