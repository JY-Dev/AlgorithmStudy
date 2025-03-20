# 이진 탐색 알고리즘 (Binary Search)

## 개요
이 구현은 GORANI-2 Jira 티켓의 일부로 작성되었습니다. 이진 탐색은 정렬된 배열에서 특정 값을 O(log n) 시간 복잡도로 찾는 효율적인 알고리즘입니다.

## 구현 사항
- 반복적 방식의 이진 탐색 구현
- Java 언어 사용
- 테스트 케이스 포함

## 사용 방법
```java
int[] sortedArray = {1, 3, 5, 7, 9, 11};
int target = 7;
int index = BinarySearch.binarySearch(sortedArray, target);
```

## 시간 복잡도
- 최악의 경우: O(log n)
- 평균: O(log n)
- 최선의 경우: O(1) (중앙값이 찾는 값인 경우)