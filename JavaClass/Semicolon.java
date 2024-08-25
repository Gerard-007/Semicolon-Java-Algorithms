/**
    private: This means the class can not be accessed by any other class.
    default: This means only classes in the same package(folder)
    can the class.
    protected: This means only the class in the same folder or subclasses
    can access the the class.
    public: means all classes can access the class.

	// Private class...
	private class Semicolon {}

	// Default class...
	class Native {}

	// protected class...
	protected class Native {}

	// pbulic class...
	public class Native {}

    Bytecode are source code that are plat form independent

   
	========= Print method...
	System.out.print();
	"Print string in the same line without spaces."

	System.out.println();
	"Print string and goes to a new line"

	System.out.printf();
	"This allows us to print string in format,"
	"%s used for string placeholder"
	"%d used for decimal placeholder"
	"%f used fo float placeholder"
	"%b used for boolean placeholder"
	"%c used for character placeholder eg A"
	"%n used for new line"
**/


// pbulic class...
public class Semicolon {

    public static void main(String[] args) {
	System.out.print("Welcome to Semicolon!.");
    }

} 