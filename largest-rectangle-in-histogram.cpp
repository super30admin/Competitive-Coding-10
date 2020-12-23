// Using stacks
// Time Complexity: O(n) n = size of heights vector
// Space Complexity: O(n) 
class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        if(heights.size() == 0) return 0;
        stack<int> hts; // heights stack
        stack<int> pos; // position stack
        hts.push(heights[0]);
        pos.push(0);
        int maxArea = 0;
        for(int i = 1; i < heights.size(); i++) {
            if(hts.top() < heights[i]) {
                hts.push(heights[i]);
                pos.push(i);
            }
            else {
                int index = 0;
                while(hts.top() >= heights[i]) {
                    index = pos.top();
                    maxArea = max(maxArea, hts.top()*(i-index));
                    hts.pop();
                    pos.pop();
                    if (hts.empty() && pos.empty())
                        break;
                }
                hts.push(heights[i]);
                pos.push(index);
            }
        }
        
        while(!hts.empty()) {
            int temp = hts.top()*(heights.size()-pos.top());
            maxArea = max(maxArea, temp);
            hts.pop();
            pos.pop();
        }
        return maxArea;
    }
};

// Brute Force Solution
// Time Complexity: O(n^2) n = size of heights vector
// Space Complexity: O(1)

class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        int maxArea = 0;
        for(int i = 0; i < heights.size(); i++) {
            // index of immediate smaller bar on the left w.r.t. current bar
            // -1 indicates that there is no bar smaller than the current bar on the left side
            int left = -1; 
            // index of immediate smaller bar on the right w.r.t. current bar
            // -1 indicates that there is no bar smaller than the current bar on the right side
            int right = -1; 
            for(int j = i-1; j >= 0; j--) {
                if(heights[j] < heights[i]) {
                    left = j;
                    break;
                }
            }
            
            for(int j = i; j < heights.size(); j++) {
                if(heights[j] < heights[i]) {
                    right = j;
                    break;
                }
            }
            
            if(right == -1 && left == -1) {
                right = heights.size();
                left = 0;
                maxArea = max(maxArea, heights[i]*(right-left));
            }
            else if(right == -1 && left != -1) {
                right = heights.size()-1;
                maxArea = max(maxArea, heights[i]*(right-left));
            }
            else if(right != -1 && left == -1) {
                left = 0;
                maxArea = max(maxArea, heights[i]*(right-left));
            }
            else {
                maxArea = max(maxArea, heights[i]*(right-left-1));
            }
            
        }
        return maxArea;
    }
};

// Brute Force Solution
// Time Complexity: O(n^2) n = size of heights vector
// Space Complexity: O(1)
class Solution {
public:
    int largestRectangleArea(vector<int>& heights) {
        if(heights.size() == 0) return 0;
        int maxArea = 0;
        for(int i = 0; i < heights.size(); i++) {
            int minHeight = INT_MAX;
            for(int j = i; j < heights.size(); j++) {
                minHeight = min(minHeight, heights[j]);
                maxArea = max(maxArea, minHeight*(j-i+1));
            }
        }
        return maxArea;
    }
};
