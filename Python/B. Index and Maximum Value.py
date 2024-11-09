def IndexAndMaximumValue():
    t = int(input())  # Number of test cases
    for _ in range(t):
        n, m = map(int, input().split())  # n = array size, m = number of operations
        a = list(map(int, input().split()))  # Initial array

        # Difference array for range operations
        diff = [0] * (n + 1)

        # Process each operation
        for _ in range(m):
            c, l, r = input().split()
            l, r = int(l) - 1, int(r) - 1  # Convert 1-based index to 0-based

            if c == '+':
                diff[l] += 1
                if r + 1 < n:
                    diff[r + 1] -= 1
            elif c == '-':
                diff[l] -= 1
                if r + 1 < n:
                    diff[r + 1] += 1

        # Apply the difference array to modify the original array
        current_addition = 0
        for i in range(n):
            current_addition += diff[i]
            a[i] += current_addition

        # Print the maximum value in the array after all operations
        print(max(a))

# Example usage
IndexAndMaximumValue()
