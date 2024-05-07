public class MeuPrograma {
    public static void main(String[] args) {
        int idade;
        idade = 26;
        int proximaIdade;
        proximaIdade = idade + 1;
        System.out.println("Minha idade é: " + idade + " e irei completar " + proximaIdade);

        /*int i = 5;
        int j = i;
        i = i + 1;
        System.out.println(i + " e " + j);*/

        /*for (i = 150; i <= 1500; i++){
            System.out.println(i);
        }*/
        /*for(i = 1; i <= 1000; i++){
            System.out.println(i);
        }*/
        /*for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }*/
        for(int i = 1; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println(i + " É múltiplo de 3");
            } else {
                System.out.println(i + " Não é múltiplo de 3");
            }
        }
    }
}
