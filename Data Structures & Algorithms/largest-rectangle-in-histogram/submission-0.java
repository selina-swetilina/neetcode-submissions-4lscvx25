class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];
        for(int i = 0; i < n; i++){
            if(s.isEmpty() || heights[s.peek()] <= heights[i]){
                s.push(i);
            }
            else{
                while(!s.isEmpty() && heights[s.peek()] > heights[i]){
                    int index = s.peek();
                    right[index] = i;
                    s.pop();
                    if(s.isEmpty()){
                        left[index] = 0;
                        break;
                    }
                    left[index] = s.peek() + 1;
                }
                s.push(i);
            }
        }
        while(!s.isEmpty()){
            int index = s.peek();
            right[index] = n;
            s.pop();
            if(s.isEmpty()){
                left[index] = 0;
                break;
            }
            left[index] = s.peek() + 1;
        }
        int area = 0;
        int tempArea = 0;
        for(int i = 0; i < n; i++){
            tempArea = heights[i] * (right[i] - left[i]);
            if(tempArea > area){
                area = tempArea;
            }
        }
        return area;
    }
}