package club.sk1er.vigilance.example

import club.sk1er.vigilance.Vigilant
import club.sk1er.vigilance.data.Property
import club.sk1er.vigilance.data.PropertyType
import java.io.File

object ExampleConfig : Vigilant(File("./config/example.toml")) {
    @Property(
        type = PropertyType.SWITCH,
        name = "General 1",
        description = "This toggles something",
        category = "General",
        subcategory = "General Settings"
    )
    var toggle1 = true

    @Property(
        type = PropertyType.SWITCH,
        name = "General 2",
        description = "This toggles something",
        category = "General",
        subcategory = "General Settings"
    )
    var toggle2 = true

    @Property(
        type = PropertyType.SWITCH,
        name = "General 3",
        description = "This toggles something",
        category = "General",
        subcategory = "General Settings"
    )
    var toggle3 = true

    @Property(
        type = PropertyType.SWITCH,
        name = "General 4",
        description = "This toggles something",
        category = "General",
        subcategory = "General Settings"
    )
    var toggle4 = false

    @Property(
        type = PropertyType.SWITCH,
        name = "General 5",
        description = "This toggles something",
        category = "General",
        subcategory = "Category"
    )
    var toggle5 = true

    @Property(
        type = PropertyType.SWITCH,
        name = "General 6",
        description = "This toggles something",
        category = "General",
        subcategory = "Category"
    )
    var toggle6 = true

    @Property(
        type = PropertyType.SWITCH,
        name = "General 7",
        description = "This toggles something",
        category = "General",
        subcategory = "Category"
    )
    var toggle7 = false

    @Property(
        type = PropertyType.SWITCH,
        name = "General 8",
        description = "This toggles something",
        category = "General",
        subcategory = "Category"
    )
    var toggle8 = true
}