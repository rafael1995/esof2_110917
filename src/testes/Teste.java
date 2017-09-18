package testes;

import org.junit.Assert;
import org.junit.Test;
import esof110917.Calcfatorial;


public class Teste {
	
	@Test
	public void teste1() {
		try{
			Calcfatorial.fatorial(-10);
			Assert.fail();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void teste2() {
		try{
			Long resultado = Calcfatorial.fatorial(0);
			Assert.assertEquals(resultado,1,0.001);	
		}catch(Exception e){
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
	@Test
	public void teste3() {
		try{
			Long resultado = Calcfatorial.fatorial(1);
			Assert.assertEquals(resultado,1,0.001);	
		}catch(Exception e){
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
	@Test
	public void teste4() {
		try{
			Long resultado = Calcfatorial.fatorial(5);
			Assert.assertEquals(resultado,120,0.001);	
		}catch(Exception e){
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
	@Test
	public void teste5() {
		try{
			Long resultado = Calcfatorial.fatorial(10);
			Assert.assertEquals(resultado,3628800,0.001);	
		}catch(Exception e){
			System.out.println(e.getMessage());
			Assert.fail();
		}
	}
	
	@Test
	public void teste6() {
		try{
			Calcfatorial.fatorial(500);
			Assert.fail();	
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
		
}
