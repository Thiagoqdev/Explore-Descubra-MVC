	package modelos;
	
	public class Pacotes {
	
		private int id_pacotes;
		private String periodo_pacotes;
		private String destino_pacotes;
		private float preco_pacotes;
	
		public Pacotes() {
	
		}

		public Pacotes(int id_pacotes, String periodo_pacotes, String destino_pacotes, float preco_pacotes) {
			super();
			this.id_pacotes = id_pacotes;
			this.periodo_pacotes = periodo_pacotes;
			this.destino_pacotes = destino_pacotes;
			this.preco_pacotes = preco_pacotes;
		}

		public Pacotes(String periodo_pacotes, String destino_pacotes, float preco_pacotes) {
			super();
			this.periodo_pacotes = periodo_pacotes;
			this.destino_pacotes = destino_pacotes;
			this.preco_pacotes = preco_pacotes;
		}

		public int getId_pacotes() {
			return id_pacotes;
		}

		public void setId_pacotes(int id_pacotes) {
			this.id_pacotes = id_pacotes;
		}

		public String getPeriodo_pacotes() {
			return periodo_pacotes;
		}

		public void setPeriodo_pacotes(String periodo_pacotes) {
			this.periodo_pacotes = periodo_pacotes;
		}

		public String getDestino_pacotes() {
			return destino_pacotes;
		}

		public void setDestino_pacotes(String destino_pacotes) {
			this.destino_pacotes = destino_pacotes;
		}

		public float getPreco_pacotes() {
			return preco_pacotes;
		}

		public void setPreco_pacotes(float preco_pacotes) {
			this.preco_pacotes = preco_pacotes;
		}
	

		
	
	}
