package per.menggi.web.datascript;

public class Test {
    static  int a;
    public interface A{
        static int a = 1;
        static void test(){

        }
        default void t(){

        }

        void e();
    }

    public abstract class B implements A{
         int a = 1;
    }

}
