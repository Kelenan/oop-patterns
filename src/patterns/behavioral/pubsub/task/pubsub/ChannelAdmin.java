package patterns.behavioral.pubsub.task.pubsub;

/**
  Video channel's admin.
 */
public class ChannelAdmin implements Listner<Boolean>{
    private String name;

    public ChannelAdmin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void process(Event<Boolean> event) {
        boolean like = event.appear();
        if(like){
            System.out.printf("%s %s: This user is very loyal for us!%n", getClass().getSimpleName(), name);
        }
        else {
            System.err.printf("%s %s: Why did it happen?%n", getClass().getSimpleName(), name);
        }
    }
}
