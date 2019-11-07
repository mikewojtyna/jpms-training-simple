import pro.buildmysoftware.clock.systemclockprovider.SystemClockProvider;

module pro.buildmysoftware.clock.systemclockprovider {
    requires pro.buildmysoftware.clock;
    provides pro.buildmysoftware.clock.api.ClockApiProvider with SystemClockProvider;
}