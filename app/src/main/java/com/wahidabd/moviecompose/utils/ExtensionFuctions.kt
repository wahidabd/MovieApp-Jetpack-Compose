package com.wahidabd.moviecompose.utils

import android.animation.ValueAnimator
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.bumptech.glide.request.RequestOptions

fun Fragment.quickShowToast(message: String) =
    Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()

fun ImageView.load(url: String?){
    url?.let {
        if(it.trim().isNotEmpty()){
            Glide.with(this).load(it).into(this)
        }
    }
}

fun ImageView.loadCircular(url: String?){
    url?.let {
        if(it.trim().isNotEmpty()){
            Glide.with(this)
                .load(it)
                .apply(RequestOptions().transform(CircleCrop()))
                .into(this)
        }
    }
}

fun Modifier.matchParent() =
    this.fillMaxHeight().fillMaxWidth()

val String.color
get() = Color(android.graphics.Color.parseColor(this))

fun View.visible() = visibility == View.VISIBLE
fun View.invisible() = visibility == View.INVISIBLE
fun View.gone() = visibility == View.GONE

fun ValueAnimator.intValue() =
    animatedValue as Int