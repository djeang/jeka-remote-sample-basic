import dev.jeka.core.api.file.JkPathTree;
import dev.jeka.core.tool.JkDoc;
import dev.jeka.core.tool.KBean;

@JkDoc("""
        Provides file-system utilities applying from the current directory.
        """)
class App extends KBean {

    @JkDoc("List files present in current dir and its sub-directories.")
    public void list() {
        JkPathTree.of("").getRelativeFiles().forEach(System.out::println);
    }

    @JkDoc("Compute a MD5 digest of all files present in current dir and its sub-directories.")
    public void md5() {
        System.out.println(JkPathTree.of("").checksum("md5"));
    }

}