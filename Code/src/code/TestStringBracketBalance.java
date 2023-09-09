package code;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.stream.Collectors;

public class TestStringBracketBalance {
	public static void main(String[] args) {
		
		 String input = "{[()]}}";
	        
	        boolean isBalanced = isBalanced(input);
	        
	        if (isBalanced) {
	            System.out.println("The brackets in the string are balanced.");
	        } else {
	            System.out.println("The brackets in the string are not balanced.");
	        }
	}

	private static boolean isBalanced(String input) {
		Deque<Character> stack = new ArrayDeque<>();
		System.out.println();
		return input.chars().
		mapToObj(c -> (char)c).
		allMatch(c -> {
			if(isOpenBracket(c))
			{
				stack.push(c);
				System.out.println(stack);
				return true;
			}
			else if(isClosebracket(c))
			{
				if (stack.isEmpty()) {
                    return false;
                }
				
				char r = stack.pop();
				return isMatchingBracket(c,r);
			}
			return false;
		});
		
		
		
	}

	private static boolean isMatchingBracket(char close, char open) {
		
		 return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
	}

	

	private static boolean isClosebracket(Character c) {
		
		 return c == ')' || c == ']' || c == '}';
	}

	private static boolean isOpenBracket(Character c) {
			return c == '(' || c == '[' || c == '{';
	}

}
