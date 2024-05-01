package com.gonzalez.blanchard.demodialogos.components

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


@Composable
fun ConfirmDialog(
    showDialog: Boolean,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
){
    if(showDialog){
        AlertDialog(
            onDismissRequest = onDismiss, 
            confirmButton = {
                Button(
                    onClick = { 
                        onConfirm()
                        onDismiss()
                    }
                ) {
                    Text(text = "Confirmar")
                }
            },
            title = {
                Text(text = "Confirmación")
            },
            text = {
                Text(text = "¿Estas seguro de que deseas continuar?")
            },
            dismissButton = {
                Button(onClick = onDismiss) {
                    Text(text = "Cancelar")
                }
            }
        )
        
    }
}