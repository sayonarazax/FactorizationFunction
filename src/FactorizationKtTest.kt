import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class FactorizationKtTest {

    @Test
    fun factor() {
      val expected1: Array<Int?> = factor(3)
      val expected2: Array<Int?> = factor(45)
      val expected3: Array<Int?> = factor(525)
      val expected4: Array<Int?> = factor(20)
      val expected5: Array<Int?> = factor(210)

      val actual1: Array<Int?> = arrayOf(3)
      val actual2: Array<Int?> = arrayOf(3, 3, 5)
      val actual3: Array<Int?> = arrayOf(3, 5, 5, 7)
      val actual4: Array<Int?> = arrayOf(2, 2, 5)
      val actual5: Array<Int?> = arrayOf(2, 3, 5, 7)

      assertArrayEquals(expected1, actual1)
      assertArrayEquals(expected2, actual2)
      assertArrayEquals(expected3, actual3)
      assertArrayEquals(expected4, actual4)
      assertArrayEquals(expected5, actual5)
    }
}