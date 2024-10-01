class Player(val name: String, var health: Int = 100) {
    private var weapon: Weapon? = null
    fun equipWeapon(weapon: Weapon) {
        this.weapon = weapon
        println("Игрок $name экипировал ${weapon.type} ${weapon.name}")
    }
    fun attack(enemy: Enemy): String {
        val damage = weapon?.damage?: 5 // Если оружие не экипировано, базовый урон 5
        enemy.health -= damage
        return "Игрок $name атакует врага ${enemy.name}, нанесено $damage единиц урона"
    }
    fun isAlive(): Boolean {
        return health > 0
    }
}