/*
 *
 *  AllBinary Open License Version 1
 *  Copyright (c) 2011 AllBinary
 *
 *  By agreeing to this license you and any business entity you represent are
 *  legally bound to the AllBinary Open License Version 1 legal agreement.
 *
 *  You may obtain the AllBinary Open License Version 1 legal agreement from
 *  AllBinary or the root directory of AllBinary's AllBinary Platform repository.
 *
 *  Created By: Travis Berthelot
 */

/* Generated Code Do Not Modify */
package org.allbinary.graphics.form

import javax.microedition.lcdui.Graphics
import kotlin.Array
import org.allbinary.canvas.Processor
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.font.MyFontProcessor
import org.allbinary.graphics.font.UpdateMyFontInterface
import org.allbinary.graphics.font.UpdateMyFontProcessor
import org.allbinary.graphics.form.item.ABCustomItem

open public class ScrollCurrentSelectionForm : ScrollSelectionForm, UpdateMyFontInterface {

    private val moveForSmallScreen: Boolean

    open public inner class TempHorizontalFormProcessor : Processor {

        private val scrollCurrentSelectionForm: ScrollCurrentSelectionForm

        constructor(scrollCurrentSelectionForm: ScrollCurrentSelectionForm) {
            // var scrollCurrentSelectionForm = scrollCurrentSelectionForm
            this.scrollCurrentSelectionForm = scrollCurrentSelectionForm
        }

        @Throws(Exception::class)
        override fun process()
            // nullable = true from not(false or (false and true)) = true
        {
            this.scrollCurrentSelectionForm!!.processTempHorizontalForm()
            this.scrollCurrentSelectionForm!!.processor = Processor.getInstance()
        }
    }

    open public inner class HorizontalFormProcessor : Processor {

        private val scrollCurrentSelectionForm: ScrollCurrentSelectionForm

        constructor(scrollCurrentSelectionForm: ScrollCurrentSelectionForm) {
            // var scrollCurrentSelectionForm = scrollCurrentSelectionForm
            this.scrollCurrentSelectionForm = scrollCurrentSelectionForm
        }

        @Throws(Exception::class)
        override fun process()
            // nullable = true from not(false or (false and true)) = true
        {
            this.scrollCurrentSelectionForm!!.processHorizontalForm()
            this.scrollCurrentSelectionForm!!.processor = Processor.getInstance()
        }
    }

    open public inner class VerticalFormProcessor : Processor {

        private val scrollCurrentSelectionForm: ScrollCurrentSelectionForm

        constructor(scrollCurrentSelectionForm: ScrollCurrentSelectionForm) {
            // var scrollCurrentSelectionForm = scrollCurrentSelectionForm
            this.scrollCurrentSelectionForm = scrollCurrentSelectionForm
        }

        @Throws(Exception::class)
        override fun process()
            // nullable = true from not(false or (false and true)) = true
        {
            this.scrollCurrentSelectionForm!!.processVerticalForm()
            this.scrollCurrentSelectionForm!!.processor = Processor.getInstance()
        }
    }

    open public inner class TempHorizontalItemIndexDx : ItemIndexDx {

        private val scrollCurrentSelectionForm: ScrollCurrentSelectionForm

        constructor(scrollCurrentSelectionForm: ScrollCurrentSelectionForm) {
            // var scrollCurrentSelectionForm = scrollCurrentSelectionForm
            this.scrollCurrentSelectionForm = scrollCurrentSelectionForm
        }

        @Throws(Exception::class)
        override fun getDx(
            index: Int,
            item: ABCustomItem,
            dx: Int,
            dy: Int,
        )
            // nullable = true from not(false or (false and false)) = true
            : Int {
            // var index = index
            // var item = item
            var dx = dx
            // var dy = dy

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.scrollCurrentSelectionForm!!.getXTempHorizontalForm(index, item, dx, dy)
        }
    }

