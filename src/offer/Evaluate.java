package offer;

import java.util.LinkedList;

public class Evaluate {
    public static void main(String[] args) {
        String input = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";

        String[] strings = input.split(" ");

        LinkedList<String> ops = new LinkedList<>();
        LinkedList<Double> vals = new LinkedList<>();

        for (String string : strings) {
            if (string.equals("(")) {

            } else if (string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/") || string.equals("sqrt")) {
                ops.push(string);
            } else if (string.equals(")")) {
                String op = ops.pop();
                double v = vals.pop();
                if (op.equals("+")) {
                    v = vals.pop() + v;
                } else if (op.equals("-")) {
                    v = vals.pop() - v;
                } else if (op.equals("*")) {
                    v = vals.pop() * v;
                } else if (op.equals("/")) {
                    v = vals.pop() / v;
                } else if (op.equals("sqrt")) {
                    v = Math.sqrt(v);
                }
                vals.push(v);
            } else {
                vals.push(Double.parseDouble(string));
            }
        }

        System.out.println(vals.pop());
    }
}
