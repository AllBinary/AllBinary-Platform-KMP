/* Generated Code Do Not Modify */
package org.allbinary.graphics.form

import javax.microedition.lcdui.Font
import javax.microedition.lcdui.Graphics
import kotlin.Array
import org.allbinary.J2MEUtil
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.form.item.ABCustomItem
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker

open public class MultipleScrollSelectionHorizontalForm :
    ScrollSelectionForm, UpdateMyFontInterface {

    companion object {

        @Throws(Exception::class)
        open fun createForm(
            title: String,
            items: Array<ABCustomItem?>,
            rectangle: Rectangle,
            formType: FormType,
            border: Int,
            backgroundBasicColor: BasicColor,
            foregroundBasicColor: BasicColor,
        )
            // nullable = true from not(false or (false and false)) = true
            : ScrollSelectionForm {
            // var title = title
            // var items = items
            // var rectangle = rectangle
            // var formType = formType
            // var border = border
            // var backgroundBasicColor = backgroundBasicColor
            // var foregroundBasicColor = foregroundBasicColor

            var scrollSelectionForm: ScrollSelectionForm =
                MultipleScrollSelectionHorizontalForm(
                    title,
                    items,
                    ItemPaintableFactory.getInstance(),
                    border,
                    backgroundBasicColor,
                    foregroundBasicColor,
                )

            scrollSelectionForm!!.init(rectangle, formType)

            // if statement needs to be on the same line and ternary does not work the same way.
            return scrollSelectionForm
        }
    }

    open public inner class MultipleScrollSelectionFormHorizontalPaintable : ItemIndexPaintable {

        /*Static stuff is not allowed for Kotlin inner classescompanion object {
         */
        /*
        }
            */

        private val multipleScrollSelectionForm: MultipleScrollSelectionHorizontalForm

        constructor(multipleScrollSelectionForm: MultipleScrollSelectionHorizontalForm) {
            // var multipleScrollSelectionForm = multipleScrollSelectionForm
            this.multipleScrollSelectionForm = multipleScrollSelectionForm
        }

        @Throws(Exception::class)
        override fun paint(
            graphics: Graphics,
            index: Int,
            item: ABCustomItem,
            dx: Int,
            dy: Int,
        )
            // nullable = true from not(false or (false and false)) = true
            : Int {
            // var graphics = graphics
            // var index = index
            // var item = item
            var dx = dx
            // var dy = dy

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.multipleScrollSelectionForm!!.paintHorizontal(graphics, index, item, dx, dy)
        }
    }

    open public inner class MultipleScrollSelectionFormVerticalPaintable : ItemIndexPaintable {

        /*Static stuff is not allowed for Kotlin inner classescompanion object {
         */
        /*
        }
            */

        private val multipleScrollSelectionForm: MultipleScrollSelectionHorizontalForm

        constructor(multipleScrollSelectionForm: MultipleScrollSelectionHorizontalForm) {
            // var multipleScrollSelectionForm = multipleScrollSelectionForm
            this.multipleScrollSelectionForm = multipleScrollSelectionForm
        }

        @Throws(Exception::class)
        override fun paint(
            graphics: Graphics,
            index: Int,
            item: ABCustomItem,
            dx: Int,
            dy: Int,
        )
            // nullable = true from not(false or (false and false)) = true
            : Int {
            // var graphics = graphics
            // var index = index
            // var item = item
            var dx = dx
            // var dy = dy

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.multipleScrollSelectionForm!!.paintVertical(graphics, index, item, dx, dy)
        }
    }

    private var multipleScrollSelectionHorizontalFormTypeItemIndexPaintable: ItemIndexPaintable =
        ItemIndexPaintable.getInstance()!!

    private val backgroundColor: Int = BasicColorFactory.getInstance()!!.TRANSPARENT_GREY.toInt()!!

    private var myFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    private var logged: Boolean = false

    private var fontHeight: Int = 0

    public constructor(
        title: String,
        items: Array<ABCustomItem?>,
        formPaintableFactory: ItemPaintableFactory,
        border: Int,
        backgroundBasicColor: BasicColor,
        foregroundBasicColor: BasicColor,
    ) : super(
        title,
        items,
        formPaintableFactory,
        border,
        3,
        backgroundBasicColor,
        foregroundBasicColor,
    ) {
        // var title = title
        // var items = items
        // var formPaintableFactory = formPaintableFactory
        // var border = border
        // var backgroundBasicColor = backgroundBasicColor
        // var foregroundBasicColor = foregroundBasicColor

        // For kotlin this is before the body of the constructor.

    }

    @Throws(Exception::class)
    override fun init(rectangle: Rectangle, formType: FormType)
        // nullable = true from not(false or (false and false)) = true
    {
        // var rectangle = rectangle
        // var formType = formType
        super.init(rectangle, formType)

        var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!

        if (formType == formTypeFactory!!.HORIZONTAL_FORM) {

            this.multipleScrollSelectionHorizontalFormTypeItemIndexPaintable =
                MultipleScrollSelectionFormHorizontalPaintable(this)
        } else if (formType == formTypeFactory!!.VERTICAL_CENTER_FORM) {

            this.multipleScrollSelectionHorizontalFormTypeItemIndexPaintable =
                MultipleScrollSelectionFormVerticalPaintable(this)
        } else if (formType == formTypeFactory!!.NULL_FORM_TYPE) {} else {

            throw Exception(formTypeFactory!!.UNK)
        }
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        var font: Font = graphics.getFont()!!

        this.fontHeight = font.getHeight()
        this.myFontProcessor = MyFontProcessor.getInstance()
    }

    @Throws(Exception::class)
    open fun paintHorizontal(
        graphics: Graphics,
        index: Int,
        item: ABCustomItem,
        dx: Int,
        dy: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var graphics = graphics
        // var index = index
        // var item = item
        var dx = dx
        // var dy = dy

        var dx2: Int = this.paintItem(graphics, index, item, dx, dy) + this.border

        this.paintable.paint(graphics, index, dx, dy)
        dx = dx2

        // if statement needs to be on the same line and ternary does not work the same way.
        return dx
    }

    @Throws(Exception::class)
    open fun paintVertical(
        graphics: Graphics,
        index: Int,
        item: ABCustomItem,
        dx: Int,
        dy: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var graphics = graphics
        // var index = index
        // var item = item
        // var dx = dx
        // var dy = dy
        this.paintItem(graphics, index, item, dx, dy)
        this.paintable.paint(graphics, index, dx, dy)

        // if statement needs to be on the same line and ternary does not work the same way.
        return dx
    }

    override fun getStartIndex()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.getSelectedIndex()
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        try {
            this.myFontProcessor!!.process(graphics)

            var start: Int = this.getStartIndex()!!

            var size: Int = this.size()!!

            var dx: Int = this.x

            var dy: Int = this.y

            if (J2MEUtil.isJ2ME()) {} else {

                graphics.setColor(this.backgroundColor)
                graphics.fillRect(
                    this.x,
                    this.y,
                    this.rectangle.getWidth(),
                    this.rectangle.getHeight(),
                )
            }

            graphics.drawString(this.getTitle(), this.x, this.y - this.fontHeight, 0)

            var item: ABCustomItem

            for (index in start until size) {

                item = this.get(index)

                if (dx >= this.rectangle.getMaxX()) {

                    if (this.logged) {} else {

                        this.logged = true
                        PreLogUtil.put(
                            StringMaker()
                                .append("painting beyond maxx: ")!!
                                .appendint(this.rectangle.getMaxX())!!
                                .toString(),
                            this,
                            this.canvasStrings!!.PAINT,
                        )
                    }
                }

                dx =
                    this.multipleScrollSelectionHorizontalFormTypeItemIndexPaintable!!.paint(
                        graphics,
                        index,
                        item,
                        dx,
                        dy,
                    )
            }
        } catch (e: Exception) {
            PreLogUtil.put(this.commonStrings!!.EXCEPTION, this, this.canvasStrings!!.PAINT)
        }
    }
}