    open public inner class HorizontalItemIndexDx : ItemIndexDx {

        private val scrollCurrentSelectionForm: ScrollCurrentSelectionForm

        constructor(scrollCurrentSelectionForm: ScrollCurrentSelectionForm) {
            // var scrollCurrentSelectionForm = scrollCurrentSelectionForm
            this.scrollCurrentSelectionForm = scrollCurrentSelectionForm
        }

        @Throws(Exception::class)
        override fun getDx(
            index: Int,
            item: ABCustomItem,
            dx: Int,
            dy: Int,
        )
            // nullable = true from not(false or (false and false)) = true
            : Int {
            // var index = index
            // var item = item
            var dx = dx
            // var dy = dy

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.scrollCurrentSelectionForm!!.getXHorizontalForm(index, item, dx, dy)
        }
    }

    open public inner class VerticalItemIndexDx : ItemIndexDx {

        private val scrollCurrentSelectionForm: ScrollCurrentSelectionForm

        constructor(scrollCurrentSelectionForm: ScrollCurrentSelectionForm) {
            // var scrollCurrentSelectionForm = scrollCurrentSelectionForm
            this.scrollCurrentSelectionForm = scrollCurrentSelectionForm
        }

        @Throws(Exception::class)
        override fun getDx(
            index: Int,
            item: ABCustomItem,
            dx: Int,
            dy: Int,
        )
            // nullable = true from not(false or (false and false)) = true
            : Int {
            // var index = index
            // var item = item
            var dx = dx
            // var dy = dy

            // if statement needs to be on the same line and ternary does not work the same way.
            return this.scrollCurrentSelectionForm!!.getXVerticalForm(index, item, dx, dy)
        }
    }

    val updateMyFontProcessor: MyFontProcessor = UpdateMyFontProcessor(this)

    var myFontProcessor: MyFontProcessor = this.updateMyFontProcessor

    private var processor: Processor = Processor.getInstance()!!

    private var preItemIndexDx: ItemIndexDx = ItemIndexDx.getInstance()!!

    private var dx: Int = 0

    private var dy: Int = 0

    private var maxWidth: Int = 0

    public constructor(
        title: String,
        items: Array<ABCustomItem?>,
        formPaintableFactory: ItemPaintableFactory,
        border: Int,
        adjustedExtraBorder: Int,
        moveForSmallScreen: Boolean,
        backgroundBasicColor: BasicColor,
        foregroundBasicColor: BasicColor,
    ) : super(
        title,
        items,
        formPaintableFactory,
        border,
        adjustedExtraBorder,
        backgroundBasicColor,
        foregroundBasicColor,
    ) {
        // var title = title
        // var items = items
        // var formPaintableFactory = formPaintableFactory
        // var border = border
        // var adjustedExtraBorder = adjustedExtraBorder
        // var moveForSmallScreen = moveForSmallScreen
        // var backgroundBasicColor = backgroundBasicColor
        // var foregroundBasicColor = foregroundBasicColor

        // For kotlin this is before the body of the constructor.

        this.moveForSmallScreen = moveForSmallScreen
    }

    @Throws(Exception::class)
    override fun init(rectangle: Rectangle, formType: FormType)
        // nullable = true from not(false or (false and false)) = true
    {
        // var rectangle = rectangle
        // var formType = formType
        super.init(rectangle, formType)

        var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!

        if (formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM) {

            this.processor = TempHorizontalFormProcessor(this)
            this.preItemIndexDx = TempHorizontalItemIndexDx(this)
        } else if (formType == formTypeFactory!!.HORIZONTAL_FORM) {

            this.processor = HorizontalFormProcessor(this)
            this.preItemIndexDx = HorizontalItemIndexDx(this)
        } else if (formType == formTypeFactory!!.VERTICAL_CENTER_FORM) {

            this.processor = VerticalFormProcessor(this)
            this.preItemIndexDx = VerticalItemIndexDx(this)
        } else if (formType == formTypeFactory!!.NULL_FORM_TYPE) {} else {

            this.logUtil!!.putF(formTypeFactory!!.UNK, this, this.commonStrings!!.INIT)
        }

        this.myFontProcessor = this.updateMyFontProcessor
    }

    override fun updateMeasurement(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics
        this.myFontProcessor = MyFontProcessor.getInstance()
    }

    open fun processTempHorizontalForm()
        // nullable = true from not(false or (false and true)) = true
    {
        this.dx = this.x - 30 + (this.rectangle.getWidth() shr 1)
        this.dy = this.y
    }

