package pucrs.s2b.exemplo02;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class AppTest2 {
	/*	VERIFICAR CÓDIGO
	 java.lang.IllegalArgumentException: Cannot parse parameters. Did you use ',' or '|' as column separator?
	 */
	@Test
	@FileParameters("src/teste.csv")
	public void paramTesteArquivo(int a, int b, int r){
		assertEquals(r, App.somar(a, b));
	}
}
