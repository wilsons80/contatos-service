package br.mp.mpdft.contatos.services.cmd;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.mp.mpdft.contatos.services.dao.OperadoraDAO;
import br.mp.mpdft.contatos.services.vo.Operadora;

@Component
public class BuscarOperadoraCmd {

	@Autowired
	private OperadoraDAO operadoraDAO;
	
	public BuscarOperadoraCmd() {
	}
	
	
	public List<Operadora> buscarTodasOperadoras(){
		return operadoraDAO.buscarTodasOperadoras();
	}
	
	
}
