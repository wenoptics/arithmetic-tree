import Abstraction.AMTreeNode;

import java.util.*;

/**
 * Implement an inorder drawing tree algorithm base on a method prof. provided
 */
public class PrettyTreePrint {
    /**
     * A row first map
     *      printMap of <row, <col, node>>
     */
    private HashMap<Integer, HashMap<Integer, AMTreeNode>> printMap;

    private void addToMap(int row, int col, AMTreeNode what) {
        HashMap<Integer, AMTreeNode> rowHm;
        if (printMap.containsKey(row)) {
            rowHm = printMap.get(row);
        } else {
            rowHm = new HashMap<>();
        }
        rowHm.put(col, what);
        printMap.put(row, rowHm);
    }

    public PrettyTreePrint(AMTreeNode root) {
        printMap = new HashMap<>();
        calcTreeLayout(root, 0, 0);
    }

    public Collection<String> getPrint() {
        ArrayList<String> lines = new ArrayList<>();
        List<Integer> rowIndexes = new ArrayList<>(printMap.keySet());
        rowIndexes.sort(Integer::compareTo);
        for (int r : rowIndexes) {
            StringBuilder sb = new StringBuilder();
            HashMap<Integer, AMTreeNode> colMap = printMap.get(r);
            List<Integer> colIndexes = new ArrayList<>(colMap.keySet());
            colIndexes.sort(Integer::compareTo);

            int lastIdx = 0;
            for (int c : colIndexes) {

                // Fill space in between
                for ( ;lastIdx < c; lastIdx++) {
                    sb.append(' ');
                }

                String content = colMap.get(c).getContent().toString();
                if (colMap.get(c).getClass() == AMNumberNode.class) {
                    // fixme: Convert a double back to int. Should be a better way to do this
                    content = String.format("%.0f", (Double) colMap.get(c).getContent());
                }
                sb.append(content);
                lastIdx += Math.max(content.length(), 1) - 1;

            }
            lines.add(sb.toString());
        }
        return lines;
    }

    private int calcTreeLayout(AMTreeNode root, int d, int x) {
        if (root.getLeftNode() != null) {
            x = calcTreeLayout(root.getLeftNode(), d + 1, x);
        }
        addToMap(d, x++, root);
        if (root.getRightNode() != null) {
            x = calcTreeLayout(root.getRightNode(), d + 1, x);
        }
        return x;
    }
}

