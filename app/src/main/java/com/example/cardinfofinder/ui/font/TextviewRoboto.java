package com.example.cardinfofinder.ui.font;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;


public class TextviewRoboto extends androidx.appcompat.widget.AppCompatTextView {


    static String textFont = "Roboto-Regular.ttf";
    Context mContext;

    public TextviewRoboto(Context context) {
        super(context);
        this.mContext = context;
        inite();
    }

    public TextviewRoboto(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        inite();
    }

    public TextviewRoboto(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        inite();
    }

    private void inite() {
        if (!isInEditMode()) {
            if (textFont == "" || textFont == null) {

            } else {
                this.setTypeface(Typeface.createFromAsset(mContext.getAssets(), textFont));
            }
        }
    }
}

