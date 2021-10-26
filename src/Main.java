import com.pbo.week9.Novel;
import com.pbo.week9.Buku;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================== Encapsulation ====================");
        Buku buku = new Buku("Eighty Six", 3131);
        buku.setGenre("Action, Drama, Sci-Fi");
        System.out.println(buku.infoBook() + buku.getGenre());

        System.out.println("\n===================== Overriding ======================");
        Buku novel = new Novel("Roshi-dere", 3241);
        System.out.println(novel.infoBuku());
        System.out.println(novel.infoBuku("SUNSUNSUN"));

        System.out.println("\n===================== Overloading =====================");
        buku.bookInfo("Eighty Six");
        buku.bookInfo("Eighty Six", 3189);

        System.out.println("\n=======================================================");
    }
}
