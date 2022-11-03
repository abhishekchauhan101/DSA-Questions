package practice;
import java.util.*;
public class P14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="((a+b))";
		char[] c=s.toCharArray();
		Stack<Character> st=new Stack<>();
		boolean flag=true;
		for(char ch:c) {
			if(ch==')') {
				char top=st.peek();
				st.pop();
				while(top!='(') {
					if (top == '+' || top == '-'
                            || top == '*' || top == '/') {
						flag=false;
					}
					top=st.peek();
					st.pop();
				}
			}
			else {
				st.push(ch);
			}
			
		}
	}

}
