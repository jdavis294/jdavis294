def arrange(original_array):

    length= len(original_array)
    temp=0

    for i in range(0, length):
        for j in range(0,length):
            if(original_array[i]<original_array[j]):
                temp=original_array[i]
                original_array[i]=original_array[j]
                original_array[j]=temp

    print(original_array)

def main():
    array1=[0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1]
    arrange(array1)
    
if __name__ == '__main__':
    main()