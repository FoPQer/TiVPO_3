public class Main {
    public static void main(String[] args) {
        Creator creator = new Creator();
        creator.adder("836");
        Deleter del = new Deleter(creator.file);
        del.delete();
    }
}
