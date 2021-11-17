package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Main {

    public static void main(String[] args) throws FindFailed, InterruptedException {

        //Screen class - base of Sikuli
        Screen screen = new Screen();
        screen.click("C:\\Users\\anicolle\\Downloads\\Sikuli\\minimize.png");
       // screen.click("C:\\Users\\anicolle\\Downloads\\Sikuli\\windows.png");
       // screen.find("C:\\Users\\anicolle\\Downloads\\Sikuli\\folder.png");
        if(screen.exists("C:\\Users\\anicolle\\Downloads\\Sikuli\\sikuli.png")!= null)
            screen.doubleClick("C:\\Users\\anicolle\\Downloads\\Sikuli\\sikuli.png");
        else
            screen.doubleClick("C:\\Users\\anicolle\\Downloads\\Sikuli\\folder.png");
        screen.doubleClick();

        //screen.doubleClick("C:\\Users\\anicolle\\Downloads\\Sikuli\\folder.png");


        //screen.rightClick("Downloads\\exibir.png");
        // screen.wait(2);


    }
}
