/**
* https://leetcode.com/problems/two-sum/
* 
* Two Sum Less Than K
*
* Given an array of integers nums and an integer target, return indices of the 
* two numbers such that they add up to target.
*
* You may assume that each input would have exactly one solution, and you may 
* not use the same element twice.
*
* You can return the answer in any order.
*
* Example 1:
* Input: nums = [2,7,11,15], target = 9
* Output: [0,1]
* Output: Because nums[0] + nums[1] == 9, we return [0, 1].
*
* Example 2:
* Input: nums = [3,2,4], target = 6
* Output: [1,2]
*
* Example 3:
* Input: nums = [3,3], target = 6
* Output: [0,1]
* 
* Constraints:
*
* 2 <= nums.length <= 10^3
* -10^9 <= nums[i] <= 10^9
* -10^9 <= target <= 10^9
* Only one valid answer exists.
*/
import java.util.Arrays

fun main(){
	//val inputArray: IntArray = intArrayOf(2,7,11,15)
	//val targetSum = 9
	//val inputArray: IntArray = intArrayOf(3,2,4)
	//val targetSum = 6
	val inputArray: IntArray = intArrayOf(3,3)
	val targetSum = 6
	

	SumTwoNumbersEqualToTarget(inputArray, targetSum)
}

fun SumTwoNumbersEqualToTarget(intArray: IntArray, target: Int): IntArray {

	var result: IntArray = IntArray(2)
	val sumCheck: HashMap<Int, Int> = hashMapOf<Int, Int>()
	var sumPair = 0

	for (cnt in intArray.indices){
		sumPair = target - intArray[cnt]

		if (sumCheck.containsKey(sumPair)) {
			result[0] = sumCheck[sumPair]!!
			result[1] = cnt
		}
		sumCheck[intArray[cnt]] = cnt
	}

	println(Arrays.toString(result))
	return result
}