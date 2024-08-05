function solution(price, money, count) {
    let total = 0;

    // 총 비용을 계산
    for (let i = 1; i <= count; i++) {
        total += price * i;
    }

    // 부족한 금액 계산
    let answer = total > money ? total - money : 0;

    return answer;
}