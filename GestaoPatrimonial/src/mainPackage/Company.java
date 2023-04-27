package mainPackage;

import java.util.List;

public class Company extends Interprises {
	private List<Filial> filials;
	private int qtd;

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public int getQtd() {
		return qtd;
	}

	public void setFilials(List<Filial> filials) {
		this.filials = filials;
	}

	public List<Filial> getFilials() {
		return filials;
	}

	public void addFilial(Filial filial) {
		getFilials().add(filial);

	}

	/*public Filial edit(String name) {
		for (int i = 0; i < qtd; i++) {
			if (this.getFilials().get(i).getName().equals(name)) {
				return this.getFilials().get(i);
			}
			
		}
	}*/

}