package utils.preyea.com.customdialog;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.support.graphics.drawable.AnimatedVectorDrawableCompat;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.preyea.utils.customdialog.R;

//Custom Dialog
  public class DialogMaker extends DialogFragment {

    //Custom dialog is created after show() is invoked on the instance of this class
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        int drawable;
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        View view = getActivity().getLayoutInflater().inflate(R.layout.dialog_loading, null);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_cloud);
        TextView textView = (TextView) view.findViewById(R.id.txt_msg);
        builder.setView(view);
        setCancelable(false);
        textView.setText(CustomDialog.getMsg());

        //Choose desired icon
        switch (CustomDialog.getChoice()) {
            case "1":
                drawable = R.drawable.vector_clouddownload_avd;
                break;
            case "2":
                drawable = R.drawable.vector_cloudupload_avd;
                break;
            case "3":
                drawable = R.drawable.vector_setting_avd;
                break;
            case "4":
                drawable = R.drawable.vector_signal_avd;
                break;

            default:
                drawable = R.drawable.vector_setting_avd;
                break;
        }

        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.create(getActivity(), drawable);
        imageView.setImageDrawable(animatedVectorDrawableCompat);
        if ( animatedVectorDrawableCompat != null)
        {
            animatedVectorDrawableCompat.start();
        }
        return builder.create();

    }

}
