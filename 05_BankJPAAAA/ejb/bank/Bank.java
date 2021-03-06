package bank;

import java.util.List;

import javax.ejb.Remote;

import entity.Konto;

@Remote
public interface Bank {
	public double tellRate();

	public double calculateRate(Konto k, int years);

	public List<Konto> getAllKontos();

	public Konto getKontoById(Long id);

	public Konto getKontoByNr(String nr);

	public Long createKonto(Konto k);

	public void updateKonto(Konto k);

	public void removeKonto(Konto k);

	public Object getRemoteReference();
}
