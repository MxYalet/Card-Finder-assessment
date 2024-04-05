package com.example.cardinfofinder.ui.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class TextviewRobotoMediumBold extends androidx.appcompat.widget.AppCompatTextView {


    static String textFont = "Roboto-Medium.ttf";
    Context mContext;

    public TextviewRobotoMediumBold(Context context) {
        super(context);
        this.mContext = context;
        inite();
    }

    public TextviewRobotoMediumBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        inite();
    }

    public TextviewRobotoMediumBold(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        inite();
    }

    private void inite() {
        if (!isInEditMode()) {
            if (textFont == "" || textFont == null) {

                this.setTypeface(Typeface.DEFAULT);
            } else {
                this.setTypeface(Typeface.createFromAsset(mContext.getAssets(), textFont));
            }
        }
    }
}

