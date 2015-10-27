package lesson151027;

import static org.junit.Assert.*;

import org.jmock.Expectations;
import org.jmock.integration.junit4.JMock;
import org.jmock.integration.junit4.JUnitRuleMockery;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


//@RunWith(JMock.class)// = @Rule below
public class ATest {

	@Rule public JUnitRuleMockery context = new JUnitRuleMockery();
	
	@Test
	public void test() {
		final Crashable c = context.mock(Crashable.class);
		
		A a = new A(c);
		
		context.checking(new Expectations() {{
//		    oneOf(c).crash();
		    this.atLeast(2).of(c).crash();
		}});
		a.destroy();
}
}
