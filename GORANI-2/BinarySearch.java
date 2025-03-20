/**
 * 이진 탐색 알고리즘 구현
 * 시간복잡도: O(log n)
 */
public class BinarySearch {
    
    /**
     * 정렬된 배열에서 특정 값을 찾는 이진 탐색 알고리즘
     * @param arr 정렬된 배열
     * @param target 찾고자 하는 값
     * @return 찾은 값의 인덱스, 없으면 -1 반환
     */
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // 찾은 경우 중간점 인덱스 반환
            if (arr[mid] == target) {
                return mid;
            }
            
            // 중간점 값이 찾고자 하는 값보다 작으면 오른쪽 부분 배열 탐색
            if (arr[mid] < target) {
                left = mid + 1;
            } 
            // 중간점 값이 찾고자 하는 값보다 크면 왼쪽 부분 배열 탐색
            else {
                right = mid - 1;
            }
        }
        
        // 찾고자 하는 값이 배열에 없는 경우
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17};
        int target = 7;
        
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("요소가 인덱스 " + result + "에서 발견되었습니다.");
        } else {
            System.out.println("요소가 배열에 존재하지 않습니다.");
        }
    }
}