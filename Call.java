import java.util.List;

public class Call {

    // Queues for each call's rank
    List<List<Call>> callQueues;

    public CallHandler() { ... }

    // Gets the first available employee who can handle this call.
    public Employee getHandlerForCall(Call call) { ... }

    // Routes the call to an available employee, or saves in a queue if no employee
    // is available.
    public void dispatchCall(Caller caller) {
        Call call = new Call(caller);
        dispatchCall(call);
    }

}
