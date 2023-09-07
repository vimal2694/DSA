package Strings;

import java.util.Stack;

public class MinimumParentheses {

	public static int checkValidParenthesis(String s) {
		int l = 0;
	    int r = 0;

	    for (final char c : s.toCharArray())
	      if (c == '(') {
	        ++l;
	      } else {
	        if (l == 0)
	          ++r;
	        else
	          --l;
	      }

	    return l + r;
	}

	public static void main(String[] args) {
		String str = "()))";
		System.out.println(checkValidParenthesis(str));
	}

}
