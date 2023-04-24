//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


// } Driver Code Ends
class Solution
{
    public:
    //Function to find a continuous sub-array which adds up to a given number.
    vector<int> subarraySum(int arr[], int n, long long s)
    {
        // Your code here
        int cur_sum=0;i=0,j=0,f=0;
        ArrayList<Integer> l=new ArrayList<>();
        for(i=0;i<n;i++)
        {
            cur_sum+=arr[i];
            while(cur_sum>=s)
            {
                if(cur_sum==s)
                {
                    f=1;
                    break;
                }
                cur_sum-=arr[j++];
            }
            if(f==1)
            {
                l.add(j+1);
                l.add(i+1);
            }
        }
        
        
    }
};

//{ Driver Code Starts.

int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        int n;
        long long s;
        cin>>n>>s;
        int arr[n];
        const int mx = 1e9;
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }
        Solution ob;
        vector<int>res;
        res = ob.subarraySum(arr, n, s);
        
        for(int i = 0;i<res.size();i++)
            cout<<res[i]<<" ";
        cout<<endl;
        
    }
	return 0;
}
// } Driver Code Ends