package com.example.sagoo.radiodialog;


import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class MyDialog extends DialogFragment {

    private String[] option;
    private String selection;
    private dialogCallbacks dialogCallbacks;

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {


        option = getResources().getStringArray(R.array.options);

        AlertDialog.Builder alert = new AlertDialog.Builder(getActivity());
        alert.setTitle("choose options");
        alert.setSingleChoiceItems(R.array.options, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                selection = option[i];
            }
        });
        alert.setPositiveButton("ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(getContext(),selection,Toast.LENGTH_LONG).show();

            }
        });
        alert.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        });

        return alert.create();
    }
}

