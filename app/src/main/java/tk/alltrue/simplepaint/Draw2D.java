package tk.alltrue.simplepaint;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class Draw2D extends View {
    private Paint mPaint = new Paint();

    public Draw2D(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        mPaint.setStyle(Paint.Style.FILL);

        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        //circle
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(950, 30, 25, mPaint);
    }
}
