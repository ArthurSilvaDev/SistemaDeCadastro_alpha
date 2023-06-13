package infos;

public class Motorista extends Funcionario {
    
    // DECLARAÇÃO DE VARIÁVEIS
    
    private String CNH;

    
    // CONSTRUTORES

    public Motorista(String nome, String CPF) {
        super(nome, CPF);
    }
    
    
    
    public Motorista(String nome, String CNH, String CPF) {
        super(nome, CPF);
        this.CNH = CNH;
    }

    //FUNÇÕES
    
    @Override
    public void demitirFuncionario(){ // FUNÇÃO QUE CHAMA A FUNÇÃO MÃE E COMPLEMENTA
        super.demitirFuncionario();
        this.CNH = null;
    }
    
    public static Motorista cadastrarMotorista() { // Função para criar Motoristas
        

        String nome = Console.lerDados("Digite o nome do motorista: ");
        
        String CNH = Console.lerDados("Digite o numero da CNH: ");

        String CPF = Console.lerDados("Digite o CPF do motorista: ");
       

        return new Motorista(nome, CNH, CPF);
    }
    
    
    //GET E SETR
    
    public String getCNH() {
        return CNH;
    }

    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    
    // TO STRING

    /**
     *
     * @return
     */
    
    @Override
    public String toString() {
        return """
               ----------
               MOTORISTA:
               CNH: """ + CNH + 
                "\nNome: " + super.getNomeFunc()+ 
                "\nCPF: " + super.getCpfFunc()+ 
                "\nCracha: " + super.getCodFunc()+
                "\n----------";
    }
    
    
    
    
    
}
