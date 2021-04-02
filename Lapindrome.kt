/**
* https://www.codechef.com/problems/LAPIN
*
*
* Lapindromes Problem Code: LAPIN
*
* Lapindrome is defined as a string which when split in the middle, gives two halves 
* having the same characters and same frequency of each character. If there are odd 
* number of characters in the string, we ignore the middle character and check for 
* lapindrome. For example gaga is a lapindrome, since the two halves ga and ga have 
* the same characters with same frequency. Also, abccab, rotor and xyzxy are a few 
* examples of lapindromes. Note that abbaab is NOT a lapindrome. The two halves 
* contain the same characters but their frequencies do not match. 
* 
* Your task is simple. Given a string, you need to tell if it is a lapindrome.
* 
* Input:
* First line of input contains a single integer T, the number of test cases.
* Each test is a single line containing a string S composed of only lowercase English 
* alphabet.
* 
* Output:
* For each test case, output on a separate line: "YES" if the string is a lapindrome 
* and "NO" if it is not.
* 
* Constraints:
* 1 ≤ T ≤ 100
* 2 ≤ |S| ≤ 1000, where |S| denotes the length of S
* 
* 
* Example:
* Input:
* 6
* gaga
* abcde
* rotor
* xyzxy
* abbaab
* ababc
*
* Output:
* YES
* NO
* YES
* YES
* NO
* NO 
*/

fun main(){
	//val inpString = "gaga"
	//val inpString = "abcde"
	//val inpString = "rotor"
	//val inpString = "xyzxy"
	//val inpString = "abbaab"
	//val inpString = "ababc"
	//val inpString = "gotrej"
	//val inpString = "abcabcbb"
	//val inpString = "bbbbb"
	val inpString = "pwwkew"
	//val inpString = ""

	LapindromeCheck(inpString)
}

fun LapindromeCheck(inputString: String): String{
	var isLapindrome = "NO"
	var strLen = inputString.trim().length

	if (strLen == 0) {
		println("Is BLANK a Lapindrome? : $isLapindrome")
		return isLapindrome
	}

	char [] str1,str2;
	int l=s.length();
	if(l%2==0){
	str1= s.substring(0,(l/2)).toCharArray();
	str2= s.substring((l/2),l).toCharArray();
	}else{
	str1= s.substring(0,(l/2)).toCharArray();
	str2= s.substring((l/2)+1,l).toCharArray();
	}
	Arrays.sort(str1);
	Arrays.sort(str2);
	

	println("Is $inputString a Lapindrome? : $isLapindrome")
	return isLapindrome
}