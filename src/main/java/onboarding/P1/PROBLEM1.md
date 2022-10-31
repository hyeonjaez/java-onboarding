## 🚀 기능 요구 사항
### 포비와 크롱의 숫자를 입력 받을때
- 포비와 크롱의 길이는 2
- 왼쪽 홀수, 오른쪽 짝수
- 페이지 번호 1~400
- 첫페이지, 마지막 페이지 X ex) [1, 2], [399,400] X
- 오른쪽 숫자 - 왼쪽 숫자 = 1 이여야한다.
- 위와 같은 조건이 충족 되지 않으면 예외처리

### 점수 계산
- 번호를 모두 더하거나, 모두 곱한다
- 계산을 한 값에서 큰수를 구한다
- 왼쪽 과 오른쪽을 비교하여 큰수를 구한다


### 출력

- 그 큰수가 자기의 점수이고 포비와 크롱의 점수를 비교한다.
- 포비의 점수가 더 크면 1
- 크롱의 점수가 더 크면 2
- 같으면 0
- 예외처리가 되면 -1

### 실행 결과 예시

| pobi | crong | result |
| --- | --- | --- |
| [97, 98] | [197, 198] | 0 |
| [131, 132] | [211, 212] | 1 |
| [99, 102] | [211, 212] | -1 |