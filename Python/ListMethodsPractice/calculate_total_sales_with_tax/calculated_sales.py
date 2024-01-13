from functools import reduce


class CalculateSalesWithTax:

    def __init__(self, products, tax_rate):
        self.products = products
        self.tax_rate = tax_rate

    def _calculate_total(self, acc, each_item):
        return acc + (each_item['price'] * each_item['quantity'])

    def get_total_with_tax(self):
        pretax_total = reduce(self._calculate_total, self.products, 0)
        tax = pretax_total * (self.tax_rate * .01)
        return pretax_total + tax

