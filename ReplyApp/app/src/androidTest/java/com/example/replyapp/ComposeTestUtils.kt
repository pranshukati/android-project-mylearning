package com.example.replyapp

import androidx.activity.ComponentActivity
import androidx.annotation.StringRes
import androidx.compose.ui.test.SemanticsNodeInteraction
import androidx.compose.ui.test.junit4.AndroidComposeTestRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.onNodeWithTag
import androidx.test.ext.junit.rules.ActivityScenarioRule

fun AndroidComposeTestRule<ActivityScenarioRule<ComponentActivity>, ComponentActivity>
        .onNodeWithTagForStringId(
    @StringRes stringId: Int
): SemanticsNodeInteraction {
    return onNodeWithTag(
        activity.getString(stringId)
    )
}
fun AndroidComposeTestRule<ActivityScenarioRule<ComponentActivity>, ComponentActivity>
        .onNodeWithContentDescriptionForStringId(
    @StringRes stringId: Int
): SemanticsNodeInteraction {
    return onNodeWithContentDescription(
        activity.getString(stringId)
    )
}
