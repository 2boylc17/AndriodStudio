package org.example.project

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.runtime.snapshots.SnapshotStateList
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview


import week8project.composeapp.generated.resources.Res
import week8project.composeapp.generated.resources.compose_multiplatform

@Composable
@Preview
fun App() {
    MaterialTheme {
        var studentlist = remember { mutableStateListOf<Student>() }
        var newID = remember { mutableStateOf("") }
        var newname = remember { mutableStateOf("") }
        var newCourse = remember { mutableStateOf("") }

        Column {
            OutlinedTextField(value=newID.value, singleLine = true, onValueChange = { newID.value=it })
            OutlinedTextField(value=newname.value, singleLine = true, onValueChange = { newname.value=it })
            OutlinedTextField(value=newCourse.value, singleLine = true, onValueChange = { newCourse.value=it })
            Button(onClick = {
                var newStudent = Student(newID.toString(), newname.toString(), newCourse.toString())
                studentlist.add(newStudent)
            }) { Text("Add") }
        }


    }
}
