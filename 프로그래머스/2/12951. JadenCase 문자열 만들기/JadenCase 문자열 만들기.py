def solution(s):
    words = s.split(' ')
    jaden_cased_words = []

    for word in words:
        if word:  # Non-empty word
            jaden_cased_word = word[0].upper() + word[1:].lower()
        else:
            jaden_cased_word = ''
        jaden_cased_words.append(jaden_cased_word)
    
    # Join the words back with single spaces
    return ' '.join(jaden_cased_words)