package stackAndQueue;
import java.util.*;
public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="24+46+*";
		Stack<Integer> st=new Stack<>();
		int n=s.length();
		int i=0;
		int ans=0;
		while(i<n) {
			if(s.charAt(i)=='+'||s.charAt(i)=='*'||s.charAt(i)=='/'||s.charAt(i)=='-') {
				int pop1=st.pop();
				int pop2=st.pop();
				if(s.charAt(i)=='+') {
					ans+=pop1+pop2;
				}
				else if(s.charAt(i)=='*') {
					ans+=pop1*pop2;
				}
				else if(s.charAt(i)=='-') {
					ans+=pop1-pop2;
				}
				else {
					ans+=pop1/pop2;
				}
				
				st.push(ans);
			}
			else{
				st.push(s.charAt(i)-'0');
			}
			
		}
		System.out.println(ans);
		
		

	}

}
