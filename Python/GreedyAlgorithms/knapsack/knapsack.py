
def get_knapsack_contents(items, capacity):
    number_of_items = len(items)
    total_value = 0
    knapsack = []

    items.sort(key=lambda x: x["value"]/x["weight"], reverse=True)

    for item in items:
        if item["weight"] <= capacity:
            total_value += item["value"]
            knapsack.append(item["name"])
            capacity -= item["weight"]

    return {
        "Total Value": total_value,
        "Knapsack Items": knapsack,
        "Number of Leftover Items": number_of_items - len(knapsack)
    }

