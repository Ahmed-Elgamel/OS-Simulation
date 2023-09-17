
public class OS {


    public static void main(String[] args) throws Exception {
        int arrival1=0;
        int arrival2=10;
        int arrival3=11;
        int quantum=11;

        Scheduler.start(arrival1,arrival2,arrival3,quantum);

    }


}
