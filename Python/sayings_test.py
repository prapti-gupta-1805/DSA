from sayings import hello

def test_hello():
    assert hello("prapti") == "hello, prapti"
    assert hello() == "hello, world"