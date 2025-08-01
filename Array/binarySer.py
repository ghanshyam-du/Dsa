
def binarySearch(arr, left, right, x):

    while(left < right):
        mid = int((left + right)/2)

        if arr[mid] == x:
            return mid
        elif arr[mid] < x:
            return binarySearch(arr,mid+1, right, x)
        else:
            return binarySearch(arr,left, mid-1, x)
    return -1            
    

arr = [1,2,3,4,5,6,7,8,9,10]
x = 9
left = 0
right = len(arr)-1
result = binarySearch(arr, left, right,x)
print("the index number of the element is :",result)