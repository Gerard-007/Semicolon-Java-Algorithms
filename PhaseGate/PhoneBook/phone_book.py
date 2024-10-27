contacts = []

def validate_phone_number() -> str:
    while True:
        phone = input("Enter phone number: ")
        if len(phone) != 11 or not phone.isdigit():
            print("Invalid phone number! Please enter an 11-digit numeric phone number.")
        else:
            return phone


def add_contact(contacts: list) -> str:
    first_name = str(input("Enter first name: ")) or None
    last_name = str(input("Enter last name: ")) or None
    phone_number = validate_phone_number()
    contacts.append(dict(
        first_name = first_name,
        last_name = last_name,
        phone_number = phone_number
    ))
    return f"Contact added {first_name} {last_name}"


def search_contact(name: str) -> str:
    for contact in contacts:
        if name.lower() == contact.get("first_name") or name.lower() == contact.get("last_name"):
            return f"Contact found! name: {contact.get('first_name')} {contact.get('last_name')}, phone: {contact.get('phone_number')}"
    return "Contact not found."


def edit_contact(name: str) -> str:
    for contact in contacts:
        if name.lower() == contact.get("first_name").lower() or name.lower() == contact.get("last_name").lower():
            new_number = validate_phone_number()
            contact["phone_number"] = new_number
            return f"Contact updated! Name: {contact.get('first_name')} {contact.get('last_name')}, Phone: {contact.get('phone_number')}"
    return "Contact not found to edit."


def delete_contact(name: str) -> str:
    for index, contact in enumerate(contacts):
        if name.lower() == contact.get("first_name").lower() or name.lower() == contact.get("last_name").lower():
            full_name = f"{contact.get('first_name')} {contact.get('last_name')}"
            option = input(f"Warning! Are you sure you wish to delete {full_name}? (y/n): ")
            if option.lower() == "y" or option.lower() == "yes":
                del contacts[index]
                return f"Contact {full_name} deleted successfully."
            else:
                return f"Delete for {full_name} was canceled."
    return "Contact not found to delete."


while True:
    menu = str(input("Select from the menu (add, search, edit, delete, exit): "))
    
    match menu.lower():
        case "add":
            print(add_contact(contacts))
        case "search":
            find_name = str(input("Enter first/last name to search contact: "))
            print(search_contact(find_name))
        case "edit":
            find_name = str(input("Enter first/last name to edit contact: "))
            print(edit_contact(find_name))
        case "delete":
            find_name = str(input("Enter first/last name to delete contact: "))
            print(delete_contact(find_name))
        case _:
            print("Invalid option")
    if menu == "exit":
        break