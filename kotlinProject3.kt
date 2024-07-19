class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            cardImageComponent()
        }
    }
    @Preview(showBackground = true , device = "id:pixel_5" , showSystemUi = true , name = "First View")
    @Composable
    private fun cardImageComponent() {

        Column () {
            Card(shape = RoundedCornerShape(size = 5.dp) , modifier = Modifier.padding(8.dp) ) {
                Row (modifier = Modifier.padding(all = 12.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center

                ) {
                    Image(painter = painterResource(id = R.drawable.star_on) , contentDescription = null
                        , modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(62.dp),
                        contentScale = ContentScale.Crop
                    )

                    Spacer(modifier = Modifier.width(8.dp))

                    Text(text = "ModeisCode" , fontSize = 15.sp , fontWeight = FontWeight.Medium)

                }
            }
            Card (shape = RoundedCornerShape(4.dp) , modifier = Modifier.padding(8.dp)) {
               Row(
                   verticalAlignment = Alignment.CenterVertically,
                   horizontalArrangement = Arrangement.Center,
                   modifier = Modifier.width(200.dp)
               ) {
                   Image(
                       painter = painterResource(id = R.drawable.btn_dialog),
                       contentDescription = null,
                       contentScale = ContentScale.Crop,
                       modifier = Modifier.size(56.dp)
                   )
                   Text(text = "heeey!!" , style = MaterialTheme.typography.headlineSmall , modifier = Modifier.padding(horizontal = 12.dp))
               }
            }
        }
    }
}

