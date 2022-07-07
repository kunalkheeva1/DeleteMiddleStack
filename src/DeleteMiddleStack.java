import java.util.Stack;

public class DeleteMiddleStack {

public static void deleteMiddleElementRec(int i, Stack<Integer>st, int n){
    if(i==n/2){
        st.pop();
        return;
    }
    int storage = st.pop();

    deleteMiddleElementRec(i+1, st, n);
    st.push(storage);
}

    public static void deleteMiddleStackElement(int i, Stack<Integer> st, int n){

    }

    public static void main(String[] args) {

    }
}
