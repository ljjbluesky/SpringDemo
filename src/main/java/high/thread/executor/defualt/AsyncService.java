package high.thread.executor.defualt;

import org.springframework.scheduling.annotation.Async;

public class AsyncService {
    @Async
    public void execute() {
        System.out.println(Thread.currentThread().getName());
    }
}
