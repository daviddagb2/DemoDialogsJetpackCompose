package com.gonzalez.blanchard.demodialogos.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun BasicAlertDialog(
    title: String,
    content: String,
    showDialog: Boolean,
    onDismiss: ()-> Unit
){
    if(showDialog){
        AlertDialog(
            onDismissRequest = onDismiss,
            title = {
                Text(text = title)
            },
            text = {
                Text(text = content)
            },
            confirmButton = {
                Button(onClick = onDismiss) {
                    Text(text = "Aceptar")
                }
            }
        )
    }
}