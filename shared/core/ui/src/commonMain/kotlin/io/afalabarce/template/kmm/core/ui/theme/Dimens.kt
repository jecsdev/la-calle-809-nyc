package io.afalabarce.template.kmm.core.ui.theme

import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal val LocalDimension = staticCompositionLocalOf { mobileDimensions() }

@Suppress("LongParameterList")
class MobileDimens(
    val none: Dp,
    val topSurface: Dp,
    val startSurface: Dp,
    val endSurface: Dp,
    val bottomSurface: Dp,
    val minTopSurface: Dp,
    val minStartSurface: Dp,
    val minEndSurface: Dp,
    val minBottomSurface: Dp,
    val mediumMarginTopSurface: Dp,
    val mediumMarginStartSurface: Dp,
    val mediumMarginEndSurface: Dp,
    val mediumMarginBottomSurface: Dp,
    val largeTopSurface: Dp,
    val largeStartSurface: Dp,
    val largeEndSurface: Dp,
    val largeBottomSurface: Dp,
    val appMargin: Dp,
    val textFieldCorner: Dp,
    val smallIconSize: Dp,
    val buttonHeight: Dp,
    val dialogCorner: Dp,
    val focusedBorder: Dp,
    val cornerRadius: Dp,
) {
    @Suppress("LongParameterList")
    fun copy(
        none: Dp = this.none,
        topSurface: Dp = this.topSurface,
        startSurface: Dp = this.startSurface,
        endSurface: Dp = this.endSurface,
        bottomSurface: Dp = this.bottomSurface,
        appMargin: Dp = this.appMargin,
        minTopSurface: Dp = this.minTopSurface,
        minStartSurface: Dp = this.minStartSurface,
        minEndSurface: Dp = this.minEndSurface,
        minBottomSurface: Dp = this.minBottomSurface,
        mediumMarginTopSurface: Dp = this.mediumMarginTopSurface,
        mediumMarginStartSurface: Dp = this.mediumMarginStartSurface,
        mediumMarginEndSurface: Dp = this.mediumMarginEndSurface,
        mediumMarginBottomSurface: Dp = this.mediumMarginBottomSurface,
        largeTopSurface: Dp = this.largeTopSurface,
        largeStartSurface: Dp = this.largeStartSurface,
        largeEndSurface: Dp = this.largeEndSurface,
        largeBottomSurface: Dp = this.largeBottomSurface,
        textFieldCorner: Dp = this.textFieldCorner,
        smallIconSize: Dp = this.smallIconSize,
        buttonHeight: Dp = this.buttonHeight,
        dialogCorner: Dp = this.dialogCorner,
        focusedBorder: Dp = this.focusedBorder,
        cornerRadius: Dp = this.cornerRadius,
    ): MobileDimens = MobileDimens(
        none = none,
        topSurface = topSurface,
        startSurface = startSurface,
        endSurface = endSurface,
        bottomSurface = bottomSurface,
        minTopSurface = minTopSurface,
        minStartSurface = minStartSurface,
        minEndSurface = minEndSurface,
        minBottomSurface = minBottomSurface,
        largeTopSurface = largeTopSurface,
        largeStartSurface = largeStartSurface,
        largeEndSurface = largeEndSurface,
        largeBottomSurface = largeBottomSurface,
        appMargin = appMargin,
        textFieldCorner = textFieldCorner,
        smallIconSize = smallIconSize,
        buttonHeight = buttonHeight,
        mediumMarginTopSurface = mediumMarginTopSurface,
        mediumMarginStartSurface = mediumMarginStartSurface,
        mediumMarginEndSurface = mediumMarginEndSurface,
        mediumMarginBottomSurface = mediumMarginBottomSurface,
        dialogCorner = dialogCorner,
        focusedBorder = focusedBorder,
        cornerRadius = cornerRadius,
    )
}

@Suppress("LongParameterList")
fun mobileDimensions(
    none: Dp = 0.dp,
    topSurface: Dp = 16.dp,
    startSurface: Dp = 16.dp,
    endSurface: Dp = 16.dp,
    bottomSurface: Dp = 16.dp,
    minTopSurface: Dp = 8.dp,
    minStartSurface: Dp = 8.dp,
    minEndSurface: Dp = 8.dp,
    minBottomSurface: Dp = 8.dp,
    mediumMarginTopSurface: Dp = 32.dp,
    mediumMarginStartSurface: Dp = 32.dp,
    mediumMarginEndSurface: Dp = 32.dp,
    mediumMarginBottomSurface: Dp = 32.dp,
    largeTopSurface: Dp = 48.dp,
    largeStartSurface: Dp = 48.dp,
    largeEndSurface: Dp = 48.dp,
    largeBottomSurface: Dp = 48.dp,
    appMargin: Dp = 16.dp,
    textFieldCorner: Dp = 12.dp,
    smallIconSize: Dp = 32.dp,
    buttonHeight: Dp = 48.dp,
    dialogCorner: Dp = 14.dp,
    focusedBorder: Dp = 4.dp,
    cornerRadius: Dp = 6.dp,
): MobileDimens = MobileDimens(
    none = none,
    topSurface = topSurface,
    startSurface = startSurface,
    endSurface = endSurface,
    bottomSurface = bottomSurface,
    minTopSurface = minTopSurface,
    minStartSurface = minStartSurface,
    minEndSurface = minEndSurface,
    minBottomSurface = minBottomSurface,
    mediumMarginTopSurface = mediumMarginTopSurface,
    mediumMarginStartSurface = mediumMarginStartSurface,
    mediumMarginEndSurface = mediumMarginEndSurface,
    mediumMarginBottomSurface = mediumMarginBottomSurface,
    largeTopSurface = largeTopSurface,
    largeStartSurface = largeStartSurface,
    largeEndSurface = largeEndSurface,
    largeBottomSurface = largeBottomSurface,
    appMargin = appMargin,
    textFieldCorner = textFieldCorner,
    smallIconSize = smallIconSize,
    buttonHeight = buttonHeight,
    dialogCorner = dialogCorner,
    focusedBorder = focusedBorder,
    cornerRadius = cornerRadius,
)