public class Main {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        Cachorro c = new Cachorro();
        Canguru k = new Canguru();
        k.locomover();
        c.locomover();
        k.emitirSom();
        c.emitirSom();
    }
}