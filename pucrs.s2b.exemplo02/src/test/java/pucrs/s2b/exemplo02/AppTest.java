package pucrs.s2b.exemplo02;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class AppTest 
{
	@Test
	  @Parameters({"20, 30, 50", 
	               "0, 0, 0",
	               "2, 0, 2"})
	  public void paramTeste(int a, int b, int r) throws Exception {
		assertEquals(r, a+b);
	  }
}
