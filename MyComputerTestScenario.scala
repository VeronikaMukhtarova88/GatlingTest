package PERF

import io.gatling.core.Predef._
import io.gatling.core.controller.inject.open.OpenInjectionStep
import io.gatling.http.Predef._
import PERF.Feeders._


object MyComputerTestScenario {
  def apply () = new MyComputerTestScenario ().scn
 }

class MyComputerTestScenario {

    val scn = scenario("MyComputerTest")
      .feed(MyFeed)
    .exec(Actions.GetHomePage)
    .exec(Actions.PostAuthorization)
    .randomSwitch(
    30 -> exec(Actions.GetSerchFlights)
    10 -> exec(Actions.PostSelectFlight1)
    10 -> exec(Actions.PostSelectFlight2)
    10 -> exec(Actions.Data)
    10 -> exec(Actions.GetFlights)
    30 -> exec(Actions.GetUnAuthorization)
  )

}
