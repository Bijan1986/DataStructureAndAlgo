#BIG O NOTATATION

## Big O Notations

performance wise there are different scenarios an algorithm goes through .

So there are these 3 scenarios that we can talk about 
1. Best case O(N)
2. Average case O(N log N)
3. Worst case O(N^2)

so there are 3 types of notations 
1. Big O: it is a complexity that is going to be less or equal to the worst case.
2. Big Omega: it is a complexity that is going to be at least more than the best case .
3. Big Theta: it is a complexity that is within bounds of the worst and the best cases.


let's say there is an array of size 20(n) and we need to find one number from it .
if we will go with the usual searching way then lets assume it find the elements in each index in 1 sec .
which means to find the element in the last index it will take it 20 x 1 sec = 20 sec 


As per Big O it is : O (N)
As per Big Omega it will be : O (1) 
> as it is the minimum time it will take to find the element if it exists in the very first index .

As per Big Theta : Theta (n/2) 
>as it is the average time that will take to find the element .
> 


## Most common time complexities 
These are the most common complexities that we are going to see 

1. O (1) : name: constant   Sample: Accessing specific element in array 
2. O(N) : name : Linear  Sample: Loop through array elements
3. O(LogN): name: :Logarithmic sample: find an element in sorted array 
4. O(N^2): name : Quadratic sample: Looking at every index in the array twice .
5. O(2^N): name: Exponential sample: Double recursion in Fibonacci .


