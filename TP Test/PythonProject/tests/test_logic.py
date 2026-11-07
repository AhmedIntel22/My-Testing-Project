import pytest
from app.calculator import calculate_points

@pytest.mark.parametrize("amount, expected", [
    (50, 0),
    (100, 10),
    (250, 20),
    (-10, 0),
])
def test_loyalty_logic_integration(amount, expected):
    assert calculate_points(amount) == expected

from pytest_bdd import scenario, given, when, then
from app.calculator import calculate_points

@scenario('loyalty.feature', 'Award points for a standard purchase')
def test_loyalty_acceptance():
    pass

@given('a user has a purchase amount of 200', target_fixture="context")
def user_amount():
    return {"amount": 200}

@when('the points are calculated')
def calc_step(context):
    context["result"] = calculate_points(context["amount"])

@then('the user should receive 20 points')
def check_step(context):
    assert context["result"] == 20

    