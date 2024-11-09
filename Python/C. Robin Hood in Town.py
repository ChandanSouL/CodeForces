t = int(input())
for _ in range(t):
    n = int(input())
    arr = list(map(int, input().split()))
    
def robin(n,arr):
    sorted_arr = sorted(arr)
    low =0
    high = len(arr) - 1
    summ = sum(arr)
    if n == 1 or n==0:
        return -1
    mid = low + high // 2
    avg = summ /n
    if avg > arr[mid]:
        low  
    