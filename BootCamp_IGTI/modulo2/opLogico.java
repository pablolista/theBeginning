package modulo2;

public class opLogico {

    public static void main(String[] args) {
        boolean p, q, s;
        p = false; q = false;
        s = p && q;
        //nas precedencias, primeiro executa os "!", dps os "&&", dps os "||"

        System.out.printf("p: %b, q: %b, s: %b\n", p, q, s);

        q = true;
        s = p || q;

        System.out.printf("p: %b, q: %b, s: %b\n", p, q, s);

        q = false;
        s = p == q;

        System.out.printf("p: %b, q: %b, s: %b", p, q, s);
        
    }
    
}