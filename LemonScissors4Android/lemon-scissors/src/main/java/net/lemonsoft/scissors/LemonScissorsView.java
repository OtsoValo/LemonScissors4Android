package net.lemonsoft.scissors;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by lemonsoft on 17/3/28.
 */

public class LemonScissorsView extends RelativeLayout {

    private LemonScissorsContentView contentView;

    public LemonScissorsView(Context context) {
        super(context);
        _initContentView();
    }

    public LemonScissorsView(Context context, AttributeSet attrs) {
        super(context, attrs);
        _initContentView();
    }

    public LemonScissorsView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        _initContentView();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public LemonScissorsView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        _initContentView();
    }

    private void _initContentView() {
        contentView = new LemonScissorsContentView(getContext());
        contentView.setLayoutParams(new LayoutParams(400, 400));
        contentView.setX(80);
        contentView.setY(200);
    }

}
