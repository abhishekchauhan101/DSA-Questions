package string;

public class P4 {

	public static void main(String[] args) {
		String s1="ABCD";
		String s2="CDAB";
		String temp=s1+s1;
		if(temp.indexOf(s2)!=-1) {
			System.out.println("ROTATIONS");
		}
		else {
			System.out.println("NOT ROTATIONS");
		}
		

	}

}
