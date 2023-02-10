package com.example.affirmations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * [Affirmation] é a classe de dados para representar o texto de Afirmação e imageResourceId
 */
data class Affirmation(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)
// data class para informar que Affirmation é uma classe de dados