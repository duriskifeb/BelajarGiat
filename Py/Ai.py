#untuk class data
class SimpleDataManager:
    def __init__(self):
        self.data = []

    def add_entry(self, name, description):
        entry = {"name": name, "description": description}
        self.data.append(entry)
        print(f"Entry added: {entry}")

    def view_entries(self):
        if not self.data:
            print("No entries available.")
            return
        print("Current Entries:")
        for entry in self.data:
            print(f"Name: {entry['name']}, Description: {entry['description']}")

    def delete_entry(self, name):
        for entry in self.data:
            if entry['name'] == name:
                self.data.remove(entry)
                print(f"Entry deleted: {entry}")
                return
        print(f"No entry found with name: {name}")

#unutuk pemanggilan data main nya
def main():
    manager = SimpleDataManager()
    
    while True:
        print("\nOptions:")
        print("1. Add Entry")
        print("2. View Entries")
        print("3. Delete Entry")
        print("4. Exit")
        
        choice = input("Choose an option (1-4): ")
        
        if choice == '1':
            name = input("Enter name: ")
            description = input("Enter description: ")
            manager.add_entry(name, description)
        elif choice == '2':
            manager.view_entries()
        elif choice == '3':
            name = input("Enter name of the entry to delete: ")
            manager.delete_entry(name)
        elif choice == '4':
            print("Exiting the program.")
            break
        else:
            print("Invalid option. Please try again.")

if __name__ == "__main__":
    main()