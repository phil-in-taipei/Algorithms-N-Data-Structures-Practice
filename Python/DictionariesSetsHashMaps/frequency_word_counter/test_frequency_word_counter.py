from unittest import TestCase
from .frequency_word_counter import FrequencyWordCounter


class TestFrequencyWordCounter(TestCase):

    def setUp(self):
        self.test_obj = FrequencyWordCounter(
            "The quick brown fox jumps over the lazy dog. The dog barks, and the fox runs away."
        )

    def test_get_count(self):
        result = self.test_obj.get_count()
        self.assertEqual(result['the'], 4)
        self.assertEqual(result['quick'], 1)
        self.assertEqual(result['brown'], 1)
        self.assertEqual(result['fox'], 2)
        self.assertEqual(result['jumps'], 1)
        self.assertEqual(result['over'], 1)
        self.assertEqual(result['lazy'], 1)
        self.assertEqual(result['dog'], 2)
        self.assertEqual(result['barks'], 1)
        self.assertEqual(result['and'], 1)
        self.assertEqual(result['runs'], 1)
        self.assertEqual(result['away'], 1)
