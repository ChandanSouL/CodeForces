def min_moves_to_center(matrix):
    for i in range(5):
        for j in range(5):
            if matrix[i][j] == 1:
                current_row, current_col = i + 1, j + 1
                break

    row_moves = abs(current_row - 3)
    col_moves = abs(current_col - 3)

    return row_moves + col_moves

matrix = []
for _ in range(5):
    row = list(map(int, input().split()))
    matrix.append(row)

result = min_moves_to_center(matrix)
print(result)