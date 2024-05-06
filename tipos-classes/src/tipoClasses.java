import javax.swing.JOptionPane;

public class tipoClasses {
    public static void main(String[] args) throws Exception {
        
        String Resposta = JOptionPane.showInputDialog("Deseja Ligar ou Desligar?");

        if (Resposta.equalsIgnoreCase("Ligar")) { 

            System.out.println("Você acabou de Ligar a TV!");
           
        } else{
            System.out.println("Você acabou de desligar a tv!");
        }


        int volumeTV = 10;

        if (Resposta.equalsIgnoreCase("Ligar")) {

            String Resposta2 = JOptionPane.showInputDialog("O Volume de sua TV está em 10. Deseja Aumentar ou Abaixar o Volume da sua TV?");

                if (Resposta2.equalsIgnoreCase("Aumentar")) { 

                    System.out.println("Agora, a sua TV está no Volume: " + ++volumeTV);

                }
                
                if (Resposta2.equalsIgnoreCase("Abaixar")){

                    System.out.println("Agora, a sua TV está no Volume: " + (volumeTV-1));
                }
                    
                
            
        }else{

            System.out.println("");
        }
}
}
