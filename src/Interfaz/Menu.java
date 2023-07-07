package Interfaz;
import javax.swing.JOptionPane;
public class Menu 
{
	public static void main(String[] args) 
	{
		String MenuConversiones[] = { "Conversor de monedas", "Conversor de Temperaturas", "Conversor de longitudes" };
		String MenuPrincipal = (String) JOptionPane.showInputDialog(null,"Seleccione un conversor: ","Menu",JOptionPane.DEFAULT_OPTION,null,MenuConversiones,MenuConversiones[0]);
		
		
	}
	
}


	

