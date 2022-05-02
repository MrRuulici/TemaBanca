class Lei extends ContBancar {

	protected Lei(String numarCont, float suma) {
		super(numarCont, suma);
	}

	protected void transfer(ContBancar contDestinatie, float suma) {
		if (contDestinatie instanceof Lei) {
			contDestinatie.suma += suma;
		}
	}

	@Override
	public float getSumaTotala() {
		return suma;
	}

	@Override
	protected String getNumarCont() {
		return numarCont;
	}

	@Override
	protected void setNumarCont(String numarCont) {
		this.numarCont = numarCont;
	}

	@Override
	protected float getSuma() {
		return suma;
	}

	@Override
	protected void setSuma(float suma) {
		this.suma = suma;
	}
}
