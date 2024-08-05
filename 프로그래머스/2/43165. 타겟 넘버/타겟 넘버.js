function solution(numbers, target) {
    let count = 0;

    function dfs(index, currentSum) {
        // 모든 숫자를 사용했을 때
        if (index === numbers.length) {
            if (currentSum === target) {
                count++;
            }
            return;
        }

        // 현재 숫자를 더하는 경우
        dfs(index + 1, currentSum + numbers[index]);
        
        // 현재 숫자를 빼는 경우
        dfs(index + 1, currentSum - numbers[index]);
    }

    // DFS 시작
    dfs(0, 0);

    return count;
}