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


   public static String drawCircle(Screen screen)
    {
        screen.setPixel(10, 11, "green");

        System.out.println();
        return "draw circle called";
    }


    public static void main(String[] args) { // only i screen


        Screen s1 = LCDScreen.getInstance();

         String result1 = drawCircle(s1);
          System.out.println(result1);

        Screen s2 = CRTScreen.getInstance();
        String result2 = drawCircle(s2);
        System.out.println(result2);
    }
}







  class LCDScreen implements Screen{

          private static LCDScreen soleInstance = null; //Lazy loading
          private LCDScreen()
          {
          }


          public static LCDScreen getInstance()
          {
              if(soleInstance == null)
              {
                  soleInstance = new LCDScreen();
              }
              return soleInstance;
          }

    @Override
      public void setPixel(int x, int y, String color) {

      }
  }

class CRTScreen implements Screen{

    private static CRTScreen soleInstance = null; //Lazy loading
    private CRTScreen()
    {
    }


    public static CRTScreen getInstance()
    {
        if(soleInstance == null)
        {
            soleInstance = new CRTScreen();
        }
        return soleInstance;
    }

    @Override
    public void setPixel(int x, int y, String color) {

    }
}

