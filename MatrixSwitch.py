import numpy as np

def main():
    matrix1= np.array([[1,2,3,4],
                [5,6,7,8],
                [9,10,11,12],
                [13,14,15,16]])

    matrix2= np.array([[0,0,0,0],
                [0,0,0,0],
                [0,0,0,0],
                [0,0,0,0]])

    matrix1_len=len(matrix1)
    for i in range(0,matrix1_len):
        for j in range(0,matrix1_len):
            matrix2[j][matrix1_len-i-1]=matrix1[i][j]

    print(matrix2)


if __name__ == '__main__':
    main()