    open fun processHorizontalForm()
        // nullable = true from not(false or (false and true)) = true
    {

        var size: Int = this.size()!!

        var totalWidth: Int = 0

        var item: ABCustomItem

        for (index in 0 until size) {

            item = this.get(index)
            totalWidth += item.getMinimumWidth() + this.border
        }

        this.dx = this.x + (this.rectangle.getWidth() shr 1) - (totalWidth shr 1)
        this.dy = this.y + (this.rectangle.getHeight() shr 1)

        if (this.moveForSmallScreen) {

            var maxTitleHeight: Int = 175

            if (this.dy < maxTitleHeight) {

                this.dy = maxTitleHeight
            }
        }
    }

    open fun processVerticalForm()
        // nullable = true from not(false or (false and true)) = true
    {

        var totalHeight: Int = 0

        var size: Int = this.size()!!

        var item2: ABCustomItem

        for (index in 0 until size) {

            item2 = this.get(index)

            if (this.maxWidth < item2.getMinimumWidth()) {

                this.maxWidth = item2.getMinimumWidth()
            }

            totalHeight += item2.getMinimumHeight() + this.border
        }

        this.dx = ((this.rectangle.getWidth() - this.maxWidth) / 2)

        if (this.size() > 0) {

            this.dy = this.y + ((this.rectangle.getHeight() - totalHeight) / 2)

            if (this.moveForSmallScreen) {

                var maxTitleHeight: Int = 175

                if (this.dy < maxTitleHeight) {

                    this.dy = maxTitleHeight
                }
            }
        } else {
            this.dy = this.y
        }
    }

    open fun getXTempHorizontalForm(
        index: Int,
        item: ABCustomItem,
        dx: Int,
        dy: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var index = index
        // var item = item
        var dx = dx
        // var dy = dy

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.getDiffX(item)
    }

    open fun getXHorizontalForm(
        index: Int,
        item: ABCustomItem,
        dx: Int,
        dy: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var index = index
        // var item = item
        var dx = dx
        // var dy = dy

        // if statement needs to be on the same line and ternary does not work the same way.
        return 0
    }

    open fun getXVerticalForm(
        index: Int,
        item: ABCustomItem,
        dx: Int,
        dy: Int,
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        // var index = index
        // var item = item
        var dx = dx
        // var dy = dy

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.getDiffX(item) + this.halfBorder
    }

    override fun getDiffX(
        item: ABCustomItem
    )
        // nullable = true from not(false or (false and false)) = true
        : Int {
        var item = item

        // if statement needs to be on the same line and ternary does not work the same way.
        return ((this.maxWidth - item.getMinimumWidth()) shr 1)
    }

    override fun getDx()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.dx
    }

    override fun getDy()
    // nullable = true from not(false or (false and true)) = true
    : Int {

        // if statement needs to be on the same line and ternary does not work the same way.
        return this.dy
    }

    override fun paint(graphics: Graphics)
        // nullable = true from not(false or (false and false)) = true
    {
        // var graphics = graphics

        try {
            this.processor.process()

            var delta: Int = 0

            var deltaX: Int = this.getDx()!!

            var deltaY: Int = this.getDy()!!

            var size: Int = this.size()!!

            var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!

            var item: ABCustomItem

            for (index in 0 until size) {

                item = this.get(index)

                var diffX: Int = this.preItemIndexDx!!.getDx(index, item, this.dx, this.dy)!!

                if (index == this.getSelectedIndex()) {

                    delta = this.paintItem(graphics, index, item, deltaX + diffX, deltaY)
                    this.paintable.paint(graphics, index, deltaX + diffX, deltaY)
                } else {
                    delta = this.paintUnselectedItem(graphics, index, item, deltaX + diffX, deltaY)
                    this.paintable.paint(graphics, index, deltaX + diffX, deltaY)
                }

                if (this.formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM) {} else if (
                    this.formType == formTypeFactory!!.HORIZONTAL_FORM
                ) {
                    deltaX = delta
                } else if (this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM) {

                    deltaY = delta
                } else {

                    throw Exception(formTypeFactory!!.UNK)
                }
            }
        } catch (e: Exception) {
            this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, this.canvasStrings!!.PAINT, e)
        }
    }
}
