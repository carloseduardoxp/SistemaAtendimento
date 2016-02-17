package br.com.atendimento.model.facade;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.atendimento.model.domain.Atendimento;
import br.com.atendimento.model.service.AtendimentoService;

@Path("/atendimento")
@Produces({ "application/json" })
public class AtendimentoFacade {

	@Inject
	private AtendimentoService service;

	@GET
	@Path("/")
	public List<Atendimento> listarTodos() {
		return service.listarTodos();
	}

	@POST
	@Path("/")
	public void salvar(Atendimento atendimento) {
		service.salvar(atendimento);
	}

	@DELETE
	@Path("/{protocolo}")
	public void remover(@PathParam("protocolo") Integer protocolo) {
		service.remover(protocolo);
	}

}
