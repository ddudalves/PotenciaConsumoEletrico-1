// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    System.out.println("Programa feito para calcular Potência e Consumo Elétrico.");
    System.out.println("");

    System.out.println("Uma TV de 200 Watts fica ligada diariamente por 5 horas, determine o consumo elétrico mensal da TV.");

    System.out.println("");
    System.out.println("A potência dada é:");
    double potencia = 200;

    System.out.println(potencia);

    System.out.println("O tempo de uso é de:");

    double tempo = 5;

    System.out.println(tempo);

    System.out.println("A equação que é usada é de:");
                       
    double equacao = 1000;
    
    System.out.println(equacao);

    System.out.println("O tempo mensal é de:");

    double mensal = 30;
    System.out.println(mensal);

    System.out.println("Para ser feito a primeira parte da equação, precisa calcular a potência multiplicada pelo tempo.");
    
    double consumoEletrico = potencia * tempo;

    System.out.println(consumoEletrico);

    System.out.println("E assim, com essa resposta, precisamos dividi-lá por 1000.");

    double consumoEletrico1 = consumoEletrico / equacao;

    double resposta = 1;

    System.out.println(consumoEletrico1);
System.out.println("Como queremos saber o período mensal do Consumo Elétrico, devemos multiplicar por 30.");

    double respostaFinal = resposta * mensal;
    System.out.println("Então a resposta final é:");

    System.out.println("");

    System.out.println(respostaFinal);
    
  }


}