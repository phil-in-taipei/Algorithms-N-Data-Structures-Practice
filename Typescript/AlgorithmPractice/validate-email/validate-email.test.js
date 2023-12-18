"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const validateEmail = require('./validate-email');
test("Test validate email works", () => {
    const result = validateEmail("sweeney.phil@gmx.com");
    expect(result).toBe(true);
});
