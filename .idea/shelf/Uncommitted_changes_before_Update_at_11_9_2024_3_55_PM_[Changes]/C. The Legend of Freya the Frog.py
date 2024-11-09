t = int(input())
for i in range(t):
    x,y,k = map(int, input().split())
    ans = 0
    ans += 2 * max((x + k-1)//k, (y + k-1)//k)

    if  (x + k-1)//k > (y + k-1)//k:
        ans -=1 
    print(int(ans)) 
