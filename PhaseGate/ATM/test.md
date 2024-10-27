python atm.py first attempt
`
account_users = []
account_details = []

'''
1 - Get user details (Done)
2 - Store the details in a list called account_details (Done)
'''

def get_account_details():
    email = str(input("Enter your email: "))
    if not email or "@" not in list(email) or "." not in list(email):
        print("Please enter a valid email eg: john@email.com")
    
    first_name = str(input("Enter your first name: "))
    if not first_name:
        print("Please enter a first name!")
    
    last_name = str(input("Enter your last name: "))
    if not last_name:
        print("Please enter your first name!")
    
    phone = str(input("Enter your phone number: "))
    if not phone.isdigit() or len(phone) != 11:
        print("Incorrect phone number!")
    
    account_pin = str(input("Enter your transaction pin: "))
    if not account_pin.isdigit() or len(account_pin) != 4:
        print("Incorrect input entered must be a 4 digit number!")

    account_details.append(email)
    account_details.append(first_name)
    account_details.append(last_name)
    account_details.append(phone)
    account_details.append(account_pin)
    account_details.append(0.00)
    account_users.append(account_details.copy())
    account_details.clear()
    print(account_users)
    

def display_existing_accounts():
    for user in account_users:
        print(user)


'''
3 - prompt user to enter email
4 - Loop through the account_users
5 - for each user account_details clear the account_details if email is found
'''

def close_account(email, pin):
    for account in account_users:
        # account => [email@gmail.com, fname, lname, 080123456789, 1234, 0.00]
        if email in account and pin in account:
            print(f"closing account for {email}")
            account.clear()
        

'''
6 - prompt user to enter email and amount
7 - Loop through the account_users
8 - for each account get the last element of the account[-1] and represent it as balance
9 - If amount is greater than 0 increment balance els edisplay error.
'''
def deposit(email, amount):
    for account in account_users:
        if email in account:
            if amount > 0:
                account[-1] += amount
                print(f"Amount N{amount} deposited successfully")
            else:
                print("Invalid amount deposited! amount should be more than 0!")
        

'''
10 - prompt user to enter email and amount
11 - Loop through the account_users
12 - for each account get the last element of the account[-1] and represent it as balance
13 - If amount is les than or equals 0 display error else if balance is greater than amount
14 - then decrement from balance
'''
def withdraw(email, amount):
    for account in account_users:
        if email in account:
            if amount <= 0:
                print("Invalid amount to withdraw amount should be more than 0!")
            elif account[-1] > amount:
                account[-1] -= amount
                print(f"Amount N{amount} withdraw was successfully")


def check_balance(email):
    for account in account_users:
        if email in account:
            balance = account[-1]
            print(balance)


def transfer_money(sender, reciever, pin, amount):
    amount_to_send = 0
    for account in account_users:
        if sender in account and pin in amount:
            if account[-1] > amount:
                account[-1] -= amount
                amount_to_send = amount
                print("Sending...")
                break
            else:
                print("Insufficient fund!")
                
    if amount_to_send == amount:
        for account in account_users:
            if reciever in account:
                account[-1] += amount_to_send
                print(f"Amount N{amount_to_send} sent to {reciever} successfully!.")
                amount_to_send = 0
                break
    else:
        print("Network problem while performin transaction")
    
    print("Verifying balance for sender")
    check_balance(sender)
    
    print("Verifying balance for reciever")
    check_balance(reciever)
 

def change_pin(email, pin):
    for account in account_users:
        if email in account and pin in account:
            new_pin = str(input("Enter your new transaction pin 0000: "))
            if not new_pin.isdigit() or len(new_pin) != 4:
                print("Incorrect input entered must be a 4 digit number!")
                continue
            else:
                account[-2] = new_pin
                break


while True:
    menu = int(input("""
    Enter 1 to register user
    Enter 2 to view existing accounts
    Enter 3 to close account
    Enter 4 to deposit money
    Enter 5 to withdraw money
    Enter 6 to check account balance
    Enter 7 to transfer
    Enter 8 to change pin
    Enter 0 to exit
    >> """))    
    if menu == 0:
        print("Exiting...")
        break
    elif menu == 1:
        get_account_details()
    elif menu == 2:
        display_existing_accounts()
    elif menu == 3:
        closing_email = str(input("Enter your email to close your existing account: "))
        close_account(closing_email)
    elif menu == 4:
        email = str(input("Enter email of your existing account: "))
        amount = int(input("Enter amount to deposit "))
        deposit(email, amount)
    elif menu == 5:
        email = str(input("Enter email of your existing account: "))
        amount = int(input("Enter amount to withdraw: "))
        withdraw(email, amount)
    elif menu == 6:
        email = str(input("Enter email of your existing account: "))
        check_balance(email)
    elif menu == 7:
        sender = str(input("Enter email of your existing account: "))
        reciever = str(input("Enter email of the reciever: "))
        pin = str(input("Enter your trnsaction pin: "))
        amount = int(input("Enter amount to send "))
        transfer_money(sender, reciever, pin, amount)
    elif menu == 8:
        email = str(input("Enter email of your existing account: "))
        pin = str(input("Enter your existing pin: "))
        change_pin(email)


def transfer_money(from_name: str, to_name: str, amount: float) -> str:
    pin = input("Enter your PIN to proceed with the transfer: ")
    from_account = next((acc for acc in accounts if acc.get("first_name").lower() == from_name.lower() or acc.get("last_name").lower() == from_name.lower()), None)
    to_account = next((acc for acc in accounts if acc.get("first_name").lower() == to_name.lower() or acc.get("last_name").lower() == to_name.lower()), None)

    if from_account is None:
        return "Sender account not found."
    if to_account is None:
        return "Recipient account not found."
    if pin != from_account.get("pin"):
        return "Incorrect PIN. Transfer failed."
    if amount > from_account["balance"]:
        return "Insufficient funds."
    
    from_account["balance"] -= amount
    to_account["balance"] += amount
    return f"N{amount} transferred from {from_account['first_name']} {from_account['last_name']} to {to_account['first_name']} {to_account['last_name']}."

`