class Solution {
public:
    string pushDominoes(string d) {
        int n = d.size();
        // modify array slightly ( this is needed )
        d="L"+ d +"R";
        int l=0,r=1,ptr1,ptr2;
        while(l <= (n+1) && r <= (n+1)){
            while(d[r]=='.'){
                r++;
            }
            if(d[l] == 'R' && d[r] == 'L'){
                ptr1=l+1,ptr2=r-1;
                while(ptr1 < ptr2){
                    d[ptr1]='R'; d[ptr2]='L'; ptr1++; ptr2--;
                }
            }else if(d[l]=='L' && d[r]=='L'){
                ptr2=r-1;
                while(ptr2 > l){
                    d[ptr2]='L'; ptr2--;
                }
            }else if(d[l]=='R' && d[r]=='R'){
                ptr1 = l+1;
                while(ptr1 < r){
                    d[ptr1]='R'; ptr1++;
                }
            }
            l = r;
            r++;
        }
        return d.substr(1,n);
    }
};
