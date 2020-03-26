def sevenWonders()
  string = gets.chomp.split('')

  tCards = 0
  cCards = 0
  gCards = 0
  #string = string.sort


  for i in 0...string.length
    if string[i] == "T"
      tCards += 1

    elsif string[i] == "C"
      cCards += 1

    elsif string[i] == "G"
      gCards += 1

    end

  end


  winner = (tCards ** 2) + (cCards ** 2) + (gCards ** 2)

  if tCards > 0 and cCards > 0 and gCards > 0
    if tCards == cCards and cCards == gCards
      winner += 7 * cCards
      #puts "me equalCards"
    elsif [gCards, cCards].min == [gCards, tCards].min
      winner += 7 * gCards
      #puts "me gcards"
    elsif [tCards, cCards].min == [tCards, gCards].min
      #puts "me tcards"
      winner += 7 * tCards
    elsif [cCards, gCards].min == [cCards, tCards].min
      #puts "me ccards"
      winner += 7 * cCards
    end
  end

  puts winner

end

sevenWonders
