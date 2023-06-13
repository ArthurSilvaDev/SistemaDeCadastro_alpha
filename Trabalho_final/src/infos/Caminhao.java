package infos;

import java.util.Scanner;

public class Caminhao {
    
    // DECLRAÇÃO DE VARIAVIES
    
    private String modVeic;
    private String anoVeic;
    private String placaVeic;
    private String motoristaVeic;

    // CONSTRUTOR
    
    public Caminhao(String modVeic, String anoVeic, String placaVeic) {
        this.modVeic = modVeic;
        this.anoVeic = anoVeic;
        this.placaVeic = placaVeic;
    }
    
    //FUNCÕES
    
    public static Caminhao cadastrarCaminhao() { //Função para cadastrar um caminhão no sistema
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o modelo do veiculo: ");
        String modVeic = scanner.nextLine();

        System.out.print("Digite o ano do veiculo: ");
        String anoVeic = scanner.nextLine();

        System.out.print("Digite a placa do veiculo: ");
        String placaVeic = scanner.nextLine();

        scanner.close();
        
        System.out.println("Cadastro do veiculo de placa " + placaVeic + " realizado com sucesso");

        return new Caminhao(modVeic, anoVeic, placaVeic);
    }
    
    
    
    public void definirMotorista(Funcionario funcionario){ //Função para definir um motorista para um caminhão existente
       
        this.motoristaVeic = funcionario.getNomeFunc();
   }
    
    
    //GET E SET//
    public String getModVeic() {
        return modVeic;
    }

    public void setModVeic(String modVeic) {
        this.modVeic = modVeic;
    }

    public String getAnoVeic() {
        return anoVeic;
    }

    public void setAnoVeic(String anoVeic) {
        this.anoVeic = anoVeic;
    }

    public String getPlacaVeic() {
        return placaVeic;
    }

    public void setPlacaVeic(String placaVeic) {
        this.placaVeic = placaVeic;
    }

    public String getMotoristaVeic() {
        return motoristaVeic;
    }

    public void setMotoristaVeic(String motoristaVeic) {
        this.motoristaVeic = motoristaVeic;
    }

    
    // TO STRING
    
    @Override
    public String toString() {
        return """
               ----------
               Caminhao:
               Modelo do Veiculo:""" + modVeic + 
                "\nAno do Veiculo: " + anoVeic + 
                "\nPlaca do Veiculo: " + placaVeic + 
                "\nMotorista do Veiculo: " + motoristaVeic +
                "\n----------";
    }
    
    
    
    
    
    
    
    
}
