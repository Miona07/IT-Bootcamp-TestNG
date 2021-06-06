package bankaDom;

public class BankaKod {

	private String ziroRacun;
	private String ime;
	private Double iznos;

	public BankaKod(String ime, String ziroRacun) {
		this.ziroRacun = ziroRacun;
		this.ime = ime;
		this.iznos = 0d;
	}

	public String dohvatiZiroRacun() {
		return ziroRacun;
	}

	public String dohvatiIme() {
		return ime;
	}

	public Double dohvatiIznos() {
		return iznos;
	}

}
