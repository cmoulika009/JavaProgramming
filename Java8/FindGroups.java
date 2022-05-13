import java.util.*;
class FindGroups{
 
// Function that prints the number
// of maximum groups
static void makeGroups(int a[], int n)
{
    int []v = new int[n + 1];
 
    // Store the number of
    // occurrence of elements
    for (int i = 0; i < n; i++)
    {
        v[a[i]]++;
    }
 
    int no_of_groups = 0;
 
    // Make all groups of similar
    // elements and store the
    // left numbers
    for (int i = 1; i <= n; i++) 
    {
        no_of_groups += v[i] / i;
 
        v[i] = v[i] % i;
    }
 
    int i = 1;
    int total = 0;
 
    for (i = 1; i <= n; i++) 
    {
        // Condition for finding first
        // leftover element
        if (v[i] != 0)
        {
            total = v[i];
            break;
        }
    }
 
    i++;
 
    while (i <= n) 
    {
        // Condition for current
        // leftover element
        if (v[i] != 0) 
        {
            total += v[i];
 
            // Condition if group size
            // is equal to or more than
            // current element
            if (total >= i) 
            {
                int rem = total - i;
                no_of_groups++;
                total = rem;
            }
        }
        i++;
    }
 
    // Printing maximum
    // number of groups
    System.out.print(no_of_groups + "\n");
}
 
// Driver Code
public static void main(String[] args)
{
    int arr[] = { 1,2,1,1,1,1,1,1};
 
    int size = arr.length;
 
    makeGroups(arr, size);
}
}