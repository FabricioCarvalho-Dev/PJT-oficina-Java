import javax.swing.JOptionPane;

public class Oficina {
    
    final int TAM = 30;
    int vagas_servico;
    Carro carro[] = new Carro[TAM];
    String preco_servico;
  
    public Oficina() {
        
    }
    
    public void entrada(){
    	vagas_servico = Integer.parseInt(JOptionPane.showInputDialog("Selecione a vagas do servico (0 - 29) "));
        if (vagas_servico<0 || vagas_servico>=TAM){
            JOptionPane.showMessageDialog(null, "Favor verifique! vaga de serviço não encontrado");
            return;
        }
        this.carro[vagas_servico]=new Carro();
        this.carro[vagas_servico].setMarca(JOptionPane.showInputDialog("Marca do carro"));
        this.carro[vagas_servico].setModelo(JOptionPane.showInputDialog("Modelo carro"));
        this.carro[vagas_servico].setPlaca(JOptionPane.showInputDialog("Placa do carro"));
        JOptionPane.showMessageDialog(null, "Por favor lançe serviço do carro cadastrado!");
        this.carro[vagas_servico].setServico(JOptionPane.showInputDialog("Servico desejado"));
        this.carro[vagas_servico].setPreco_servico(JOptionPane.showInputDialog("valor do serviço"));
        JOptionPane.showMessageDialog(null, "Serviço lançado para carro cadastrado!"+"\n"+"Veiculo: "+this.carro[vagas_servico].getMarca()+"\n"+"Vaga alocada: "+vagas_servico);
    }
    
    public void saida(){
    	vagas_servico = Integer.parseInt(JOptionPane.showInputDialog("Qual a vaga alocada na oficina?"));
    
        if (vagas_servico<0 || vagas_servico>=TAM){
            JOptionPane.showMessageDialog(null, "Favor verifique! Vaga não cadastrada para serviços");
            return;
            }
        
        if (this.carro[vagas_servico]!=null) {
        	JOptionPane.showMessageDialog(null, "Veiculo Selecionado"+"\n"+"MARCA - "+this.carro[vagas_servico].getMarca()+"\n"+"MODELO - "+this.carro[vagas_servico].getModelo()+"\n"+"PLACA - "+this.carro[vagas_servico].getPlaca()+"\n"+"SERVIÇO REALIZADO - "+this.carro[vagas_servico].getServico()+""
            		+ "\n"+"PREÇO DO SERVIÇO - R$:"+this.carro[vagas_servico].getPreco_servico()+"\n");
        	this.carro[vagas_servico]=null ;
        }else {
        	JOptionPane.showMessageDialog(null, "Favor verifique! a vaga "+vagas_servico+" não possui veiculo");
        	return;
        }
   
    }
  
  
    public void listarCarros_serv(){
        String dados="";
        for(int x=0; x < TAM ; x++){
            if (carro[x]==null) continue;
            dados +="[ Vaga ocupada na oficina - "+x+" ]\n"+"MARCA - "+this.carro[x].getMarca()+"\n"+"MODELO - "+this.carro[x].getModelo()+"\n"+"PLACA - "+this.carro[x].getPlaca()+"\n"+"SERVIÇO REALIZADO - "+this.carro[x].getServico()+""
                    		+ "\n"+"PREÇO DO SERVIÇO - R$:"+this.carro[x].getPreco_servico()+"\n";
        }
        JOptionPane.showMessageDialog(null, dados); 
    }
    
    public void listarVagas(){
        String vagas="";
        int y=1;
        for(int x=0; x < TAM ; x++){
            if (carro[x]!=null){ vagas +="[ "+carro[x].getMarca()+"] - "; continue; }
            vagas +="["+x+"] - ";
            y++;
            if (y>10){vagas+="\n";y=1;} 
        }
        JOptionPane.showMessageDialog(null, vagas);
    }
    
}
