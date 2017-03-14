import org.scalatestplus.play._

import scala.collection.mutable
import services.Counter

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/** Example of test for Guice-injected component. */
@RunWith(classOf[JUnitRunner])
class CounterSpec extends PlaySpec with OneAppPerSuite {

  "Counter component" should {

    "resolve implementation and produce increasing values" in {
      val counter: Counter = app.injector.instanceOf[Counter]
      counter.nextCount() mustBe 0
      counter.nextCount() mustBe 1
      counter.nextCount() mustBe 2
    }
  }
}
