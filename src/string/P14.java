package string;

import java.util.*;

public class P14 {

	public static void main(String[] args) {
		String s="100";
		int ans1=0;
		int ans2=0;
		for(int i=0;i<s.length();i++){
			if(i%2==0 && s.charAt(i)=='1' || i%2==1 && s.charAt(i)=='0') {
				ans1++;
			}
			else if(i%2==0 && s.charAt(i)=='0' || i%2==1 && s.charAt(i)=='1') {
				ans2++;
			}
		}
		System.out.println(Math.min(ans1, ans2));

	}

}
