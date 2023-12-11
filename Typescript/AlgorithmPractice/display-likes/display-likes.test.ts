const displayLikesTest = require('./display-likes');

test('Display Likes', () => {
  expect(displayLikesTest([])).toEqual('no one likes this');
  expect(displayLikesTest(['Peter'])).toEqual('Peter likes this');
  expect(displayLikesTest(['Jacob', 'Alex'])).toEqual('Jacob and Alex like this');
  expect(displayLikesTest(['Max', 'John', 'Mark'])).toEqual(
    'Max, John and Mark like this'
  );
  expect(displayLikesTest(['Alex', 'Jacob', 'Mark', 'Max'])).toEqual(
    'Alex, Jacob and 2 others like this'
  );
  expect(displayLikesTest(['Alex', 'Jacob', 'Mark', 'Max', 'Jill'])).toEqual(
    'Alex, Jacob and 3 others like this'
  );
});