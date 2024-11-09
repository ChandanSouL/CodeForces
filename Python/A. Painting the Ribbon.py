'''Alice and Bob have bought a ribbon consisting of n
 parts. Now they want to paint it.

First, Alice will paint every part of the ribbon into one of m
 colors. For each part, she can choose its color arbitrarily.

Then, Bob will choose at most k
 parts of the ribbon and repaint them into the same color (he chooses the affected parts and the color arbitrarily).

Bob would like all parts to have the same color. However, Alice thinks that this is too dull, so she wants to paint the ribbon in such a way that Bob cannot make all parts have the same color.

Is it possible to paint the ribbon in such a way?

Input
The first line contains one integer t
 (1≤t≤1000
) — the number of test cases.

Each test case consists of one line containing three integers n
, m
 and k
 (1≤m,k≤n≤50
) — the number of parts, the number of colors and the number of parts Bob can repaint, respectively.

Output
For each test case, print YES if Alice can paint the ribbon so that Bob cannot make all parts have the same color. Otherwise, print NO.

You can print every letter in any register. For example, Yes, yes, yEs will all be recognized as positive answer.'''


def can_alice_win(n, m, k):
    # If Bob can repaint n-1 or more parts, he can make all parts the same color.
    # Alice will lose if Bob can repaint n-1 or more parts.
    if (n - (n//m + (n%m != 0)) <= k):
        return "NO"
    else:
        return "YES"
    
t = int(input())
for  _ in range(t):
    n,m,k = map(int, input().split())
    print(can_alice_win(n,m,k))


