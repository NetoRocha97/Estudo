public class BalancoTrimestral {
    public static void main (String[] args) {
        double gastoJaneiro = 15000;
        double gastoFevereiro = 23000;
        double gastoMarco = 17000;

        double gastoTrimestre = gastoJaneiro + gastoFevereiro + gastoMarco;

        System.out.println("Os gastos do trimestre são de: " + gastoTrimestre);

        double mediaMensal = gastoTrimestre / 3;

        System.out.println("A média de gasto mensal é de: " + mediaMensal);
    }
}
