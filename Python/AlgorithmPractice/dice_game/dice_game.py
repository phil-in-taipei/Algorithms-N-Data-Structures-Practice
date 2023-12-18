from random import randrange

class DiceGame:

    def __init__(self, number_of_rolls):
        self.number_of_rolls = number_of_rolls

    def getResults(self):
        results = []
        for x in range(self.number_of_rolls):
            dice_1 = randrange(1, 7)
            dice_2 = randrange(1, 7)
            sum_of_dice = dice_1 + dice_2
            result = {
                       "dice_1": dice_1,
                       "dice_2": dice_2,
                       "sum": sum_of_dice,
                      } 
            if sum_of_dice == 7 or sum_of_dice ==11:
                result["result"] = "win"
            elif sum_of_dice == 2 or sum_of_dice == 3 or sum_of_dice == 12:
                result["result"] = "lose"
            else:
                result["result"] = "roll again"
            results.append(result)
        return results


