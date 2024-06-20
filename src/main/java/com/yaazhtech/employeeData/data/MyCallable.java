package com.yaazhtech.employeeData.data;
//callable
//What is Callable?
//Callable is an interface in Java found in the java.util.concurrent package. It is often used in multi-threading environments. Callable defines a single method, call(), which returns a value that can be obtained through Future<V> objects.
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() {
        // Perform your tasks here and return the result
        return 42;
    }


    public static void main(String[] args) throws Exception, ExecutionException, InterruptedException {
        Callable<Integer> callable = new MyCallable();
        FutureTask<Integer> futureTask = new FutureTask<>(callable);
        Thread thread = new Thread(futureTask);
        thread.start();
        Integer result = futureTask.get();
        System.out.println("Result: " + result);
    }
}
