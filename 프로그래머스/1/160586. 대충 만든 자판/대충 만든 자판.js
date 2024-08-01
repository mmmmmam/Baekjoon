function solution(keymap, targets) {
    // 각 문자가 각 키에서 몇 번째에 있는지 저장하는 맵을 만듭니다.
    const charToKeyPresses = new Map();

    // keymap을 순회하면서 각 문자의 최소 키 입력 횟수를 계산합니다.
    keymap.forEach((key, index) => {
        for (let i = 0; i < key.length; i++) {
            const char = key[i];
            const presses = i + 1;
            if (!charToKeyPresses.has(char) || charToKeyPresses.get(char) > presses) {
                charToKeyPresses.set(char, presses);
            }
        }
    });

    // targets 배열을 순회하면서 각 문자열을 작성하는 데 필요한 최소 키 입력 횟수를 계산합니다.
    return targets.map(target => {
        let totalPresses = 0;

        for (let char of target) {
            if (!charToKeyPresses.has(char)) {
                return -1; // 목표 문자열을 작성할 수 없는 경우
            }
            totalPresses += charToKeyPresses.get(char);
        }

        return totalPresses;
    });
}

