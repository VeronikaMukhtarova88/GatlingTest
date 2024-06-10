package PERF

import io.gatling.core.Predef._
import io.gatling.core.feeder.BatchableFeederBuilder
import io.gatling.http.Predef._

object Feeders {

  val MyFeed: BatchableFeederBuilder[String] = csv("user.csv").random.eager



}
