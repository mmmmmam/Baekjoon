def solution(topping):
    n = len(topping)
    
    # 각 위치에서의 토핑 종류 수를 저장할 리스트
    left_counts = [0] * n
    right_counts = [0] * n
    
    # 왼쪽에서부터 토핑 종류를 추적
    left_topping = set()
    for i in range(n):
        left_topping.add(topping[i])
        left_counts[i] = len(left_topping)
    
    # 오른쪽에서부터 토핑 종류를 추적
    right_topping = set()
    for i in range(n - 1, -1, -1):
        right_topping.add(topping[i])
        right_counts[i] = len(right_topping)
    
    # 공평하게 자를 수 있는 위치를 계산
    count = 0
    for i in range(n - 1):  # 마지막 인덱스는 자를 수 없으므로 제외
        if left_counts[i] == right_counts[i + 1]:
            count += 1
    
    return count