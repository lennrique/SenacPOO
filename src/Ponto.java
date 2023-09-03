public class Ponto {

    private int X, Y;

    //contrutrores
    //construtor padrao -> nao tem parametros
    public Ponto(){
        X = 0;
        Y = 0;
    }

    //construtor com parametros x e y
    public Ponto(int x, int y){
        X = x;
        Y = y;
    }

    //metodos get e set
    //metodos get
    public int getX(){
        return X;
    }
    public int getY(){
        return Y;
    }

    //metodos set
    public void setX(int x){
        X = x;
    }
    public void setY(int y){

    }

    //metodos
    public boolean VerificaSeCordenadaXIgualY(int x){
        if (x == Y){
            return true;
        } else {
            return false;
        }
    }
}
