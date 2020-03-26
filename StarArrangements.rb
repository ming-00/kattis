def starArrangements()
  s = gets.chomp.to_i

  puts s.to_s + ":"
  # s % (a + b) == 0 || (s - a) % (a + b) == 0
  rowNumber = 2
  while rowNumber < s

    if evaluate_case(s, rowNumber, rowNumber - 1)
      puts rowNumber.to_s + "," + (rowNumber - 1).to_s
    end

    if evaluate_case(s, rowNumber, rowNumber)
      puts rowNumber.to_s + "," + (rowNumber).to_s
    end
    rowNumber += 1
  end
end


def evaluate_case(s, a, b)
  return s % (a + b) == 0 || (s - a) % (a + b) == 0
  #n = 1
  #while n < s
  #  if x * n + y * n == s
  #    return true
  #  end
  #  p = n - 1
  #  if p > 0
  #    if x * n + y * p == s
  #      return true
  #    end
  #  end
  #  n += 1
  #end

  #return false
end


starArrangements()
