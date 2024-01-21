package patterns.behavioral.pubsub.task.pubsub.impl.event;

import patterns.behavioral.pubsub.task.pubsub.Event;

import java.time.LocalDateTime;

/**
  Description object of video (model)
 */
public class Video implements Event<Video> {
    private final LocalDateTime startTime;
    private final String name;
    private final int duration;

    public Video(LocalDateTime startTime, String name, int duration) {
        this.startTime = startTime;
        this.name = name;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public Video appear() {
        return this;
    }
}
