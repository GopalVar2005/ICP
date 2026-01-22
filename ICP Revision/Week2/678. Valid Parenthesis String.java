class Solution {
    public boolean checkValidString(String s) {
        Stack<Integer> star=new Stack<>();
        Stack<Integer> open=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                open.push(i);
            }
            else if(ch==')')
            {
                if(open.isEmpty() && star.isEmpty())
                {
                    return false;
                }
                if(!open.isEmpty())
                {
                    open.pop();
                }
                else if(!star.isEmpty())
                {
                    star.pop();
                }
            }
            else
            {
                star.push(i);
            }
        }
        while(!open.isEmpty() && !star.isEmpty())
        {
            if(open.peek()<star.peek())
            {
                open.pop();
                star.pop();
            }
            else
            {
                break;
            }
        }
        return open.isEmpty();
    }
}
TC-O(N)
SC-O(N)
