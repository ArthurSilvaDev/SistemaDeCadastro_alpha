
package infos;

public class Operacional {
    
    public static void clearConsole() {
         try {
            String os = System.getProperty("os.name").toLowerCase();
            ProcessBuilder processBuilder;

            if (os.contains("win")) {
                processBuilder = new ProcessBuilder("cmd", "/c", "cls");
            } else {
                processBuilder = new ProcessBuilder("clear");
            }

            Process process = processBuilder.inheritIO().start();
            process.waitFor();
            System.out.print("\033[H\033[2J");
            System.out.flush();
        } catch (Exception e) {
            // Trate exceções, se necessário
        }
    }//FUNÇÃO PARA LIMPAR CONSOLE (NÃO FUNCIONA)
    }

