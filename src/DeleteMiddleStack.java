import java.util.Stack;

public class DeleteMiddleStack {

public static void deleteMiddleElementRec(int i, Stack<Integer>st, int n){

    // if index becomes n/2 at any time then just delete the element
    if(i==n/2){
        st.pop();
        return;
    }

    //until then store all the elements before n/2 int storage variable
    int storage = st.pop();
    // then for every call choose next i
    deleteMiddleElementRec(i+1, st, n);

    // after doing that just push the elements stored in storage
    st.push(storage);
}

    public static void deleteMiddleStackElement(Stack<Integer> st, int n){
    deleteMiddleElementRec(0,st,n);

    }

    public static void main(String[] args) {

    }
}
