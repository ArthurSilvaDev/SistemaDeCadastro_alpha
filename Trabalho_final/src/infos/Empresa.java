package infos;
import java.util.Objects;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.CnpjEmpre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.CnpjEmpre, other.CnpjEmpre);
    }
    
    
    
    
    
    
    
    
}
