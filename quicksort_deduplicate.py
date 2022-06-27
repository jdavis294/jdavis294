import numpy as np

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


def deletedup(arr):
    #length of the array
    n= len(arr)
    """test cases: 
    if length of array is 0 return 0 
    if length of array is 1 return that one element"""
    # if the array doesn't have any elements return 0
    if n ==0:
        print("array is empty")
        return 0
    # if the array only has one element return that one element
    if n ==1:
        return arr
    # set a variable x to -1 for the previous element
    x=-1
    #temp array to hold elements
    temparr=[]
    for i in range(n):
        """if the next element in the array isn't the same as the 
        previous set previous as that element. increment x as well"""
        if(arr[x]!=arr[i]):
            x+=1
            arr[x]=arr[i]
            temparr.append(arr[x])

    return temparr


def main():


    array=np.array([50,11,33,21,40,50,40,40,21])
    n=len(array)
    print("Before Sorting:" ,array)

    quicksort(array,0,n-1)
    print("After Sorting:", array)

    print("After Removing duplicates:", deletedup(array))

if __name__ == '__main__':
    main()