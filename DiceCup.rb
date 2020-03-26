def DiceCup()
  diceFaces = gets.split(" ").map(&:to_i)
  n = diceFaces[0]
  m = diceFaces[1]

  hash = Hash.new {}
  sum = 0

  for i in 1..n

    for j in 1..m
      counter = 0
      sum = i + j
      counter += 1
      if hash[sum] != nil
        counter = hash[sum] + 1
        hash[sum] = counter
      else
        hash[sum] = counter
      end

    end
  end

  max = [m, n].max
  findDiceFaces(hash, findMaxCountersInHash(hash))

end

def findMaxCountersInHash(hash)
  max = 0
  hash.each do |key, value|
    if value > max
      max = value
    end
  end
  return max
end

def findDiceFaces(hash, max)
  i = 1

  while i <= 21
    if hash[i] == max
      puts "#{i}"
    end
    i += 1
  end

end


DiceCup
