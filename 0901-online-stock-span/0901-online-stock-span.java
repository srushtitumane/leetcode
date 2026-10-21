class Pair
{
    int value;
    int idx;
    Pair(int value, int idx)
    {
        this.value = value;
        this.idx = idx;
    }
}
class StockSpanner {
    Stack<Pair> stack;
    int day = 0;
    public StockSpanner() {
        stack = new Stack<>();
    }
    
    public int next(int price) {

        while(!stack.isEmpty() && stack.peek().value <= price)
        {
            stack.pop();
        }
        
        int span;
        if(stack.isEmpty())
        {
            span = day+1;
        }
        else
            span = day - stack.peek().idx;

        stack.push(new Pair(price, day));
        day++;

        return span;
        
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */