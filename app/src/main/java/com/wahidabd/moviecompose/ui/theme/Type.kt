package com.wahidabd.moviecompose.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.sp
import com.wahidabd.moviecompose.R

// Set of Material typography styles to start with
//private val plasmaFontFamily = FontFamily(
//    fonts = listOf(
//        ResourceFont(
//            resId = R.font.ps_thin,
//            weight = FontWeight.W200,
//            style = FontStyle.Normal
//        ),
//        ResourceFont(
//            resId = R.font.ps_thin_italic,
//            weight = FontWeight.W200,
//            style = FontStyle.Italic
//        ),
//        ResourceFont(
//            resId = R.font.ps_regular,
//            weight = FontWeight.W400,
//            style = FontStyle.Normal
//        ),
//        ResourceFont(
//            resId = R.font.ps_regular_italic,
//            weight = FontWeight.W400,
//            style = FontStyle.Italic
//        ),
//        ResourceFont(
//            resId = R.font.ps_semi_bold,
//            weight = FontWeight.W500,
//            style = FontStyle.Normal
//        ),
//        ResourceFont(
//            resId = R.font.ps_semi_bold_italic,
//            weight = FontWeight.W500,
//            style = FontStyle.Italic
//        ),
//        ResourceFont(
//            resId = R.font.ps_bold,
//            weight = FontWeight.W600,
//            style = FontStyle.Normal
//        ),
//        ResourceFont(
//            resId = R.font.ps_bold_italic,
//            weight = FontWeight.W600,
//            style = FontStyle.Italic
//        ),
//        ResourceFont(
//            resId = R.font.ps_extra_bold,
//            weight = FontWeight.W700,
//            style = FontStyle.Normal
//        ),
//        ResourceFont(
//            resId = R.font.ps_extra_bold_italic,
//            weight = FontWeight.W700,
//            style = FontStyle.Italic
//        )
//    )
//)

//val titleFontFamily = FontFamily(listOf(ResourceFont(resId = R.font.title)))
val titleTextStyle = TextStyle(fontFamily = FontFamily.SansSerif, fontSize = 50.sp)

// Set of Material typography styles to start with
val typography = Typography(
    h2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W600,
        fontSize = 30.sp
    ),
    h3 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 28.sp
    ),
    h4 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    h5 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W600,
        fontSize = 20.sp
    ),
    h6 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 16.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W400,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W400,
        fontSize = 14.sp
    ),
    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    overline = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    )
)