class BaseElement(posX: Int, posY: Int, posZ: Int) {


    var posX: Int
    var posY: Int
    var posZ: Int

    init {
        this.posX = posX
        this.posY = posY
        this.posZ = posZ
    }

    constructor(posX: Int, posY: Int): this(posX, posY, 0)
}