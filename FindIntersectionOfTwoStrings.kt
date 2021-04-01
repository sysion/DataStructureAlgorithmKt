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

class FindIntersectionOfTwoStrings {
	fun main(){
		//val stringsOrNulls = arrayOfNulls<String>(10) 	//returns Array<String?>
		//val someStrings = Array<String>(5) { "it = $it" }
		//val otherStrings = arrayOf("a", "b", "c")
		//val inpString: Array<String> = arrayOf("1, 3, 4, 7, 13", "1, 2, 4, 13, 15")
		val inpString: Array<String> = arrayOf("1, 3, 9, 10, 17, 18", "1, 4, 9, 10")
		//val inpString: Array<String> = arrayOf("2, 3, 8, 12, 17, 18", "1, 4, 9, 10")

		FindIntersection(inpString)
	}

	fun FindIntersection(strArr: Array<String>): String{
		var result = ""
		val tmpFirst: Array<String> = strArr[0].split(",")
		val tmpSecond: Array<String> = strArr[1].split(",")


		
		
		println("result = "+ result)

		return result
	}

}

/*
Huawei Ascend Mate 7
*/