class Solution {
public:
    bool dir(int a,int b)
    {
        if(a>0 && b<0)return false;
        return true;
    }
    vector<int> asteroidCollision(vector<int>& a) 
    {
        int n=a.size();
        stack<int>s;
        s.push(a[0]);
        int i=1;
        while(i<n)
        { 
            if(dir(s.top(),a[i]))
            {
                s.push(a[i]);
                
            }
            else if(abs(s.top())>abs(a[i]) && s.top()>0 && a[i]<0)
            {
                
            }
            // else if(abs(s.top())>abs(a[i]) && s.top()<0 && a[i]>0)
            // {
            //     s.push(a[i]);
            //     i++;
            // }
            else if(abs(s.top())==abs(a[i]) && s.top()>0 && a[i]<0){
                
                s.pop();
            }
            else 
            {   
                while(!dir(s.top(),a[i]) && abs(s.top())<abs(a[i]))
                {
                    s.pop();
                }
            }
            i++;
        }
        vector<int>ans;
        while(!s.empty())
        {
            ans.push_back(s.top());
            s.pop();
        }
        reverse(ans.begin(),ans.end());
        return ans;
    }
};