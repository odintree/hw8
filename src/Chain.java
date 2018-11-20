
public interface Chain {
    void setNextChain(Chain nextChain);
    Chain nextChain();
    void give(int remainder);
}