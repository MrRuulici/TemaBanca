class Banca {
	Client[] clienti;
	String codBanca;
	int numarClienti;
	int index = 0;

	protected Banca(String codBanca, int numarClienti) {
		this.codBanca = codBanca;
		this.numarClienti = numarClienti;
		clienti = new Client[numarClienti];
	}

	protected void add(Client c) {
		if (index < numarClienti) {
			clienti[index] = c;
			index++;
		} else
			System.out.println("Index out of bounds");

	}

	protected void afisareClient(String nume) {
		Client aux = null;
		String s = "";
		for (int i = 0; i < numarClienti; i++) {
			if (clienti[i].getNume() == nume)
				aux = clienti[i];
		}
		s += aux.nume + " " + aux.adresa + '\n';
		for (int i = 0; i < aux.n; i++) {
			s += aux.conturi[i].getSumaTotala() + '\n';
		}
		System.out.println(s);

	}

	public static void main(String[] args) {
		ContBancar cont1 = new Lei("1qaz", 100);
		ContBancar cont2 = new Euro("2wsx", 500);
		Lei cont3 = new Lei("3edc", 400);
		Euro cont4 = new Euro("4rfv", 600);
		System.out.println(cont1.getSumaTotala());
		System.out.println(cont2.getSumaTotala());
		cont3.transfer(cont1, 100);
		System.out.println(cont4.getDobanda());

		ContBancar[] listaConturi = new ContBancar[4];
		listaConturi[0] = cont1;
		listaConturi[1] = cont2;
		listaConturi[2] = cont3;
		listaConturi[3] = cont4;

		ContBancar[] listaConturi2 = new ContBancar[3];
		listaConturi2[0] = cont1;
		listaConturi2[1] = cont2;
		listaConturi2[2] = cont3;

		Client client1 = new Client("Raul", "Strada Ambudului", 4, listaConturi);
		Client client2 = new Client("Ulici", "Strada Curtuius", 3, listaConturi2);
		System.out.println(client1);
		System.out.println(client2);

		Banca banca = new Banca("qwertyuiop", 2);
		banca.add(client1);
		banca.add(client2);
		banca.afisareClient("Raul");

	}
}
