def calculate_points(purchase_amount):
    if purchase_amount < 0:
        return 0
    if purchase_amount >= 100:
        return (purchase_amount // 100) * 10
    return 0