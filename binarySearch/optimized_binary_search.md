# 최적화된 이진 탐색 알고리즘

이진 탐색(Binary Search)은 정렬된 배열에서 특정 값을 찾는 알고리즘으로, 시간 복잡도는 O(log n)입니다.

## 기본 개념

이진 탐색의 기본 원리는 다음과 같습니다:
1. 배열의 중간 요소를 선택합니다.
2. 중간 요소와 찾고자 하는 값을 비교합니다.
3. 찾고자 하는 값이 중간 요소보다 작으면 왼쪽 부분 배열에서 검색을 계속합니다.
4. 찾고자 하는 값이 중간 요소보다 크면 오른쪽 부분 배열에서 검색을 계속합니다.
5. 찾고자 하는 값을 찾을 때까지 또는 부분 배열의 크기가 0이 될 때까지 위 과정을 반복합니다.

## 최적화 기법

일반적인 이진 탐색에서 더 나아가 다음과 같은 최적화 기법을 적용할 수 있습니다:

### 1. 중간값 계산 최적화

중간값을 계산할 때 `mid = (left + right) / 2` 대신 `mid = left + (right - left) / 2`를 사용하면 정수 오버플로우를 방지할 수 있습니다.

### 2. 인덱스 계산 최적화

특정 조건에서는 이진 탐색의 종료 조건을 변경하여 연산 횟수를 줄일 수 있습니다.

### 3. 중복 요소 처리

중복 요소가 있는 배열에서 첫 번째 또는 마지막 위치를 찾는 방법:

```java
// 첫 번째 위치 찾기
public static int findFirstOccurrence(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    int result = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            result = mid;
            right = mid - 1;  // 왼쪽 부분 계속 검색
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return result;
}

// 마지막 위치 찾기
public static int findLastOccurrence(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    int result = -1;
    
    while (left <= right) {
        int mid = left + (right - left) / 2;
        
        if (arr[mid] == target) {
            result = mid;
            left = mid + 1;  // 오른쪽 부분 계속 검색
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    
    return result;
}
```

## 응용 예제

1. 최대값 또는 최소값 찾기
2. 특정 범위 내의 요소 개수 찾기
3. 근사값 찾기

이진 탐색은 대용량 데이터 처리, 데이터베이스 인덱싱, 컴퓨터 비전 등 다양한 분야에서 활용됩니다.
