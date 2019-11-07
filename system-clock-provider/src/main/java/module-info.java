import pro.buildmysoftware.clock.system.SystemClockProvider;

module pro.buildmysoftware.clock.system {
	requires pro.buildmysoftware.clock.api;
	provides pro.buildmysoftware.clock.api.ClockApiProvider with SystemClockProvider;
}