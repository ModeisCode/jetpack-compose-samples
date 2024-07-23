class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Project1Theme {
                ButtonOpenYoutube()
            }
        }
    }

    @Preview(showBackground = true)
    @Composable
    private fun ButtonOpenYoutube() {
        Button( colors = ButtonColors(
            contentColor = Color.Red,
            containerColor = Color.Green,
            disabledContentColor = Color.White,
            disabledContainerColor = Color.Magenta
        ) , modifier = Modifier.size(90.dp , 35.dp) , onClick = {
            Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_EMAIL , arrayOf("test@test.com"))
                putExtra(Intent.EXTRA_SUBJECT, arrayOf("Subject"))
                putExtra(Intent.EXTRA_TEXT , arrayOf("text"))
            }
        }) {
            Text(text = "Open Youtube",
                fontSize = 6.sp,
                textAlign = TextAlign.Center,
                color = Color.Black,
                textDecoration = TextDecoration.Underline
            )
        }
    }

}
