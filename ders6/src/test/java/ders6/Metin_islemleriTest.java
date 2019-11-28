package ders6;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class Metin_islemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc = Metin_islemleri.buyukHarf("ali");
		org.junit.Assert.assertEquals("ALİ", sonuc);
		
	}

}
