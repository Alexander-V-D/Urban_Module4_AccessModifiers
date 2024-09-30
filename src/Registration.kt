class Registration(private var email: String, password: String) {
    private var password = ""

    init {
        setPassword(password)
    }

    fun getEmail(): String = email.uppercase()

    fun setPassword(password: String) {
        if (password.length < 6) {
            println("Пароль должен содержать не менее 6 символов")
        } else this.password = password
    }
}