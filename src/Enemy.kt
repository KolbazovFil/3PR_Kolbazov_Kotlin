class Enemy(val name: String, var health: Int) {
    // Метод атаки
    fun attack(player: Player): String {
        val damage = 15
        player.health -= damage
        return "Враг $name атакует ${player.name}, нанесено $damage единиц урона"
    }
    fun isAlive(): Boolean {
        return health > 0
    }
}