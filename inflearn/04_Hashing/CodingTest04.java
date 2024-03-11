package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CodingTest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strS = sc.next();
        String strT = sc.next();

        int cnt = 0;
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        //T문자열 해쉬맵에 넣어서 비교할 문자열 준비 완료
        for (char c : strT.toCharArray()) {
            mapT.put(c,mapT.getOrDefault(c,0)+1);
        }
        //S문자열수만큼 T문자열에서 잘라서 해쉬맵에 넣음 (비교할 것이다)
        for (int i = 0; i < strT.length(); i++) {
            mapS.put(strS.charAt(i),mapS.getOrDefault(strS.charAt(i),0)+1);
        }
        if(mapS.equals(mapT)){
            cnt++;
        }
        int lp = 0;
        for (int rp = strT.length(); rp < strS.length(); rp++) {
            mapS.put(strS.charAt(rp),mapS.getOrDefault(strS.charAt(rp),0)+1);

            if(mapS.get(strS.charAt(lp))>1){
                mapS.put(strS.charAt(lp),mapS.get(strS.charAt(lp))-1);
            }else{
                mapS.remove(strS.charAt(lp));
            }
            lp++;
            if(mapS.equals(mapT)){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
/*4.모든 아나그램 찾기 (Hash, sliding window : 시간복잡고 O(n))
설명
S문자열에서 T문자열과 아나그램이 되는 S의 부분문자열의 개수를 구하는 프로그램을 작성하세요.
아나그램 판별시 대소문자가 구분됩니다. 부분문자열은 연속된 문자열이어야 합니다.

입력
첫 줄에 첫 번째 S문자열이 입력되고, 두 번째 줄에 T문자열이 입력됩니다.
S문자열의 길이는 10,000을 넘지 않으며, T문자열은 S문자열보다 길이가 작거나 같습니다.

출력
S단어에 T문자열과 아나그램이 되는 부분문자열의 개수를 출력합니다.

예시 입력1
bacaAacba
abc

예시 출력1
3
 */