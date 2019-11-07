package pro.buildmysoftware.clock.systemclockprovider;

import pro.buildmysoftware.clock.api.ClockApiProvider;

import java.time.Clock;

public class SystemClockProvider implements ClockApiProvider {
    @Override
    public Clock provide() {
        return Clock.systemUTC();
    }
}
