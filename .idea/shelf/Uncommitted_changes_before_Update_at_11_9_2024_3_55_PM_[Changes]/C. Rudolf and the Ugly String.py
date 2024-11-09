test = int(input())
for _ in range(test):
    n = int(input())
    s = input()
    i = 0
    count = 0
    while i <= len(s) - 3:
        if s[i:i+3] == "pie" or s[i:i+3] == "map":
            s = s[:i+1] + s[i+2:]
            count += 1 
        else:
            i += 1
    print(count)
    
