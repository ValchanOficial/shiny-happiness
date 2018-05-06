package pucrs.s2b.exemplo02;

public class App 
{
    public static void main( String[] args )
    {
    	int a = 20;
    	int b = 30;
    	int resultado = somar(a, b);
    	if(resultado == 50) {
    		System.out.print("Sucesso");
    	}else {
    		System.out.print("FALHA");
    	}
    }

    public static int somar(int a, int b) {
	int resultado = a+b;
	return resultado;
    } 
}