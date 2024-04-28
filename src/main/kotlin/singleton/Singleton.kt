package singleton

fun main(args: Array<String>) {
    val settingsV1A = SettingsV1.getInstance()
    val settingsV1B = SettingsV1.getInstance()

    println(settingsV1A != settingsV1B)
}

class SettingsV1 private constructor() {
    companion object {
        private var instnace: SettingsV1? = null

        fun getInstance(): SettingsV1 {
            if (instnace == null) {
                instnace = SettingsV1()
            }

            return SettingsV1()
        }
    }
}
