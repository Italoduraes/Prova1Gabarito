import java.time.LocalDateTime;

public class Ligacao {
	
	
	
	
	private int codigo;
	private String NumDeTelDestino;
	private LocalDateTime DataEHoraDeInicio;
	private LocalDateTime DataEHoraDeFim;
	private String cidadeDeDestino;
	private String UFDeDestino;
	private Cliente cliente;
	
	
	
             // metodo construtor
	public Ligacao(int codigo, String numDeTelDestino, LocalDateTime dataEHoraDeInicio, LocalDateTime dataEHoraDeFim,
			String cidadeDeDestino, String uFDeDestino, Cliente cliente) {
		this.codigo = codigo;
		NumDeTelDestino = numDeTelDestino;
		DataEHoraDeInicio = dataEHoraDeInicio;
		DataEHoraDeFim = dataEHoraDeFim;
		this.cidadeDeDestino = cidadeDeDestino;
		UFDeDestino = uFDeDestino;
		this.cliente = cliente;
	}
	

	// metodo get e set 
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNumDeTelDestino() {
		return NumDeTelDestino;
	}
	public void setNumDeTelDestino(String numDeTelDestino) {
		NumDeTelDestino = numDeTelDestino;
	}
	public LocalDateTime getDataEHoraDeInicio() {
		return DataEHoraDeInicio;
	}
	public void setDataEHoraDeInicio(LocalDateTime dataEHoraDeInicio) {
		DataEHoraDeInicio = dataEHoraDeInicio;
	}
	public LocalDateTime getDataEHoraDeFim() {
		return DataEHoraDeFim;
	}
	public void setDataEHoraDeFim(LocalDateTime dataEHoraDeFim) {
		DataEHoraDeFim = dataEHoraDeFim;
	}
	public String getCidadeDeDestino() {
		return cidadeDeDestino;
	}
	public void setCidadeDeDestino(String cidadeDeDestino) {
		this.cidadeDeDestino = cidadeDeDestino;
	}
	public String getUFDeDestino() {
		return UFDeDestino;
	}
	public void setUFDeDestino(String uFDeDestino) {
		UFDeDestino = uFDeDestino;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}

