/*This program is to find the sum of array using recursion.
 * Programmer: Jie Pan
 * Date: 02/22/2021
 */
public class ArraySum {

	//Return sum of elements in A[0 - i-1]
	public int sumOfArray(Integer[] myArray, int i) {
		
		if(i <= 0) {
			return 0;
		}
		
		return (sumOfArray(myArray, i-1) + myArray[i-1]);
	}

}
