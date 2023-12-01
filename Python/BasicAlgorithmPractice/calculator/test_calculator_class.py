from unittest import TestCase
from calculator.calculator_class import Calculator


class TestCalculator(TestCase):
    def test_add(self):
        print("Testing add method...")
        obj = Calculator(10, 2)
        result = obj.add()
        self.assertEqual(result, 12)

    def test_subtract(self):
        print("Testing subtract method...")
        obj = Calculator(10, 2)
        result = obj.subtract()
        self.assertEqual(result, 8)

    def test_multiply(self):
        print("Testing multiply method...")
        obj = Calculator(10, 2)
        result = obj.multiply()
        self.assertEqual(result, 20)

    def test_divide(self):
        print("Testing divide method...")
        obj = Calculator(10, 2)
        result = obj.divide()
        self.assertEqual(result, 5.0)
