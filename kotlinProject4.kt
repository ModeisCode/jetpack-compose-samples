    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Jetpack_compose_project_1Theme {
                var name by remember {
                    mutableStateOf("")
                }
                var names by remember {
                    mutableStateOf(listOf<String>())
                }
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp)
                ) {
                    Row(
                        modifier =  Modifier.fillMaxWidth()
                    ) {
                        OutlinedTextField(
                            value = name, onValueChange = {
                                text ->
                                name = text
                            })
                        Button(
                            onClick = {
                                if (name.isNotBlank()) {
                                    names = names + name
                                }
                            }
                        ) {
                            Text(text = "Add")
                        }
                    }

                    LazyColumn {
                        items (names) {
                            currentName ->
                            Text(text = currentName , fontSize = 32.sp)
                            HorizontalDivider()
                        }
                    }

                }
            }
        }
