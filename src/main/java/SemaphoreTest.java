import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * Created with IntelliJ IDEA.
 *
 * @author buxiaoming
 * Date: 2019-03-27
 * Time: 15:27
 */
public class SemaphoreTest {

    private static final int THREAD_COUNT = 30;

    private static ExecutorService service = Executors.newFixedThreadPool(THREAD_COUNT);

    private static Semaphore s = new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            service.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        /**
                         * 每次最多同时执行10个线程
                         */
                        s.acquire();
                        System.out.println("save data");
                        Thread.sleep(1000);
                        s.release();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
        service.shutdown();
    }

}
