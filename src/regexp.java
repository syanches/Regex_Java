import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regexp {
    public static void main(String[] args) {
        int nar = 0;
        int glag = 0;
        int pril = 0;
        Pattern p;
        Matcher m;
        String s = "формальный язык поиска и осуществления манипуляций с подстроками в тексте, основанный на использовании метасимволов. Для поиска используется строка-образец6, состоящая из символов и метасимволов и задающая правило поиска. Для манипуляций с текстом дополнительно задаётся строка замены, которая также может содержать в себе специальные символы.";
        p = Pattern.compile("[а-яА-Я]+о([^а-яА-Я]|$)");
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