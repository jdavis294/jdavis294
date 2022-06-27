
#algorithm to partition quick sort
def partition(arr,low,high):

    pivot=arr[high]
    i=low-1
    for j in range(low,high):
        #we swap elements here
        if (arr[j]<=pivot):
            i=i+1
            arr[i],arr[j]=arr[j],arr[i]
    arr[i+1],arr[high]=arr[high],arr[i+1]
    return i+1

#quicksort algorithm
def quicksort(arr,low,high):
    #first we take the length of the array
    n = len(arr)

    #if the array length is one return the array
    if(n==1):
        return arr
    if n==0:
        print("can not sort with out array elements")
        return 0
    if low<high :
        p= partition(arr,low,high)
        quicksort(arr,low,p-1)
        quicksort(arr,p+1,high)


#loopjoin algorithm
def loopjoin(arr1,arr2):
    """compares arr1 to arr2 if they have similar elements join them in a temp array then print out joined array"""
    array1_length= len(arr1)
    #variable to move through arr2
    j=0
    temp_arr=[]
    for i in range(array1_length):
        #if elements in arr1 is found in arr2 store in temp then increment j
        if(arr1[i]==arr2[j]):
            temp_arr.append(arr1[i])
            j+=1
    print(temp_arr)

def deleteDup(arr):
    # length of the array
    n = len(arr)
    """test cases: 
    if length of array is 0 return 0 
    if length of array is 1 return that one element"""
    # if the array doesn't have any elements return 0
    if n == 0:
        print("array is empty")
        return 0
    # if the array only has one element return that one element
    if n == 1:
        return arr
    # set a variable x to -1 for the previous element
    x = -1
    # temp array to hold elements
    temparr = []
    for i in range(n):
        """if the next element in the array isn't the same as the 
        previous set previous as that element. increment x as well"""
        if (arr[x] != arr[i]):
            x += 1
            arr[x] = arr[i]
            temparr.append(arr[x])

    return temparr

def main():
    array1 = []
    array2 = []

    num1= int(input("input number of array elements for array 1: "))
    num2 = int(input("input number of array elements for array 2: "))

    # checks if element type is str or int if it is a str prompt to enter a int instead of str
    if type(num1) is str or type(num2) is str :
        raise TypeError("Only integers are allowed")


    print("input elements for array 1: ")
    for i in range(num1):
        array1.append(int(input()))

    print("input elements for array2: ")
    for i in range(num2):
        array2.append(int(input()))

    quicksort(array1, 0, num1 - 1)
    quicksort(array2, 0, num2 - 1)

    loopjoin(deleteDup(array1),deleteDup(array2))

if __name__ == '__main__':
    main()