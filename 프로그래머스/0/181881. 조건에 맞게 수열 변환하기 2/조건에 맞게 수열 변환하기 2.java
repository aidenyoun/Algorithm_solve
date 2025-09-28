import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int x = 0;

        while (true) {
            // 1. 변환 이전 상태를 기록할 배열을 만듭니다.
            //    Arrays.copyOf()는 배열을 그대로 복사하는 편리한 방법이에요.
            int[] beforeArr = Arrays.copyOf(arr, arr.length);

            // 2. arr 배열의 모든 원소를 규칙에 따라 변환시킵니다.
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if (arr[i] < 50 && arr[i] % 2 != 0) {
                    arr[i] = arr[i] * 2 + 1;
                }
            }
            if (Arrays.equals(beforeArr, arr)) {
               
                break;
            }
            x++;
        }
        
        return x;
    }
}