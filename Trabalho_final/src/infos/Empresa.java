package infos;
import java.util.Scanner;

public class Empresa {
    
    // DECLRAÇÃO DE VARIAVEIS
    
    private String nomeEmpre;
    private String CnpjEmpre;
    private String PlacaVeic;

    
    // CONSTRUTOR
    
    public Empresa(String nomeEmpre, String CnpjEmpre) {
        this.nomeEmpre = nomeEmpre;
        this.CnpjEmpre = CnpjEmpre;
    }

    //FUNCÕES
    
    public static Empresa cadastrarEmpresa() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da empresa: ");
        String nomeEmpre = scanner.nextLine();

        System.out.print("Digite o CNPJ da empresa: ");
        String cnpjEmpre = scanner.nextLine();

        scanner.close();

        System.out.println("Cadastro da empresa " + nomeEmpre + " realizado com sucesso");
        
        return new Empresa(nomeEmpre, cnpjEmpre);
    }
    
    public void definirVeiculo(Caminhao caminhao){ // DESIGNAR UM MOTORISTA PRA UM CAMINHÃO
        this.PlacaVeic = caminhao.getPlacaVeic();
    }
    
    // TO STRING
    
    @Override
    public String toString() {
        return "----------\n"+
                "\nEmpresa: " + 
                "\nNome da Empresa: " + nomeEmpre + 
                "\nCnpj Empresa: " + CnpjEmpre + 
                "\nPlaca do Veiculo que faz a coleta: " + PlacaVeic +
                "\n----------";
    }

    
    
    //GET E SET
    
    public String getNomeEmpre() {
        return nomeEmpre;
    }

    public void setNomeEmpre(String nomeEmpre) {
        this.nomeEmpre = nomeEmpre;
    }

    public String getCnpjEmpre() {
        return CnpjEmpre;
    }

    public void setCnpjEmpre(String CnpjEmpre) {
        this.CnpjEmpre = CnpjEmpre;
    }

    public String getPlacaVeic() {
        return PlacaVeic;
    }

    public void setPlacaVeic(String PlacaVeic) {
        this.PlacaVeic = PlacaVeic;
    }
    
    
    
    
    
    
    
    
}
