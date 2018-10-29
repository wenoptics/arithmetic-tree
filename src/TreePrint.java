import Abstraction.AMTreeNode;

public abstract class TreePrint {

    protected abstract void print(String s);

    public void inorderPrint(AMTreeNode root) {
        if (root != null) {
            inorderPrint(root.getLeftNode());
            print(root.getContent().toString());
            inorderPrint(root.getRightNode());
        }
    }
}
