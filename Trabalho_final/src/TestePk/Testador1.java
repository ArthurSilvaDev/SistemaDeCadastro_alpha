//-*- coding: utf-8 -*-
package TestePk;
import infos.*;




public class Testador1 {
    
    
    
    
    public static void main(String[] args) {
       
        MotoristaDAO motdao = new MotoristaDAO();
        String escolha;
        
        
        
            do{
                
                escolha = Console.lerDados("""
                                           Selecione uma opcao do menu:
                                           1 - Controle de Funcionarios
                                           2 - Controle de Frota
                                           3 - Controle de Clientes
                                           0 - Encerrar o programa""");
                
                
                if(null == escolha){
                    System.out.println("Opcao inválida. Tente novamente.");
                    Console.mostrarDados("Opcao inválida. Tente novamente.");
                }
                // Adicione ações específicas para a Opção 1 aqui
                else switch (escolha) {
                case "1" -> {
                    System.out.println("Opcao 1 selecionada.");
                    String escolha1;
                    do{
                        
                        
                        escolha1 = Console.lerDados("""
                                                                            Selecione uma opcao do menu:
                                                                            1 - Listar Motoristas
                                                                            2 - Cadastrar Motorista
                                                                            3 - Excluir Motorista
                                                                            0 - Voltar""");
                        
                        
                        if(null == escolha1){
                            System.out.println("Opcao inválida. Tente novamente.");
                            Console.mostrarDados("Opcao inválida. Tente novamente.");
                        }
                        // Adicione ações específicas para a Opção 1 aqui
                        else switch (escolha1) {
                            case "1" ->         {
                                System.out.println("Opcao listar Motorista.");
                                System.out.println("----LISTA DE MOTORISTAS ----");
                                motdao.listar();
                                System.out.println("----------------------------");
                            }
                            case "2" ->         {
                                System.out.println("Opcao Cadastro Motorista");
                                Funcionario motorista = Motorista.cadastrarMotorista();
                                if(motdao.inserir(motorista) == true)
                                    Console.mostrarDados("Cadastro do motorista " + motorista.getNomeFunc() + " realizado com sucesso");
                                else
                                    Console.mostrarDados("Falha no cadastro");
                            }
                            case "3" ->         {
                                System.out.println("Opcao Excluir motorista.");
                                System.out.println("----LISTA DE MOTORISTAS ----");
                                motdao.listar();
                                System.out.println("----------------------------");
                                String resposta = Console.lerDados("Digite o CPF do motorista que deseja excluir:");
                                Object demitido = motdao.pesquisar(resposta);
                                if (demitido != null){
                                    motdao.excluir(demitido);
                                    Console.mostrarDados("Exclusão realizada");
                                }
                                else{
                                    Console.mostrarDados("CPF Não encontrado, nenhuma alteração realizada");
                                }               }
                            case "0" ->         {
                                System.out.println("Voltando");
                                escolha1 = "end";
                            }
                            default ->          {
                                System.out.println("Opcao inválida. Tente novamente.");
                                Console.mostrarDados("Opcao inválida. Tente novamente.");
                            }
                        }
                        // Adicione ações específicas para a Opção 2 aqui
                        
                        
                    } while (!"end".equals(escolha1));
                    }
                case "2" -> System.out.println("Opcao 2 selecionada.");
                case "3" -> System.out.println("Opcao 3 selecionada.");
                case "0" -> {
                    System.out.println("Encerrando o menu.");
                    Console.mostrarDados("Encerrando o programa.");
                    escolha = "end";
                    }
                default -> {
                    System.out.println("Opcao inválida. Tente novamente.");
                    Console.mostrarDados("Opcao inválida. Tente novamente.");
                    }
            }
                // Adicione ações específicas para a Opção 2 aqui
                
         
            } while (!"end".equals(escolha));

        
    }
    
    
    
    
    
    
    
}
