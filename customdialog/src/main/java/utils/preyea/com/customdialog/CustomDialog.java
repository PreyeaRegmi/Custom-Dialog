package utils.preyea.com.customdialog;

import android.app.FragmentManager;

/**
 * Created by Preyea on 9/1/2016.
 */
//Wrapper class for CustomDialog
public class CustomDialog
{
    private static DialogMaker ld=null;
    private static String choice;
    private static String msg;
    public final static String DOWNLOADING="1";
    public final static String UPLOADING="2";
    public final static String LOADING="3";
    public final static String CONNECTING="4";

    //Shows dialog with desired icon and text
    public static void showdialog(FragmentManager fragmentManager, String message, String choosen) {
        choice = choosen;
        msg = message;
        if(ld!=null) {
            ld.dismiss();
            ld = null;
        }
        ld = new DialogMaker();
        ld.show(fragmentManager, "CustomDialog");
    }
    //Hides any dialog previously created
    public static void hidedialog()
    {
        if (ld!=null)
        {
            ld.dismiss();
            ld=null;
        }
    }
    public static String getMsg()
    {
        return msg;
    }

    public static String getChoice()
    {
        return choice;
    }

}

