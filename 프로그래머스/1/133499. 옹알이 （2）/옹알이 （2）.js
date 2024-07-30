function solution(babbling) {
    const validBabblings = ["aya", "ye", "woo", "ma"];

    // 단어가 발음 가능한지 확인하는 함수
    function isValid(word) {
        let prev = '';
        while (word.length > 0) {
            let matched = false;
            for (const babble of validBabblings) {
                if (word.startsWith(babble)) {
                    if (prev === babble) return false; // 연속된 발음 방지
                    word = word.slice(babble.length); // 발음 부분 제거
                    prev = babble; // 이전 발음을 기록
                    matched = true;
                    break;
                }
            }
            if (!matched) return false; // 발음 가능한 부분이 없으면 false
        }
        return true;
    }

    let count = 0;

    for (const word of babbling) {
        if (isValid(word)) {
            count++;
        }
    }

    return count;
}