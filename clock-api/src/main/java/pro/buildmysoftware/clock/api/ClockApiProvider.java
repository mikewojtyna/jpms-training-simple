package pro.buildmysoftware.clock.api;

import java.time.Clock;
import java.util.ServiceLoader;

public interface ClockApiProvider {

    static Clock getInstance() {
        return ServiceLoader.load(ClockApiProvider.class).findFirst().orElseThrow().provide();
    }

    Clock provide();

}
