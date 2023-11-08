package modelos;

public class Compras {

	private int id_compras;
	private String data_compras;
	private String destino_pacotes;
	private String periodo_pacotes;

	private Clientes cliente;
	private Pacotes pacotes;

	public Compras() {
	}

	public Compras(int id_compras, String data_compras, String destino_pacotes, String periodo_pacotes,
			Clientes cliente, Pacotes pacotes) {
		super();
		this.id_compras = id_compras;
		this.data_compras = data_compras;
		this.destino_pacotes = destino_pacotes;
		this.periodo_pacotes = periodo_pacotes;
		this.cliente = cliente;
		this.pacotes = pacotes;
	}

	public Compras(String data_compras, String destino_pacotes, String periodo_pacotes, Clientes cliente,
			Pacotes pacotes) {
		super();
		this.data_compras = data_compras;
		this.destino_pacotes = destino_pacotes;
		this.periodo_pacotes = periodo_pacotes;
		this.cliente = cliente;
		this.pacotes = pacotes;
	}

	public int getId_compras() {
		return id_compras;
	}

	public void setId_compras(int id_compras) {
		this.id_compras = id_compras;
	}

	public String getData_compras() {
		return data_compras;
	}

	public void setData_compras(String data_compras) {
		this.data_compras = data_compras;
	}

	public String getDestino_pacotes() {
		return destino_pacotes;
	}

	public void setDestino_pacotes(String destino_pacotes) {
		this.destino_pacotes = destino_pacotes;
	}

	public String getPeriodo_pacotes() {
		return periodo_pacotes;
	}

	public void setPeriodo_pacotes(String periodo_pacotes) {
		this.periodo_pacotes = periodo_pacotes;
	}

	public Clientes getCliente() {
		return cliente;
	}

	public void setCliente(Clientes cliente) {
		this.cliente = cliente;
	}

	public Pacotes getPacotes() {
		return pacotes;
	}

	public void setPacotes(Pacotes pacotes) {
		this.pacotes = pacotes;
	}

}
