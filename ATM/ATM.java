import java.io.IOException;

public class ATM {

	public static void main(String[] args) throws IOException {
		OptionMenu optionMenu = new OptionMenu();
		introduction();
		optionMenu.mainMenu();
	}

	public static void introduction() {
		System.out.println("Welcome to the ATM Project. We are happy to offer our banking services to you today. We pride ourselves on our excelent customer service. So, if there you need help with anything please feel free to ask us for assistance.\n");
	}
}
