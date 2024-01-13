from functools import reduce


class CalculateSalesWithTax:

    def __init__(self, products, tax_rate):
        self.products = products
        self.tax_rate = tax_rate

    def calc_total(self, acc, eachItem):
        return acc + (eachItem['price'] * eachItem['quantity'])

    def get_total(self):
        pretax_total = reduce(self.calc_total, self.products, 0)
        tax = pretax_total * (self.tax_rate * .01)
        return pretax_total + tax

