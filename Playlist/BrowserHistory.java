import java.util.Stack;


public class BrowserHistory {
    // 1. Write a Java program to implement the browser history functionality using linked list data structure.

    private Stack<String> history;

    private Stack<String> forwardStack;

    private BrowserHistory() {
        this.history = new Stack<>();
        this.forwardStack = new Stack<>();
        
    }
    
    public void visit(String url) {
        history.push(url);
        
    }
}
