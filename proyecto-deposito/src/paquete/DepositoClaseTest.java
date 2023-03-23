package paquete;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DepositoClaseTest {
	
	private DepositoClase d;
	
	@BeforeEach
	public void crearDeposito() {
		
		d = new DepositoClase(10,5,"111");
		
	}
	
	@Test
	void getDiametrotest() {
		float valorEsperado = 10;
		float resultado=d.getDiametro();
		
		assertEquals(valorEsperado, resultado);
		
	}
	
	@Test
	void getAlturatest() {
		float valorEsperado = 5;
		float resultado=d.getAltura();
		
		assertEquals(valorEsperado, resultado);
		
	}
	
	@Test
	void getIdtest() {
		String valorEsperado = "111";
		String resultado=d.getIdDeposito();
		
		assertEquals(valorEsperado, resultado);
		
	}
	
	@Test
	void setTest() {
		
		d.setValoresDeposito("222", 20, 20);
		
		String idEsperado = "222";
		float diametroEsperado = 20;
		float alturaEsperado = 20;
		
		assertEquals(idEsperado, d.getIdDeposito());
		assertEquals(diametroEsperado, d.getDiametro());
		assertEquals(alturaEsperado, d.getAltura());
		
		
	}
	
	

}
