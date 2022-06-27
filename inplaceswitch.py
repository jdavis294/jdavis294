import numpy as np


def main():
    matrix1 = np.array([[1, 2, 3, 4],
                        [5, 6, 7, 8],
                        [9, 10, 11, 12],
                        [13, 14, 15, 16]])

    matrix1_len=len(matrix1)

    for i in range(matrix1_len):
        for j in range(i):
            matrix1[i][j], matrix1[j][i] = matrix1[j][i], matrix1[i][j]

    matrix1 = np.fliplr(matrix1)
    print(matrix1)

if __name__ == '__main__':
    main()
