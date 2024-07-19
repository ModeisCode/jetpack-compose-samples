class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            mainLayout()
        }
    }
}

@Preview(showBackground = true , device = "id:pixel_5")
@Composable
private fun mainLayout() {
    RowLayout()

    ColumnLayout()
}

@Composable
fun ColumnLayout() {
      Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        TextComponent(content = "My component title")
        TextComponent(content = "this is first component")
        TextComponent(content = "this is second component")
    }
}

@Composable
private fun RowLayout() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        TextComponent(content = "My component title")
        TextComponent(content = "this is first component")
        TextComponent(content = "this is second component")
    }
}

@Composable
private fun TextComponent(content : String) {
    Box(modifier = Modifier.fillMaxHeight()) {
        Text(text = content ,
            textDecoration = TextDecoration.Underline,
            fontSize = 16.sp,
            fontFamily = FontFamily.SansSerif,
        )
    }
}
