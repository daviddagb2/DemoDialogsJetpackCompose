package com.gonzalez.blanchard.demodialogos.views

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.gonzalez.blanchard.demodialogos.components.BasicAlertDialog
import com.gonzalez.blanchard.demodialogos.components.ConfirmDialog
import com.gonzalez.blanchard.demodialogos.components.CustomDialog

@Composable
fun MainScreen(){
    val context = LocalContext.current

    var showDialog by remember {
        mutableStateOf(false)
    }

    var showCustomDialog by remember {
        mutableStateOf(false)
    }

    var showConfirm by remember {
        mutableStateOf(false)
    }


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = { showDialog = true }) {
            Text(text = "Mostrar Alert Dialog")
        }

        Button(onClick = { showCustomDialog = true }) {
            Text(text = "Mostrar Custom Dialog")
        }


        Button(onClick = { showConfirm = true }) {
            Text(text = "Mostrar Confirm Dialog")
        }

        BasicAlertDialog(
            title = "Dialogo de Alerta",
            content = "Esto es un mensaje de prueba del dialogo",
            showDialog = showDialog,
            onDismiss = {
                showDialog = false
            }
        )

        CustomDialog(
            showDialog = showCustomDialog,
            onDismiss = {
                showCustomDialog = false
            }
        )


        ConfirmDialog(
            showDialog = showConfirm,
            onDismiss = {
                showConfirm = false
            },
            onConfirm = {
                Toast.makeText(context, "Ha confirmado la acción", Toast.LENGTH_SHORT).show()
            }
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen(){
    MainScreen()
}