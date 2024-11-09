def solve():
    t = int(input())  # Number of test cases
    for _ in range(t):
        n = int(input())  # Number of fighters
        ratings = list(map(int, input().split()))  # Ratings of the fighters
        
        last = ratings[-1]
        second_last = ratings[-2]
        sum1 = 0
        for i in range(len(ratings)):
            sum1 += ratings[i]
        sum1 = sum1 - last - second_last
        sum1 = (sum1 - second_last) + last 
        print(sum1) 


# Input handling and calling the solve function
solve()
