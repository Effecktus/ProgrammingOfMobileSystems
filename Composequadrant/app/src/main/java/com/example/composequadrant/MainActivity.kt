package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShowQuadrant(
                        title0_0 = stringResource(R.string.title0_0),
                        title0_1 = stringResource(R.string.title0_1),
                        title1_0 = stringResource(R.string.title1_0),
                        title1_1 = stringResource(R.string.title1_1),
                        content0_0 = stringResource(R.string.content0_0),
                        content0_1 = stringResource(R.string.content0_1),
                        content1_0 = stringResource(R.string.content1_0),
                        content1_1 = stringResource(R.string.content1_1)
                    )
                }
            }
        }
    }
}

@Composable
fun ShowQuadrant(
    title0_0: String,
    title0_1: String,
    title1_0: String,
    title1_1: String,
    content0_0: String,
    content0_1: String,
    content1_0: String,
    content1_1: String,
) {
    Column (modifier = Modifier.fillMaxWidth()) {
        Row (modifier = Modifier.weight(1f)) {
            GetQuadrantContent(
                title = title0_0,
                content = content0_0,
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f)
            )
            GetQuadrantContent(
                title = title0_1,
                content = content0_1,
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f)
            )
        }
        Row (modifier = Modifier.weight(1f)) {
            GetQuadrantContent(
                title = title1_0,
                content = content1_0,
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f)
            )
            GetQuadrantContent(
                title = title1_1,
                content = content1_1,
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun GetQuadrantContent(
    title: String,
    content: String,
    backgroundColor: Color,
    modifier: Modifier
) {
    Column(
        modifier = modifier
            .background(backgroundColor)
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(
            text = content,
            textAlign = TextAlign.Justify,
            modifier = Modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShowQuadrant(
        title0_0 = stringResource(R.string.title0_0),
        title0_1 = stringResource(R.string.title0_1),
        title1_0 = stringResource(R.string.title1_0),
        title1_1 = stringResource(R.string.title1_1),
        content0_0 = stringResource(R.string.content0_0),
        content0_1 = stringResource(R.string.content0_1),
        content1_0 = stringResource(R.string.content1_0),
        content1_1 = stringResource(R.string.content1_1)
    )
}