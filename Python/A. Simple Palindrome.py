def solve():
    vowel = 'aeiou'
    vowels = ''

    if n > 5:
        for i in range(n):
            vowels += vowel[i % 5]  # Use modulo to wrap around the vowel string
    else:
        for i in range(n):
            vowels += vowel[i]

    # Sort the vowels in reverse order and join them back into a string
    sorted_vowels = ''.join(sorted(vowels, reverse=True))
    return sorted_vowels

t = int(input())
for _ in range(t):
    n = int(input())
    print(solve())
