
interface AsyncCallback {
    void onFinish(String result);
}


class AsyncTask {
    void performTask(AsyncCallback callback) {
        System.out.println("Starting Task in a New Thread...");
        
        
        new Thread(() -> {
            try {
                Thread.sleep(3000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
            
            callback.onFinish("Async Task Completed!");
        }).start();
    }
}


public class Asynchronous {
    public static void main(String[] args) {
        AsyncTask asyncTask = new AsyncTask();
        
        
        asyncTask.performTask(new AsyncCallback() {
            @Override
            public void onFinish(String result) {
                System.out.println("Callback Received: " + result);
            }
        });

        System.out.println("Main thread is free to do other tasks...");
    }
}
