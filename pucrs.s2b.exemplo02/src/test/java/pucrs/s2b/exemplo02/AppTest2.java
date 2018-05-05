package pucrs.s2b.exemplo02;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import junitparams.FileParameters;

public class AppTest2 {
	/*	VERIFICAR CÓDIGO*/
	@Test
	@FileParameters("src/teste.csv")
	public void paramTesteArquivo(int a, int b, int r){
		assertEquals(r, App.somar(a, b));
	}
}
