class Solution {
public int maxProduct(String[] words) {
// sort by word length in reverse order
// O(nlog(n))
Arrays.sort(words, (a, b) ->
Integer.compare(b.length(), a.length()));
System.out.println(Arrays.toString(words));
// encode each countMap as a 32 bit number
// O(1) for each word
int[] arr = new int[words.length];
for (int i = 0; i < words.length; i++) {
arr[i] = binaryEncode(words[i]);
}
System.out.println(Arrays.toString(arr));
String[] res = new String[words.length];
for (int i = 0; i < arr.length; i++) {
res[i] = Integer.toBinaryString(arr[i]);
}
System.out.println(Arrays.toString(res));
// and do a brute force O(n**2) comparaison
// starting with the largest two words first
// 1000 * 1000 = 1,000,000
// Overall time complexity is O(n**2)
// Space: O(n) or O(1000 * 64bits)
for (int i = 0; i < arr.length; i++) {
for (int j = i + 1; j < arr.length; j++) {
if ((arr[i] & arr[j]) == 0) {
return words[i].length() * words[j].length();
}
}
}
return 0;
}
private int binaryEncode(String word) {
int num = 0;
for (char c : word.toCharArray()) {
int d = c-'a';
num = num | (1 << d);
}
return num;
}
}