package dat;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExtraClient
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(8);
        System.out.println("Starting extra ChatClient");
        Client client = new Client("10.83.137.3", 9090, executorService);
        executorService.submit(client);
    }
}
