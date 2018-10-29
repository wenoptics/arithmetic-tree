import Abstraction.AMTreeNode;

import javax.naming.OperationNotSupportedException;
import java.util.Random;

public class demo {

    public static void main(String[] args) {
        runExampleCase();
        System.out.println("======================\ngenerating 10 random trees");
        genRandomCases();
    }

    /**
     * The example case from the Homework description.
     *      Result should be -13,
     *      Tree printed as
     *
     *                   -
     *            /            +
     *          *      +    *     6
     *        +   3   -   2  3   -
     *       3  1    9  5      7  4
     *
     */
    private static void runExampleCase() {
        AMTreeNode root = new AMOperationNode('-');

        AMTreeNode l2_0 = new AMOperationNode('/');
        AMTreeNode l2_1 = new AMOperationNode('+');

        AMTreeNode l3_0 = new AMOperationNode('*');
        AMTreeNode l3_1 = new AMOperationNode('+');
        AMTreeNode l3_2 = new AMOperationNode('*');
        AMTreeNode l3_3 = new AMNumberNode((double) 6);

        AMTreeNode l4_0 = new AMOperationNode('+');
        AMTreeNode l4_1 = new AMNumberNode((double) 3);
        AMTreeNode l4_2 = new AMOperationNode('-');
        AMTreeNode l4_3 = new AMNumberNode((double) 2);
        AMTreeNode l4_4 = new AMNumberNode((double) 3);
        AMTreeNode l4_5 = new AMOperationNode('-');

        AMTreeNode l5_0 = new AMNumberNode((double) 3);
        AMTreeNode l5_1 = new AMNumberNode((double) 1);
        AMTreeNode l5_2 = new AMNumberNode((double) 9);
        AMTreeNode l5_3 = new AMNumberNode((double) 5);
        AMTreeNode l5_4 = new AMNumberNode((double) 7);
        AMTreeNode l5_5 = new AMNumberNode((double) 4);

        try {
            root.setLeftNode(l2_0);
            root.setRightNode(l2_1);

            l2_0.setLeftNode(l3_0);
            l2_0.setRightNode(l3_1);
            l2_1.setLeftNode(l3_2);
            l2_1.setRightNode(l3_3);

            l3_0.setLeftNode(l4_0);
            l3_0.setRightNode(l4_1);
            l3_1.setLeftNode(l4_2);
            l3_1.setRightNode(l4_3);
            l3_2.setLeftNode(l4_4);
            l3_2.setRightNode(l4_5);

            l4_0.setLeftNode(l5_0);
            l4_0.setRightNode(l5_1);
            l4_2.setLeftNode(l5_2);
            l4_2.setRightNode(l5_3);
            l4_5.setLeftNode(l5_4);
            l4_5.setRightNode(l5_5);
        } catch (OperationNotSupportedException e) {
            e.printStackTrace();
        }

        for (String line : new PrettyTreePrint(root).getPrint()) {
            System.out.println(line);
        }

        double ret = 0;
        try {
            ret = root.calcIntermediately();
            System.out.printf("\nresult = %s%n", ret);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void genRandomCases() {
        Random rd = new Random();
        char[] randomOps = new char[]{'+', '-', '*', '/'};

        for (int i = 0; i < 10; i++) {
            AMTreeNode root = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);

            AMTreeNode l2_0 = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);
            AMTreeNode l2_1 = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);

            AMTreeNode l3_0 = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);
            AMTreeNode l3_1 = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);
            AMTreeNode l3_2 = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);
            AMTreeNode l3_3 = new AMNumberNode((double) rd.nextInt(99)+1);

            AMTreeNode l4_0 = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);
            AMTreeNode l4_1 = new AMNumberNode((double) rd.nextInt(99)+1);
            AMTreeNode l4_2 = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);
            AMTreeNode l4_3 = new AMNumberNode((double) rd.nextInt(99)+1);
            AMTreeNode l4_4 = new AMNumberNode((double) rd.nextInt(99)+1);
            AMTreeNode l4_5 = new AMOperationNode(randomOps[rd.nextInt(randomOps.length)]);

            AMTreeNode l5_0 = new AMNumberNode((double) rd.nextInt(99)+1);
            AMTreeNode l5_1 = new AMNumberNode((double) rd.nextInt(99)+1);
            AMTreeNode l5_2 = new AMNumberNode((double) rd.nextInt(99)+1);
            AMTreeNode l5_3 = new AMNumberNode((double) rd.nextInt(99)+1);
            AMTreeNode l5_4 = new AMNumberNode((double) rd.nextInt(99)+1);
            AMTreeNode l5_5 = new AMNumberNode((double) rd.nextInt(99)+1);

            try {
                root.setLeftNode(l2_0);
                root.setRightNode(l2_1);

                l2_0.setLeftNode(l3_0);
                l2_0.setRightNode(l3_1);
                l2_1.setLeftNode(l3_2);
                l2_1.setRightNode(l3_3);

                l3_0.setLeftNode(l4_0);
                l3_0.setRightNode(l4_1);
                l3_1.setLeftNode(l4_2);
                l3_1.setRightNode(l4_3);
                l3_2.setLeftNode(l4_4);
                l3_2.setRightNode(l4_5);

                l4_0.setLeftNode(l5_0);
                l4_0.setRightNode(l5_1);
                l4_2.setLeftNode(l5_2);
                l4_2.setRightNode(l5_3);
                l4_5.setLeftNode(l5_4);
                l4_5.setRightNode(l5_5);
            } catch (OperationNotSupportedException e) {
                e.printStackTrace();
            }

            for (String line : new PrettyTreePrint(root).getPrint()) {
                System.out.println(line);
            }

            double ret = 0;
            try {
                ret = root.calcIntermediately();
                System.out.printf("\nresult = %s%n", ret);
            } catch (Exception e) {
                System.out.printf("\nresult = N/A (error: %s)", e.getMessage());
            }
            System.out.printf("\n\n");
        }

    }
}
