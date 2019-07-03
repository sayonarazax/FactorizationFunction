import java.util.ArrayList



    fun factor(x: Int): Array<Int?> {
      val primeNums = ArrayList<Int>()
      val primeMultipliers = ArrayList<Int?>()
      var dividend = x
      for (num in 2..x) {
        if (checkNums(num)) {
          primeNums.add(num)
        }
      }
      while(dividend != 1) {
        for (primeNum in primeNums) {
          if (dividend % primeNum == 0) {
            primeMultipliers.add(primeNum)
            dividend /= primeNum
            break
          }
        }
      }
      val result: Array<Int?> = arrayOfNulls(primeMultipliers.size)
      for (n in 0 until primeMultipliers.size) {
        result[n] = primeMultipliers[n]
      }
      return result
    }

    fun checkNums(num: Int): Boolean {
      when {
        num <= 1 -> return false
        num <= 3 -> return true
        num % 2 == 0 || num % 3 == 0 -> return false
      }
      var n = 5
      while (n * n <= num) {
        if (num % n == 0 || num % (n + 2) == 0){
            return false
        }
        n += 6
      }
      return true
    }

