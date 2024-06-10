package PERF

import PERF.BaseUrl.httpProtocol
import io.gatling.core.Predef._
import io.gatling.http.Predef._


class MyComputerTest extends Simulation {

  setUp(MyComputerTestScenario.inject(atOnceUsers(1))).protocols(httpProtocol)

}
