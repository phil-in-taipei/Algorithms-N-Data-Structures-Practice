"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const formatPhoneNumber = require('./format-phone-number');
test("Test format phone number", () => {
    const formattedPhoneNumber = formatPhoneNumber([7, 0, 3, 5, 3, 4, 2, 0, 9, 8]);
    expect(formattedPhoneNumber).toBe('(703) 534-2098');
});
