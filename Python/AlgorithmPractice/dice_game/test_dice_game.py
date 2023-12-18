from unittest import TestCase
from .dice_game import DiceGame


class TestDiceGame(TestCase):

    def setUp(self):
        self.test_obj1 = DiceGame(10)

    def test_get_results(self):
        results = self.test_obj1.getResults()
        for r in results:
            self.assertTrue(0 < r['dice_1'] < 7)
            self.assertTrue(0 < r['dice_2'] < 7)
            self.assertTrue(1 < r['sum'] < 13)
            self.assertTrue(r['result'] == "win" or r['result'] == 'lose' or r['result'] == 'roll again')




