import javax.swing.JOptionPane;
public class spc {
    public static void main(String[] args) {

       float bar = Float.parseFloat(JOptionPane.showInputDialog(null,"digite valor gasto com material:",
        "calculadora de lucros",
        JOptionPane.INFORMATION_MESSAGE ));

      float bar4 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite quanto voce recuperou de dinheiro:",
                                                            "calculadora de lucros",
                                                        JOptionPane.INFORMATION_MESSAGE));
     float bar2 = bar4 - bar;

     if (bar4 <= bar) {

        JOptionPane.showMessageDialog(null,"VOCÊ NÃO OBTEVE LUCRO AINDA",
        "calculadora de lucros",
        JOptionPane.INFORMATION_MESSAGE);

     } else if (bar4 > bar) {

        JOptionPane.showMessageDialog(null,String.format("SEU LUCRO TOTAL FOI DE %.2f$",bar2),
        "calculadora de lucros",
        JOptionPane.INFORMATION_MESSAGE);
     }

    }
}
