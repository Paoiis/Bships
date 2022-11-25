public class Game
{	
	public static void main(String[] args) 
	{		
		MainFrame mainFrame = MainFrame.getMainFrame();
		if(mainFrame.startMain("Player", "Enemy"))
		{
			Splash splash1 = mainFrame.startSplash1();
			Splash splash2 = mainFrame.startSplash2();
			splash1.start();
			splash2.start();
		}
	}
}

