package darkwolf.android.smartcity.resource


class Resource {
    private var type: ResourcesType?
    private var nb: Int
    private var nbMax: Int

    constructor() {
        type = null
        nb = 0
        nbMax = 0
    }

    constructor(type: ResourcesType?) {
        this.type = type
        nb = 0
        nbMax = 0
    }

    fun getType(): ResourcesType? {
        return type
    }

    override fun toString(): String {
        return "type : $type ,nb : $nb ,nb max :$nbMax"
    }
}

