const validateEmail = require('./validate-email');

test("Test validate email works", () => {
    const result: boolean = validateEmail("sweeney.phil@gmx.com")
    expect(result).toBe(true);
});


export {}