# Address Book Initialization

The classes responsible for creating and managing the address book are all declared within the GUI class, ensuring they are accessible to all components. These classes are then initialized in the constructor immediately after `initComponents()`, which initializes the graphical components.

## Insert Button

Once the classes are declared and initialized, the Insert button captures and adds the parameters entered in the four JTextFields above to the address book. A validation check ensures that no field is left empty. The only exception is the `Element person`, which, as it should actually be a vector of elements (see Remove Entry), is declared and initialized within the GUI class.

## JMenuBar

At the top, there is a dropdown menu with the following options:

### FILE >
- **New Address Book:**  
  If the current address book is not empty, the user is prompted to save it (by calling the `save(1)` method) before exiting. Afterwards, the `Document` is initialized.
- **Save:**  
  Calls the `save(1)` method.
- **Import Address Book:**  
  Imports an existing address book.
- **Documentation:**  
  Opens this file.
- **Exit:**  
  If the current address book is not empty, the user is prompted to save it (calling the `save(1)` method) before exiting. Otherwise, the program closes immediately.

### ACTIONS >
- **Search:**  
  The user is asked what to search for, and the preview will display all contacts containing a match. It is possible to search for any of the parameters simultaneously and in any order. Searches can be performed in both the address book view and the XML view.
- **Remove Entries:**  
  Removes the person at the index provided by the user. Afterwards, the IDs are reassigned to cover the removed element’s position, and the missing person is replaced in the vector by the subsequent ones until the end of the address book.
- **Display:**  
  Allows switching the preview display mode.

All menu options have associated keyboard shortcuts indicated next to them.

## Methods

### save(int)
Creates the `Address Book` folder on the desktop where all address books will be saved. (If the folder already exists, no action is taken.)  
The current system date and time are retrieved.  
The user is prompted to provide a name for the address book; otherwise, the default name `addressbook` + system date will be assigned.

### reassignIDs()
Used by the Remove Entries method, it prevents a removed person from causing a `NullPointerException` if the user references them after deletion.

### preview()
If the current view mode is the address book type, it updates the preview with the most recent data entries.  
If the view mode is XML, it saves the preview in address book format to a variable and calls the `previewXML()` method.

### previewXML()
Starting from the `Document`, displays the address book in the preview area. To ensure parameters are recognized during search, a space is inserted before each `<` or after each `>`, as the method works with `.next()`.

### contains()
Checks whether each person contains all the words typed by the user, regardless of the view mode.  
Two scanners are created: one for the preview text and one for the search terms entered by the user.  
A `Set<String>` for the preview and a `Collection` for the search terms are declared, with each search word added via `.add()`.  
The method returns the result of `Set<String>.containsAll(Collection)`.  
If the view mode is the address book type, parentheses are removed from the preview text.

---

*By Nicola Tomasoni*
