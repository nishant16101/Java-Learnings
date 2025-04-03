interface Callback{
    void onCompletion(String message);
}
class Task{
    void executeTask(Callback callback){
        System.out.println("Task is being executed");
        callback.onCompletion("Task is completed succesfully");
    }
}
public class Synchronouscallback{
    public static void main(String[] args) {
        Task mytask = new Task();
        mytask.executeTask(new Callback(){
            @Override
            public void onCompletion(String message){
                System.out.println("Callback Received"+message);
            }
        });
    }
}