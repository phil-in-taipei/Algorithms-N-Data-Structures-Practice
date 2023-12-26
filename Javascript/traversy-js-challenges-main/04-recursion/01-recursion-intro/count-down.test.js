const countDown = require('./count-down');

describe('countDown', () => {
  let originalLog;

  beforeAll(() => {
    // Mock console.log to prevent logs from cluttering the test output
    originalLog = console.log;
    console.log = jest.fn();
  });

  afterAll(() => {
    // Restore console.log after all tests are done
    console.log = originalLog;
  });

  it('should log numbers in reverse order and print "Finished!"', () => {
    countDown(3);
    expect(console.log).toHaveBeenNthCalledWith(1, "The number is: 3"); // 3 is logged first
    expect(console.log).toHaveBeenNthCalledWith(2, "The number is: 2"); // 2 is logged next
    expect(console.log).toHaveBeenNthCalledWith(3, "The number is: 1"); // 1 is logged last
    expect(console.log).toHaveBeenNthCalledWith(4, 'Finished!'); // 'All done!' is logged after counting down
  });

  it('should handle num <= 0', () => {
    countDown(0);
    expect(console.log).toHaveBeenCalledWith('Finished!'); // 'All done!' is logged when num is 0

    console.log.mockClear(); // Clear the previous logs
    countDown(-1);
    expect(console.log).toHaveBeenCalledWith('Finished!'); // 'All done!' is logged when num is negative
  });
});
