package darkwolf.android.smartcity.building

import darkwolf.android.smartcity.resource.ResourcesType


abstract class Building {
    /**
     * type de construction
     */
    private var bType: BuildingType?

    private var rType: ResourcesType?

    /**
     * nombre de personnne max de la construction
     */
    private var nbPersonnesMax: Int

    /**
     * nombre actuel de personnes dans la construction
     */
    private var nbPersonnes: Int

    /**
     * npm de la construction
     */
    private var name: String

    /**
     * constructeur par défaut
     */
    constructor() {
        bType = null
        rType = null
        nbPersonnesMax = -1
        nbPersonnes = -1
        name = "none"
    }

    /**
     * constructeur avec un type de constuction
     * @param type
     */
    constructor(bType: BuildingType, rType: ResourcesType?) {
        this.bType = bType
        this.rType = rType
        nbPersonnesMax = bType.nb_personne_max
        nbPersonnes = 0
        name = bType.nom
    }

    /**
     * Constructeur avec un type de construction et un nombre de personnes dans cette construction
     * @param bType
     * @param nbPersonnes
     */
    constructor(bType: BuildingType, rType: ResourcesType?, nbPersonnes: Int) {
        var nbPersonnes = nbPersonnes
        this.bType = bType
        this.rType = rType
        nbPersonnesMax = bType.nb_personne_max
        if (nbPersonnes >= nbPersonnesMax) nbPersonnes = nbPersonnesMax
        this.nbPersonnes = nbPersonnes
        name = bType.nom
    }

    fun getRType(): ResourcesType? {
        return rType
    }

    override fun toString(): String {
        return "($bType)-($rType)-($nbPersonnes)-($nbPersonnesMax)-($name)"
    }
}

