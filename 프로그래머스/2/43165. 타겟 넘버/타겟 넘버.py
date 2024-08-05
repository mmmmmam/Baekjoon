def solution(numbers, target):
    count = 0

    def dfs(index, current_sum):
        nonlocal count
        
        # 모든 숫자를 사용했을 때
        if index == len(numbers):
            if current_sum == target:
                count += 1
            return

        # 현재 숫자를 더하는 경우
        dfs(index + 1, current_sum + numbers[index])
        
        # 현재 숫자를 빼는 경우
        dfs(index + 1, current_sum - numbers[index])

    # DFS 시작
    dfs(0, 0)

    return count