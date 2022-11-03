package string;

import java.util.Stack;

public class P9 {

	public static void main(String[] args) {
		String s="{([)}";
		Stack<Character> st=new Stack<>();
		boolean ans=false;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='{' || s.charAt(i)=='(' ||  s.charAt(i)=='[') {
				st.push(s.charAt(i));
			}else if(s.charAt(i)=='}' ||s.charAt(i)==')' ||s.charAt(i)==']') {
				if(st.empty()==true || check(st.peek(),s.charAt(i))==false) {
					ans=false;
					
				}else {
					st.pop();
					ans=true;
				}
			}
		}
		System.out.println(ans);
		

	}
	public static boolean check(char a, char b) {
		if(a=='[' && b==']') {
			return true;
		}else if(a=='{' && b=='}') {
			return true;
		}else if(a=='(' && b==')') {
			return true;
		}else {
			return true;
		}
	}

}
