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
public class EmpresaDAO implements DAO {

    
    HashSet<Empresa> cadastro = new HashSet();

    @Override
    public boolean inserir(Object obj) {
        if (obj != null) {
            Empresa e = (Empresa) obj;
            return cadastro.add(e);
            
        }
        return false;
    }

    @Override
    public boolean excluir(Object obj) {
        if (obj != null) {
            Empresa e = (Empresa) obj;
            cadastro.remove(e);
            return true;
        }
        return false;
    }

    @Override
    //Em obj está o critério de pesquisa
    //Em obj vai estar o nome da pessoa
    public Object pesquisar(Object obj) {
        if (obj !=null){
            String CNPJ = (String) obj;
//            for (int i =0; i< cadastro.size(); i++){
            Iterator it = cadastro.iterator();
            while(it.hasNext()){
                Empresa e = (Empresa) it.next();
                if (CNPJ.equals(e.getCnpjEmpre())){
                    return e;
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

    public HashSet<Empresa> getCadastro() {
        return cadastro;
    }

    @Override
    public boolean editar(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    

}
