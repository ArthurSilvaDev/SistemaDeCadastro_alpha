package infos;


import java.util.Iterator;
import java.util.HashSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author mk
 */
public class MotoristaDAO implements DAO {

    
    HashSet<Motorista> cadastro = new HashSet();

    @Override
    public boolean inserir(Object obj) {
        if (obj != null) {
            Motorista p = (Motorista) obj;
            return cadastro.add(p);
            
        }
        return false;
    }

    @Override
    public boolean excluir(Object obj) {
        if (obj != null) {
            Motorista p = (Motorista) obj;
            cadastro.remove(p);
            return true;
        }
        return false;
    }

    @Override
    //Em obj está o critério de pesquisa
    //Em obj vai estar o nome da pessoa
    public Object pesquisar(Object obj) {
        if (obj !=null){
            String CPF = (String) obj;
//            for (int i =0; i< cadastro.size(); i++){
            Iterator it = cadastro.iterator();
            while(it.hasNext()){
                Motorista p = (Motorista) it.next();
                if (CPF.equals(p.getCpfFunc())){
                    return p;
                }
            }
        }
        return null;
    }

    
    
    
        
    public void listar(){
       Iterator it = cadastro.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
    }

    public HashSet<Motorista> getCadastro() {
        return cadastro;
    }

    @Override
    public boolean editar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    

}
