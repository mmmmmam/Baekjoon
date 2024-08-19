function solution(n, words) {
    const usedWords = new Set();  // 단어의 중복 여부를 체크할 Set
    let lastChar = '';  // 앞서 말한 단어의 마지막 문자
    let currentPlayer = 0;  // 현재 플레이어의 인덱스 (0부터 시작)

    for (let i = 0; i < words.length; i++) {
        const word = words[i];
        
        // 첫 단어가 아니면, 앞서 말한 단어의 마지막 문자와 비교
        if (i > 0 && word[0] !== lastChar) {
            return [currentPlayer + 1, Math.floor(i / n) + 1];
        }

        // 단어가 중복되었는지 체크
        if (usedWords.has(word) || word.length === 1) {
            return [currentPlayer + 1, Math.floor(i / n) + 1];
        }

        // 단어를 사용한 것으로 표시
        usedWords.add(word);
        lastChar = word[word.length - 1];  // 현재 단어의 마지막 문자 업데이트
        currentPlayer = (currentPlayer + 1) % n;  // 현재 플레이어 업데이트
    }

    // 모든 단어가 규칙에 맞게 진행된 경우
    return [0, 0];
}