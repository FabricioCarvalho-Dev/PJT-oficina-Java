public class Carro {
	private String marca;
    private String modelo;
    private String placa;
    private String servico;
    private String preco_servico;


    public Carro() {
    }

    public Carro(String marca, String modelo, String placa, String servico, String preco_servico) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.servico = servico;
        this.preco_servico = preco_servico;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String marca) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getPreco_servico() {
		return preco_servico;
	}

	public void setPreco_servico(String preco_servico) {
		this.preco_servico = preco_servico;
	}
    
}