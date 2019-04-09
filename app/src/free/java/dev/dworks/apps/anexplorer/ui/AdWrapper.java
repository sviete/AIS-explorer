package dev.dworks.apps.anexplorer.ui;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;


import dev.dworks.apps.anexplorer.R;

import static dev.dworks.apps.anexplorer.DocumentsApplication.isTelevision;


/**
 * A Wrapper which wraps AdView along with loading the view aswell
 */
public class AdWrapper extends FrameLayout {

    private boolean showInterstiatial = true;

    public AdWrapper(Context context) {
        super(context);
    }

    public AdWrapper(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public AdWrapper(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    private void init(Context context) {
        //Ads
    }

    public void initInterstitialAd(){
        requestNewInterstitial();
    }

    public void initAd(){

    }

    private void requestNewInterstitial() {

    }

    private void showInterstitial() {

    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        showInterstitial();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        showAd();
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        showInterstiatial = false;
        return super.onSaveInstanceState();
    }

    private void showAd(){
        return;
    }
}
