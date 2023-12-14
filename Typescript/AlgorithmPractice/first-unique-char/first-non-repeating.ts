
function findFirstNonRepeatingCharacter(submittedString: string): string | null {
    const charCount = new Map<string, number>();

    for (const char of submittedString) {
        charCount.set(char, (charCount.get(char) || 0) + 1);
    }
    for (const char of submittedString) {
        if (charCount.get(char) === 1) {
          return char;
        }
      }
      return null;
}

module.exports = findFirstNonRepeatingCharacter;