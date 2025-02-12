import pytest
from calc import square

def test_square():
    assert square(2) == 4
    assert square(3) == 9
    assert square(-2) == 4
    assert square(-3) == 9
    assert square(0) == 0
    with pytest.raises(TypeError):
        square("cat")


#run 'pytest calc_test.py' instead of 'python calc_test.py'