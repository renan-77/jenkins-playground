import unittest

def main():
    return 'Hello World!'

class TestHello(unittest.TestCase):
    def test_hello_success(self):
        actual = main()
        expected = 'Hello World!'
        self.assertEqual(actual, expected)

    def test_hello_fail(self):
        actual = main()
        expected = 'Hello'
        self.assertNotEqual(actual, expected)