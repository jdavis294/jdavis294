
def suffix(arr):
    temparray = arr.copy()
    n = len(arr)
    multi = temparray[0]
    for i in range(n-1,-1,-1):
        temparray[i]=multi*arr[i]
        multi = temparray[i]


    return temparray



def prefix(arr):
    temparray = arr.copy()
    n = len(arr)
    multi = arr[0]
    for i in range(n):
        arr[i] = temparray[i] * multi
        multi = arr[i]

    return arr
def main():


    arr = [1, 2, 3, 4]
    print(suffix(arr))
    print(prefix(arr))




if __name__ == '__main__':
    main()