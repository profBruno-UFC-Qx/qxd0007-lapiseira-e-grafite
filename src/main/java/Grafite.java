public class Grafite {



    public enum Dureza {
        G_HB,
        G_2B,
        G_4B,
        G_6B;

    }


    public Grafite(float calibre, Dureza dureza, int tamanho) {
    }

    public int desgastePorFolha() {
        return -1;
    }

    public Dureza getDureza() {
        return null;
    }

    public float getCalibre() {
        return -1f;
    }

    public int getTamanho() {
        return -1;
    }

    public void setTamanho(int tamanho) { }


}
