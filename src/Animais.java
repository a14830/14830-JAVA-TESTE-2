public class Animais {
    
    public int id;

    public String numeroCA;

    public String nomeAnimal;

    public String dataNascimento;

    public Animais(int id, String numeroCA, String nomeAnimal, String dataNascimento) {

        this.id = id;

        this.numeroCA = numeroCA;

        this.nomeAnimal = nomeAnimal;

        this.dataNascimento = dataNascimento;

    }


    @Override

    public String toString() {

        return numeroCA;

    }
}
