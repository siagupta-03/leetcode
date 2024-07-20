class MinStack {
    Stack<Long> st = new Stack<>();
        Long mini= Long.MAX_VALUE;

    public MinStack() {
       
      
        
    }
    
    public void push(int val) {
          
           Long val1 = Long.valueOf(val);

        if(st.isEmpty()){
            
            mini= val1;
            st.push(val1);
        }
        else {//val is 10 > 5 .. no need to update min
            if(val1>mini) st.push(val1);
            //oush the modified value
            else {st.push(2*val1- mini);
            //update the minimum value to the actual value
            mini=val1;}

        }
        
    }
    
    public void pop() {
        Long val= st.peek();

       // if(st.isEmpty())return -1;
       
           // long x =st.peek();
            st.pop();
            //8<10   10 was min actual  value and 8 is the modified value so i ll  have to return actual value and for that i ll retrun the modified value bavk to og
            if(val<mini) mini=2*mini- val;

        
        
    }
    
    public int top() {
          Long val = st.peek();

        if(st.isEmpty())return -1;
       
        if(val<mini) return mini.intValue();
        else  return val.intValue();
        
    }
    
    public int getMin() {
        return mini.intValue();
        
    }
        }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */