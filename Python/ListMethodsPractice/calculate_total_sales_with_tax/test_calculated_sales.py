from unittest import TestCase
from .calculated_sales import CalculateSalesWithTax


class TestCalculateSalesWithTax(TestCase):

    def setUp(self):
        self.test_obj1 = CalculateSalesWithTax(
            [{'name': 'Apple', 'price': 0.5, 'quantity': 10},
             {'name': 'Banana', 'price': 0.3, 'quantity': 20},
             {'name': 'Orange', 'price': 0.6, 'quantity': 15},
             ], 8)

        self.test_obj2 = CalculateSalesWithTax(
            [{'name': 'Chocolate', 'price': 2.5, 'quantity': 5},
             {'name': 'Chips', 'price': 1.2, 'quantity': 10},
             {'name': 'Sode', 'price': 1.0, 'quantity': 8},
             {'name': 'Candy', 'price': 0.5, 'quantity': 15},
             ], 5)

    def test_get_total_with_tax(self):
        self.assertEqual(self.test_obj1.get_total_with_tax(), 21.6)
        self.assertEqual(self.test_obj2.get_total_with_tax(), 42)
