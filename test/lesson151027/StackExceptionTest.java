package lesson151027;

import static org.junit.Assert.*;
import lesson151005.Stack;
import lesson151005.StackUnderflowException;

import org.junit.Test;

public class StackExceptionTest {

	@Test
	public void testPopWhenEmpty() {
		Stack<String> stack = new Stack<>(3);
		try {
			String result = stack.pop();
			fail();
		} catch (StackUnderflowException e) {
		}
	}
}
