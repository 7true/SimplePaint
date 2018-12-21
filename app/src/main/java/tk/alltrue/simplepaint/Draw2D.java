package tk.alltrue.simplepaint;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

public class Draw2D extends View {
    private Paint mPaint = new Paint();
    private Rect mRect = new Rect();
    private Bitmap mBitmap;

    public Draw2D(Context context) {
        super(context);
        Resources res = this.getResources();
        mBitmap = BitmapFactory.decodeResource(res, R.drawable.pigsmall);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = canvas.getWidth();
        int height = canvas.getHeight();

        mPaint.setStyle(Paint.Style.FILL);

        mPaint.setColor(Color.WHITE);
        canvas.drawPaint(mPaint);

        //circle
        mPaint.setAntiAlias(true);
        mPaint.setColor(Color.YELLOW);
        canvas.drawCircle(width - 30, 30, 25, mPaint);

        //rect
        mPaint.setColor(Color.GREEN);
        canvas.drawRect(0, canvas.getHeight() - 30, width, height, mPaint);

        //text
        mPaint.setColor(Color.BLUE);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setAntiAlias(true);
        mPaint.setTextSize(32);
        canvas.drawText("Green field", 30, height - 32, mPaint);

        // angle text
        // int x = 810;
        int x = width - 175;
        int y = 195;

        mPaint.setColor(Color.GRAY);
        mPaint.setTextSize(27);
        String beam = "Light of the sun!";

        canvas.save();
        canvas.rotate(-45, x + mRect.exactCenterX(), y + mRect.exactCenterY());

        // Рисуем текст
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawText(beam, x, y, mPaint);

        canvas.restore();

        canvas.drawBitmap(mBitmap, width - mBitmap.getWidth(), height - mBitmap.getHeight() - 10, mPaint);
    }
}
