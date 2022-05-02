abstract class ContBancar implements SumaTotala {
	protected String numarCont;
	protected float suma;

	protected ContBancar(String numarCont, float suma) {
		this.numarCont = numarCont;
		this.suma = suma;
	}

	protected abstract String getNumarCont();

	protected abstract void setNumarCont(String numarCont);

	protected abstract float getSuma();

	protected abstract void setSuma(float suma);
}
