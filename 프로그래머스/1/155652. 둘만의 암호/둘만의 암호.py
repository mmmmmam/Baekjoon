def solution(s, skip, index):
    # 결과를 저장할 리스트
    result = []

    # 각 문자를 index 만큼 이동시키는 작업을 수행
    for c in s:
        new_char = get_next_char(c, skip, index)
        result.append(new_char)

    return ''.join(result)

def get_next_char(c, skip, index):
    count = 0
    current_char = c

    # index 만큼 이동하되 skip에 포함된 문자들을 건너뜀
    while count < index:
        current_char = chr(ord(current_char) + 1)

        # 'z'를 넘어가면 'a'로 돌아옴
        if current_char > 'z':
            current_char = 'a'

        # skip에 포함된 문자가 아니라면 count 증가
        if current_char not in skip:
            count += 1

    return current_char
