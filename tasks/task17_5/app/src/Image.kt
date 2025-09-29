// Task 17.5

import com.example.imglib.Bitmap
import java.awt.Graphics2D
import java.awt.image.RescaleOp

class Image(val x: Int, val y: Int, filename: String) : Bitmap(filename), Drawable {
    override fun draw(context: Graphics2D) {
        val nullOp = RescaleOp(1.0f, 0.0f, null)
        context.drawImage(pixelData, nullOp, x, y)
    }
}
