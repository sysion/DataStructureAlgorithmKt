/**
* https://www.coderbyte.com/
*
*
* Find Intersection
*
* Have the function FindIntersection(strArr) read the array of strings stored in strArr 
* which will contain 2 elements: the first element will represent a list of comma-separated 
* numbers sorted in ascending order, the second element will represent a second list of 
* comma-separated numbers (also sorted). Your goal is to return a comma-separated string 
* containing the numbers that occur in elements of strArr in sorted order. If there is no 
* intersection, return the string false.
*
* Examples
* Input: ["1, 3, 4, 7, 13", "1, 2, 4, 13, 15"]
* Output: 1,4,13
*
* Input: ["1, 3, 9, 10, 17, 18", "1, 4, 9, 10"]
* Output: 1,9,10
*/
fun main(){
	val inpString: Array<String> = arrayOf<String>("1, 3, 4, 7, 13", "1, 2, 4, 13, 15")
	//val inpString: Array<String> = arrayOf<String>("1, 3, 9, 10, 17, 18", "1, 4, 9, 10")

	FindIntersection(inpString)
}


fun FindIntersection(strArr: Array<String>): String{
	val tmpFirst: List<String> = strArr[0].split(",")
	val tmpSecond: List<String> = strArr[1].split(",")

	var result = tmpFirst.filter{ tmpSecond.contains(it)}.joinToString().replace(" ", "")

	println("result = "+ result)		//check result

	return result
}