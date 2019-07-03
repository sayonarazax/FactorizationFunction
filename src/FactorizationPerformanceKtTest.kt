import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FactorizationPerformanceKtTest {

    @Test
    fun factor() {
      val startTime =  System.currentTimeMillis()
      for(n in 1..100) factor(n)
      val stopTime = System.currentTimeMillis() - startTime
      print("Time elapsed(ms): $stopTime")
    }
}