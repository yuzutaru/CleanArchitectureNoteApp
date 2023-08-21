package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.MaterialTheme
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by Yustar Pramudana on 21/08/23.
 */

@Composable
fun DefaultRadioButton(text: String, selected: Boolean, onSelect: () -> Unit,
                       modifier: Modifier = Modifier) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        RadioButton(selected = selected, onClick = onSelect,
            colors = RadioButtonDefaults.colors(
                selectedColor = MaterialTheme.colors.primary,
                unselectedColor = MaterialTheme.colors.onBackground
            ))

        Spacer(modifier = Modifier.width(8.dp))

        Text(text = text, style = MaterialTheme.typography.body1)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDefaultRadioButton() {
    DefaultRadioButton(text = "test", selected = false, onSelect = { /*TODO*/ })
}