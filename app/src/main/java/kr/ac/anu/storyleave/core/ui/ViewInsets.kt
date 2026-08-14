package kr.ac.anu.storyleave.core.ui

import android.view.View
import androidx.core.graphics.Insets
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

fun View.applySystemBarPadding(
    top: Boolean = true,
    bottom: Boolean = true,
) {
    val initialLeft = paddingLeft
    val initialTop = paddingTop
    val initialRight = paddingRight
    val initialBottom = paddingBottom

    ViewCompat.setOnApplyWindowInsetsListener(this) { view, windowInsets ->
        val insets: Insets = windowInsets.getInsets(WindowInsetsCompat.Type.systemBars())
        view.setPadding(
            initialLeft + insets.left,
            initialTop + if (top) insets.top else 0,
            initialRight + insets.right,
            initialBottom + if (bottom) insets.bottom else 0,
        )
        windowInsets
    }
    ViewCompat.requestApplyInsets(this)
}
