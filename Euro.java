class Euro extends ContBancar {

	protected Euro(String numarCont, float suma) {
		super(numarCont, suma);
	}

	protected float getDobanda() {
		float dobanda = suma;
		if (suma > 500)
			dobanda = dobanda * 0.3f;
		return dobanda;
	}

	@Override
	public float getSumaTotala() {
		return suma * 36.000f;
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
