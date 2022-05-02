import java.util.Arrays;

class Client {
	String nume;
	String adresa;
	ContBancar[] conturi;
	final int MAX = 5;
	int n;

	protected Client(String nume, String adresa, int n, ContBancar[] conturi) {
		this.nume = nume;
		this.adresa = adresa;
		if (n > 1 && n <= 5) {
			this.n = n;
			conturi = new ContBancar[n];
			this.conturi = conturi;
		}
	}

	protected String getNume() {
		return nume;
	}

	protected void setNume(String nume) {
		this.nume = nume;
	}

	protected String getAdresa() {
		return adresa;
	}

	protected void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	protected ContBancar[] getConturi() {
		return conturi;
	}

	protected void setConturi(ContBancar[] conturi) {
		this.conturi = conturi;
	}

	@Override
	public String toString() {
		return "Client{" + "nume='" + nume + '\'' + ", adresa='" + adresa + '\'' + ", conturi="
				+ Arrays.toString(conturi) + ", MAX=" + MAX + ", n=" + n + '}';
	}
}
