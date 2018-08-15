import javax.swing.JOptionPane;

public class one {
public static void main(String[] args) {
	
	String Food=JOptionPane.showInputDialog("What is your favorite Food");
	
	if (Food.equalsIgnoreCase("Korean Cuisine")){
	String Favorite=JOptionPane.showInputDialog("What is your favorite number");
	int Number=Integer.parseInt(Favorite);
	for (int i = 0; i < Number; i++) {
		System.out.println(Food);
	}
}	

	else if (Food.equalsIgnoreCase("Cat Food")){
		JOptionPane.showMessageDialog(null,"UHHHGGGG");
		
}
	else {
		JOptionPane.showMessageDialog(null,"WWWUUUTTT");
	}
}
}