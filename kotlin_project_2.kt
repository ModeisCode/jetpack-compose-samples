class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            mainLayout()
        }
    }
}

@Composable
private fun ButtonComponent() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {}) {
            Text(text = "click me")
        }

        Button(onClick = {} , colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)) {
            Text(text = "login")
        }

        Button(onClick = {}) {
            Text(text = "multiple" , color = Color.Red)
            Text(text = "color" , color = Color.Green)
        }

        Button(onClick = {}) {
            Image(painter = painterResource(id = R.drawable.star_on) , contentDescription = null)
            Text(text = "Btn with Icon" , color = Color.Green)
        }

        Button(onClick = {} , shape = RoundedCornerShape(12.dp) , border = BorderStroke(1.dp , color = Color.Blue)
        ,colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Cyan)) {
            Text(text = "let's go!" , color = Color.Red)
        }
    }
}
@Preview(showBackground = true , device = "id:pixel_5", showSystemUi = true , name = "First View")
@Composable
private fun mainLayout() {
    ButtonComponent()
}

@Composable
private fun boxComponent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    ) {
        Box(modifier = Modifier
            .size(100.dp, 100.dp)
            .background(
                Color.Blue
            )) {

        }

        Box(
            modifier = Modifier
                .size(200.dp, 200.dp)
                .background(
                    Color.Cyan
                )
                .align(Alignment.Center)
        ) {

        }

        Box(
            modifier = Modifier
                .size(200.dp, 200.dp)
                .background(
                    Color.Green
                )
                .align(Alignment.BottomEnd)
        ) {

        }
    }
}
