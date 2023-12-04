function calculator(a: number, b: number, operator: string): number {
    let value: number;
    switch (operator) {
        case "+":
          value = a + b;
          break;
          case "-":
            value = a - b;
          break;
          case "/":
            value = a / b;
          break;
          case "*":
            value = a * b;
          break;
        default:
            throw new Error('Invalid operator');
      }

      return value;
}

module.exports = calculator;