package club.sk1er.vigilance.gui

import club.sk1er.elementa.components.UIBlock
import club.sk1er.elementa.components.UIText
import club.sk1er.elementa.constraints.CenterConstraint
import club.sk1er.elementa.constraints.FillConstraint
import club.sk1er.elementa.dsl.*
import java.awt.Color

class Divider(name: String) : Setting() {
    private val label = UIText(name).constrain {
        x = CenterConstraint()
    } childOf this

    private val leftLine = UIBlock(Color(151, 151, 151)).constrain {
        x = 0.pixels()
        y = CenterConstraint()
        width = basicWidthConstraint { label.getLeft() - getLeft() - 10f }
        height = 1.pixels()
    } childOf this

    private val rightLine = UIBlock(Color(151, 151, 151)).constrain {
        x = basicXConstraint { label.getRight() + 10f }
        y = CenterConstraint()
        width = FillConstraint()
        height = 1.pixels()
    } childOf this
}