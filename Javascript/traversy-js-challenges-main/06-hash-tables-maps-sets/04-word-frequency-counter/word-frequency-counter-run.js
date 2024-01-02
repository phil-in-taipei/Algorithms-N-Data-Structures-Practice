const wordFrequencyCounter = require('./word-frequency-counter');

const result = wordFrequencyCounter(
  //'The quick brown fox jumps over the lazy dog.'
  "The quick brown fox jumps over the lazy dog. The dog barks, and the fox runs away."
);

console.log(result);
