package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;

import com.android.volley.toolbox.NetworkImageView;

public class TwoThirdScale extends NetworkImageView {

    public TwoThirdScale(Context context) {
        super(context);
    }

    public TwoThirdScale(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TwoThirdScale(Context context, AttributeSet attributeSet, int defStyle) {
        super(context, attributeSet, defStyle);
    }

    @Override
    protected void onMeasure(int width, int height) {
        int twoThirdHeight = MeasureSpec.getSize(width) *2/3;
        int twoThirdHeightSpec = MeasureSpec.makeMeasureSpec(twoThirdHeight, MeasureSpec.EXACTLY);
        super.onMeasure(width, twoThirdHeightSpec);
    }
}
