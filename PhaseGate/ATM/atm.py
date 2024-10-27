accounts = []


def add_account(accounts: list) -> str:
    first_name = input("Enter first name: ")
    last_name = input("Enter last name: ")
    pin = input("Enter pin number: ")
    accounts.append(dict(
        first_name=first_name,
        last_name=last_name,
        pin=pin,
        balance=0.0  # Initialize balance to 0
    ))
    return f"Account {first_name} {last_name} created successfully"


def close_account(name: str) -> str:
    for index, account in enumerate(accounts):
        if name.lower() == account.get("first_name").lower() or name.lower() == account.get("last_name").lower():
            full_name = f"{account.get('first_name')} {account.get('last_name')}"
            pin = input("Enter your PIN to confirm account closure: ")
            if pin == account.get("pin"):
                option = input(f"Warning! Are you sure you wish to close account for {full_name}? (y/n): ")
                if option.lower() == "y" or option.lower() == "yes":
                    del accounts[index]
                    return f"Account {full_name} deleted successfully."
                else:
                    return f"Delete for {full_name} was canceled."
            else:
                return "Incorrect PIN. Account closure failed."
    return "Account not found to delete."


def deposit_money(name: str, amount: float) -> str:
    pin = input("Enter your PIN to proceed with the deposit: ")
    for account in accounts:
        if (account.get("first_name").lower() == name.lower() or account.get("last_name").lower() == name.lower()):
            if pin == account.get("pin"):
                account["balance"] += amount
                return f"N{amount} deposited. New balance: N{account['balance']:.2f}."
            else:
                return "Incorrect PIN. Deposit failed."
    return "Account not found."


def withdraw_money(name: str, amount: float) -> str:
    pin = input("Enter your PIN to proceed with the withdrawal: ")
    for account in accounts:
        if (account.get("first_name").lower() == name.lower() or account.get("last_name").lower() == name.lower()):
            if pin == account.get("pin"):
                if amount > account["balance"]:
                    return "Insufficient funds."
                account["balance"] -= amount
                return f"N{amount} withdrawn. New balance: N{account['balance']:.2f}."
            else:
                return "Incorrect PIN. Withdrawal failed."
    return "Account not found."


def check_balance(name: str) -> str:
    pin = input("Enter your PIN to check your balance: ")
    for account in accounts:
        if (account.get("first_name").lower() == name.lower() or 
            account.get("last_name").lower() == name.lower()):
            if pin == account.get("pin"):
                return f"Current balance for {account['first_name']} {account['last_name']}: N{account['balance']:.2f}."
            else:
                return "Incorrect PIN. Balance check failed."
    return "Account not found."


def transfer_money(from_name: str, to_name: str, amount: float) -> str:
    return f""


while True:
    menu = int(input("""
    Select a menu:
        1 -> create account
        2 -> close account
        3 -> deposit money
        4 -> withdraw money
        5 -> check balance
        6 -> transfer
        7 -> change pin
        0 -> exit program
    """))

    match menu:
        case 1:
            print(add_account(accounts))
        case 2:
            name = input("Enter account name to close: ")
            print(close_account(name))
        case 3:
            name = input("Enter account name to deposit money: ")
            amount = float(input("Enter amount to deposit: "))
            print(deposit_money(name, amount))
        case 4:
            name = input("Enter account name to withdraw money: ")
            amount = float(input("Enter amount to withdraw: "))
            print(withdraw_money(name, amount))
        case 5:
            name = input("Enter account name to check balance: ")
            print(check_balance(name))
        case 6:
            from_name = input("Enter your account name: ")
            to_name = input("Enter recipient account name: ")
            amount = float(input("Enter amount to transfer: "))
            print(transfer_money(from_name, to_name, amount))
        case 0:
            print("Exiting the ATM app.")
            break
        case _:
            print("Invalid option")
