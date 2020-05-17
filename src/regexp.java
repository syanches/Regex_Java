import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexp {
    public static void main(String[] args) {
        int nar = 0;
        int glag = 0;
        int pril = 0;
        Pattern p;
        Matcher m;
        String s = "а я он красный синий";
        p = Pattern.compile("[а-яА-Я]+о[^а-яА-Я]");
        m = p.matcher(s);
        while(m.find()){
            nar++;
        }
        System.out.println("Наречий: " + nar);

        p = Pattern.compile("[а-яА-Я]+(ый|ая|ое|ые|ий)");
        m = p.matcher(s);
        while(m.find()){
            pril++;
        }
        System.out.println("Прилагательные: " + pril );

        p = Pattern.compile("[а-яА-Я]+(ть|ла|ли|ал|аю)");
        m = p.matcher(s);
        while(m.find()){
            glag++;
        }
        System.out.println("Глаголов: " + glag);

    }
}