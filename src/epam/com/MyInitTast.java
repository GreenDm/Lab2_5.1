package epam.com;

/**
 * Created by m18 on 22.02.2016.
 */
public class MyInitTast {

    static{
        System.out.println("static initialization block 1");
    }
    static{
        System.out.println("static initialization block 2");
    }

    {
        System.out.println("Non-static initialization block 1");
    }
    {
        System.out.println("Non-static initialization block 2");
    }

    public MyInitTast(){
        this(1);
        System.out.println("constructor 2");


    }
    public MyInitTast(int max){
        System.out.println("constructor 1");
    }
}
