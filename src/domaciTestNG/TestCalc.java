package domaciTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalc {

	@Test
	public void krug() {
		double r = 1.0;
		double povrsinaKruga = Calc.pKruga(r);
		Assert.assertEquals(povrsinaKruga, 3.14);
	}

	@Test
	public void kvadrat() {
		double a = 2.0;
		double povrsinaKvadrata = Calc.pKvadrata(a);
		Assert.assertEquals(povrsinaKvadrata, 4.0);
	}

	@Test
	public void pravougaonik() {
		double a = 2.0;
		double b = 3.0;
		double povrsinaPravougaonika = Calc.pPravougaonika(a, b);
		Assert.assertEquals(povrsinaPravougaonika, 6.0);
	}
}
