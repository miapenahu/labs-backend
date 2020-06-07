package co.edu.unal.software_engineering.labs;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class LabsApplicationTests{

	@Test
	public void testAssertionSuccess()
	{
		String expected = "apples";
		String actualCorrect = "apples";
		String actualIncorrect = "bananas";
		String assertionFailedMessage = "Sorry, this assertion has failed :(";

		assertEquals(assertionFailedMessage,expected,actualCorrect);
	}

/*	@Test
	public void testAssertionFailed()
	{
		String expected = "apples";
		String actualCorrect = "apples";
		String actualIncorrect = "bananas";
		String assertionFailedMessage = "Sorry, this assertion has failed :(";

		assertEquals(assertionFailedMessage,expected,actualIncorrect);
	}
*/
}

