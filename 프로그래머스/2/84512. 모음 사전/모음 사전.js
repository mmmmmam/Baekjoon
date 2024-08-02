function solution(word) {
    const vowels = ['A', 'E', 'I', 'O', 'U'];
    const lengthFactors = [781, 156, 31, 6, 1]; // 각 자리에서의 기여도 미리 계산

    let index = 0;
    
    for (let i = 0; i < word.length; i++) {
        // 모음의 위치를 찾습니다.
        const position = vowels.indexOf(word[i]);
        
        // 이 글자가 사전 순서에 미치는 기여도를 계산합니다.
        index += position * lengthFactors[i] + 1;
    }

    return index;
}