public class Main {
    public static void main(String[] args) {

        Ponto pontoA = new Ponto(10, 10);
        Ponto pontoB = new Ponto();

        pontoB.setX(10);
        pontoB.setY(10);

        System.out.println("Esse é o pontoA X: " + pontoA.getX() + " Y: " + pontoA.getY());
        System.out.println("E este é o pontoB X: " + pontoB.getX() + " Y: " + pontoB.getY());

        System.out.println("A distancia entre A e B é de: " + DistanciaEntreDoisPontos(pontoA, pontoB));

        System.out.println(pontoA.VerificaSeCordenadaXIgualY(pontoB.getX()));
    }

    public static double DistanciaEntreDoisPontos(Ponto pontoA, Ponto pontoB){
        double distancia;
        distancia = Math.sqrt(Math.pow((pontoA.getX() - pontoB.getX()), 2) + Math.pow((pontoA.getY() - pontoB.getY()), 2));
        return distancia;
    }
}