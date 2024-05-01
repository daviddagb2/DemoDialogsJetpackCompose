package com.gonzalez.blanchard.demodialogos.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog

@Composable
fun CustomDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit
){
    if(showDialog){

        Dialog(onDismissRequest = onDismiss) {
            Box(
                modifier = Modifier
                    .background(Color.White)
                    .padding(16.dp)
                    .size(200.dp)
            ){
                Text(
                    text = "Contenido del custom Dialog",
                    textAlign = TextAlign.Center,
                    modifier = Modifier.align(Alignment.Center)
                )
            }

        }
    }
}