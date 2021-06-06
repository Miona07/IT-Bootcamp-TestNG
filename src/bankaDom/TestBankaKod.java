package bankaDom;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {
	// proveriti da li konstruktor dobro postavlja argumente,
	// kao i da li get metode vracaju odgovarajuce vrednosti.
	// Kada se napravi racun, na stanju je 0 dinara.

	@Test
	public void konstruktor() {
		BankaKod bk = new BankaKod("Miona", "170-345678-78");
		SoftAssert sa = new SoftAssert();

		sa.assertEquals(bk.dohvatiIme(), "Miona");
		sa.assertEquals(bk.dohvatiZiroRacun(), "170-345678-78");

		sa.assertAll();

	}

	@Test
	public void racun() {
		BankaKod bk = new BankaKod("Miona", "170-345678-78");
		Assert.assertEquals(bk.dohvatiIznos(), 0.0);

	}

}
