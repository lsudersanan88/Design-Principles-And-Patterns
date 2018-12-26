package com.lakshmi.singleton.SingletonNew;


/**
 * Interface Screen
 * {
 *  void setPixel(x,y,color);
 * }
 * Class Application
 * drawCircle(Screen screen)
 * {
 *  // for each point
 * Screen.setPixel (x,y,color);
 * }
 * Screen s  = LCDScreen.getInstance();
 * drawCircle(s);
 * Screen s  = CRTScreen.getInstance();
 * drawCircle(s);
 *
 */



interface Screen
{
         void setPixel(int x,int y,String color);
}


public class Application {


  /*  void drawCircle(Screen screen) {
        screen.setPixel(10, 11, "green");
    }

    Screen s1  = LCDScreen.getInstance();
    drawCircle(s);
   Screen s2  = CRTScreen.getInstance();
   drawCircle(s);
}


  class LCDScreen implements Screen{
    @Override
      public void setPixel(int x, int y, String color) {

      }
  }*/

}
