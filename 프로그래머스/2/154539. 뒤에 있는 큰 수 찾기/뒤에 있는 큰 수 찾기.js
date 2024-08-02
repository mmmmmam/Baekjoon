function solution(numbers) {
    const n = numbers.length;
  const result = new Array(n).fill(-1); // 결과 배열을 -1로 초기화
  const stack = []; // 인덱스를 저장할 스택

  for (let i = 0; i < n; i++) {
    // 스택이 비어있지 않고 현재 숫자가 스택의 맨 위 숫자보다 큰 경우
    while (stack.length > 0 && numbers[i] > numbers[stack[stack.length - 1]]) {
      // 스택에서 인덱스를 꺼내고, 해당 인덱스의 결과를 현재 숫자로 설정
      const index = stack.pop();
      result[index] = numbers[i];
    }
    // 현재 인덱스를 스택에 추가
    stack.push(i);
  }

  return result;
}