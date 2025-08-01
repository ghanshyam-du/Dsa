
def linearSearch(arr, x):
    for i in range(len(arr)):
        if(arr[i]== x):
            return i 

    return -1    



arr = [20,45,27,47,75,67,78,88,90]
x= 68
result = linearSearch(arr, x)
print("Searching element is present in the index number:", result)