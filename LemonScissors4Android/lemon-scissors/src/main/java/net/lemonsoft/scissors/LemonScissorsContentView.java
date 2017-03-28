package net.lemonsoft.scissors;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by lemonsoft on 17/3/28.
 */

public class LemonScissorsContentView extends ImageView {

    public LemonScissorsContentView(Context context) {
        super(context);
    }

    public LemonScissorsContentView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public LemonScissorsContentView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public LemonScissorsContentView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

    }
}
