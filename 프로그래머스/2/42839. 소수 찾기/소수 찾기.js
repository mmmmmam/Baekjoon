function solution(numbers) {
    const isPrime = num => {
        if (num <= 1) return false;
        if (num <= 3) return true;
        if (num % 2 === 0 || num % 3 === 0) return false;
        for (let i = 5; i * i <= num; i += 6) {
            if (num % i === 0 || num % (i + 2) === 0) return false;
        }
        return true;
    };

    const getPermutations = (arr, length) => {
        const results = [];
        if (length === 1) return arr.map(el => [el]);

        arr.forEach((fixed, index, origin) => {
            const rest = origin.slice(0, index).concat(origin.slice(index + 1));
            const permutations = getPermutations(rest, length - 1);
            permutations.forEach(permutation => {
                results.push([fixed].concat(permutation));
            });
        });

        return results;
    };

    const nums = new Set();
    const digits = numbers.split('');
    
    for (let length = 1; length <= digits.length; length++) {
        const permutations = getPermutations(digits, length);
        permutations.forEach(permutation => {
            const num = parseInt(permutation.join(''), 10);
            if (num > 1) nums.add(num);
        });
    }

    let count = 0;
    nums.forEach(num => {
        if (isPrime(num)) count++;
    });

    return count;
}