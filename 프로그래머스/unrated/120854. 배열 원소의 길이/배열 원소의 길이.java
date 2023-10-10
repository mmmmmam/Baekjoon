class Solution {
    public int[] solution(String[] strlist) {
        int[] result = new int[strlist.length];
		
		for(int i = 0;i<strlist.length;i++) {
			result[i] = strlist[i].length(); //result배열 i번지에 strlist배열 i번지의 길이 저장
		}
		//System.out.println(Arrays.toString(result));
		return result;
    }
}