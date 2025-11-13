package com.example.newswiki.ui.news_screen

import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ShimmerEffect(modifier: Modifier = Modifier) {
    // Define the shimmer colors
    val shimmerColors = listOf(
        Color.Black.copy(alpha = 0.3f),
        Color.Black.copy(alpha = 0.1f),
        Color.Black.copy(alpha = 0.3f)
    )

    // Infinite transition to animate shimmer
    val transition = rememberInfiniteTransition(label = "")
    val translateAnim = transition.animateFloat(
        initialValue = 0f,
        targetValue = 1000f,
        animationSpec = infiniteRepeatable(
            animation = tween(durationMillis = 1200, easing = LinearEasing),
            repeatMode = RepeatMode.Restart
        ), label = ""
    )

    // Shimmer brush
    val brush = Brush.linearGradient(
        colors = shimmerColors,
        start = Offset(translateAnim.value, translateAnim.value),
        end = Offset(translateAnim.value + 200f, translateAnim.value + 200f)
    )

    // Apply the shimmer effect to the canvas
    Box(
        modifier = modifier
            .fillMaxWidth()
            .background(brush)
    ) {
        Canvas(modifier = Modifier.fillMaxSize()) {
            drawRect(brush = brush, size = Size(size.width, size.height))
        }
    }
}
