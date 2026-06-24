
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




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.microedition.lcdui.Canvas
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.GPoint
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.RectangleFactory
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.form.item.ABCustomItem
import org.allbinary.logic.NullUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.RectangleCollisionUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps

open public class ScrollSelectionForm : PaintableForm {
        
companion object {
            
    open fun createForm(title: String, items: Array<ABCustomItem?>, formPaintableFactory: ItemPaintableFactory, rectangle: Rectangle, formType: FormType, border: Int, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
: ScrollSelectionForm{
    //var title = title
    //var items = items
    //var formPaintableFactory = formPaintableFactory
    //var rectangle = rectangle
    //var formType = formType
    //var border = border
    //var backgroundBasicColor = backgroundBasicColor
    //var foregroundBasicColor = foregroundBasicColor

        try {
            
    
                        if(formPaintableFactory == ItemPaintableFactory.getInstance())
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ScrollSelectionForm(title, items, formPaintableFactory, rectangle, formType, border, backgroundBasicColor, foregroundBasicColor)

                                    }
                                
                        else {
                            


                            throw RuntimeException()

                        }
                            
} catch(e: Exception)
            {



                            throw RuntimeException()
}

}


    private var NULL_SCROLL_SELECTION_FORM: Any = NullUtil.getInstance()!!.NULL_OBJECT

    open fun getNullScrollSelectionForm()
        //nullable = true from not(false or (false and true)) = true
: ScrollSelectionForm{

    
                        if(ScrollSelectionForm.NULL_SCROLL_SELECTION_FORM == NullUtil.getInstance()!!.NULL_OBJECT)
                        
                                    {
                                    ScrollSelectionForm.NULL_SCROLL_SELECTION_FORM= ScrollSelectionForm.createForm(StringUtil.getInstance()!!.EMPTY_STRING, arrayOfNulls(0), ItemPaintableFactory.getInstance(), RectangleFactory.SINGLETON, FormTypeFactory.getInstance()!!.NULL_FORM_TYPE, 0, BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ScrollSelectionForm.NULL_SCROLL_SELECTION_FORM as ScrollSelectionForm
}


    private var NULL_SCROLL_SELECTION_HORIZONTAL_FORM: Any = NullUtil.getInstance()!!.NULL_OBJECT

    open fun getNullScrollSelectionFormHorizontal()
        //nullable = true from not(false or (false and true)) = true
: ScrollSelectionForm{

    
                        if(ScrollSelectionForm.NULL_SCROLL_SELECTION_HORIZONTAL_FORM == NullUtil.getInstance()!!.NULL_OBJECT)
                        
                                    {
                                    ScrollSelectionForm.NULL_SCROLL_SELECTION_HORIZONTAL_FORM= ScrollSelectionForm.createForm(StringUtil.getInstance()!!.EMPTY_STRING, arrayOfNulls(0), ItemPaintableFactory.getInstance(), RectangleFactory.SINGLETON, FormTypeFactory.getInstance()!!.HORIZONTAL_FORM, 0, BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ScrollSelectionForm.NULL_SCROLL_SELECTION_HORIZONTAL_FORM as ScrollSelectionForm
}


    private val INSIDE_FORM: String = " inside form"

    private val IS_IN_FORM: String = "isInForm"

    private val GET_SELECTED_INDEX: String = "getSelectedIndex"

        }
            
open public inner class ScrollSelectionFormHorizontalPaintable : ItemIndexPaintable {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


    private val scrollSelectionForm: ScrollSelectionForm
 constructor (scrollSelectionForm: ScrollSelectionForm){
    //var scrollSelectionForm = scrollSelectionForm
this.scrollSelectionForm= scrollSelectionForm
}


                @Throws(Exception::class)
            
    override fun paint(graphics: Graphics, index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var graphics = graphics
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scrollSelectionForm!!.paintItemHorizontal(graphics, index, item, dx, dy)
}


}
                
            
open public inner class ScrollSelectionFormVerticalPaintable : ItemIndexPaintable {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


    private val scrollSelectionForm: ScrollSelectionForm
 constructor (scrollSelectionForm: ScrollSelectionForm){
    //var scrollSelectionForm = scrollSelectionForm
this.scrollSelectionForm= scrollSelectionForm
}


                @Throws(Exception::class)
            
    override fun paint(graphics: Graphics, index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var graphics = graphics
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scrollSelectionForm!!.paintItemVertical(graphics, index, item, dx, dy)
}


}
                
            
open public inner class ScrollSelectionFormTempHorizontalPaintable : ItemIndexPaintable {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


    private val scrollSelectionForm: ScrollSelectionForm
 constructor (scrollSelectionForm: ScrollSelectionForm){
    //var scrollSelectionForm = scrollSelectionForm
this.scrollSelectionForm= scrollSelectionForm
}


                @Throws(Exception::class)
            
    override fun paint(graphics: Graphics, index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var graphics = graphics
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scrollSelectionForm!!.paintItemTempHorizontal(graphics, index, item, dx, dy)
}


}
                
            
open public inner class ScrollSelectionFormHorizontalDx : ItemIndexDx {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


    private val scrollSelectionForm: ScrollSelectionForm
 constructor (multipleScrollSelectionForm: ScrollSelectionForm){
    //var multipleScrollSelectionForm = multipleScrollSelectionForm
this.scrollSelectionForm= multipleScrollSelectionForm
}


                @Throws(Exception::class)
            
    override fun getDx(index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scrollSelectionForm!!.getSelectedIndexForPointHorizontalDx(index, item, dx, dy)
}


}
                
            
open public inner class ScrollSelectionFormVericalDx : ItemIndexDx {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


    private val scrollSelectionForm: ScrollSelectionForm
 constructor (multipleScrollSelectionForm: ScrollSelectionForm){
    //var multipleScrollSelectionForm = multipleScrollSelectionForm
this.scrollSelectionForm= multipleScrollSelectionForm
}


                @Throws(Exception::class)
            
    override fun getDx(index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scrollSelectionForm!!.getSelectedIndexForPointVerticalDx(index, item, dx, dy)
}


}
                
            
open public inner class ScrollSelectionFormTempHorizontalDx : ItemIndexDx {
        
/*Static stuff is not allowed for Kotlin inner classescompanion object {
            *//*
        }
            */


    private val scrollSelectionForm: ScrollSelectionForm
 constructor (multipleScrollSelectionForm: ScrollSelectionForm){
    //var multipleScrollSelectionForm = multipleScrollSelectionForm
this.scrollSelectionForm= multipleScrollSelectionForm
}


                @Throws(Exception::class)
            
    override fun getDx(index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scrollSelectionForm!!.getSelectedIndexForPointTempHorizontalDx(index, item, dx, dy)
}


}
                
            
    private val rectangleCollisionUtil: RectangleCollisionUtil = RectangleCollisionUtil.getInstance()!!

    val border: Int

    val halfBorder: Int

    private var buttonBasicColor: BasicColor

    private var formTypeItemIndexPaintable: ItemIndexPaintable = ItemIndexPaintable.getInstance()!!

    private var formTypeItemIndexDx: ItemIndexDx = ItemIndexDx.getInstance()!!

    var paintable: ItemPaintable = ItemPaintableFactory.getInstance()!!
public constructor (title: String, items: Array<ABCustomItem?>, formPaintableFactory: ItemPaintableFactory, rectangle: Rectangle, formType: FormType, border: Int, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, rectangle, formType, backgroundBasicColor, foregroundBasicColor){
    //var title = title
    //var items = items
    //var formPaintableFactory = formPaintableFactory
    //var rectangle = rectangle
    //var formType = formType
    //var border = border
    //var backgroundBasicColor = backgroundBasicColor
    //var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.buttonBasicColor= foregroundBasicColor
this.border= border
this.halfBorder= (border shr 1)
this.paintable= formPaintableFactory!!.getInstanceItemPaintable(this)

    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!


    
                        if(formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    this.formTypeItemIndexPaintable= ScrollSelectionFormHorizontalPaintable(this)
this.formTypeItemIndexDx= ScrollSelectionFormHorizontalDx(this)

                                    }
                                
                             else 
    
                        if(formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    this.formTypeItemIndexPaintable= ScrollSelectionFormVerticalPaintable(this)
this.formTypeItemIndexDx= ScrollSelectionFormVericalDx(this)

                                    }
                                
                             else 
    
                        if(formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM)
                        
                                    {
                                    this.formTypeItemIndexPaintable= ScrollSelectionFormTempHorizontalPaintable(this)
this.formTypeItemIndexDx= ScrollSelectionFormTempHorizontalDx(this)

                                    }
                                
                             else 
    
                        if(formType == formTypeFactory!!.NULL_FORM_TYPE)
                        
                                    {
                                    
                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            
}


    open fun paintItemHorizontal(graphics: Graphics, index: Int, item: ABCustomItem, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var graphics = graphics
    //var index = index
    //var item = item
    //var x = x
    //var y = y

    var width: Int = item.getMinimumWidth()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x +width +this.border
}


    open fun paintItemVertical(graphics: Graphics, index: Int, item: ABCustomItem, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var graphics = graphics
    //var index = index
    //var item = item
    //var x = x
    //var y = y

    var height: Int = item.getMinimumHeight()!!




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y +height +this.border
}


    open fun paintItemTempHorizontal(graphics: Graphics, index: Int, item: ABCustomItem, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var graphics = graphics
    //var index = index
    //var item = item
    //var x = x
    //var y = y



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    open fun getSelectedIndexForPointHorizontalDx(index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx -this.halfBorder
}


    open fun getSelectedIndexForPointVerticalDx(index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx +this.getDiffX(item)
}


    open fun getSelectedIndexForPointTempHorizontalDx(index: Int, item: ABCustomItem, dx: Int, dy: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var index = index
    //var item = item
var dx = dx
    //var dy = dy



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx +this.getDiffX(item)
}


    override fun append(item: ABCustomItem)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var item = item



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.append(item)
}


                @Throws(Exception::class)
            
    open fun getSelectedItem(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: ABCustomItem{
    //var point = point

    var index: Int = this.getSelectedIndexForPoint(point)!!


    
                        if(index !=  -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.get(index)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ABCustomItem.NULL_CUSTOM_ITEM

                        }
                            
}


                @Throws(Exception::class)
            
    open fun getItemIndex(item: ABCustomItem)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var item = item

    var size: Int = this.size()!!





                        for (index in 0 until size)

        {

    var nextItem: ABCustomItem = this.get(index) as ABCustomItem


    
                        if(nextItem == item)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


    open fun getStartIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


                @Throws(Exception::class)
            
    open fun getSelectedIndexForPoint(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var point = point

    var start: Int = this.getStartIndex()!!


    var size: Int = this.size()!!


    var dx: Int = this.getDx()!!


    var dy: Int = this.getDy()!!


    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!


    var commonLabels: CommonLabels = CommonLabels.getInstance()!!


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(commonLabels!!.START_LABEL)
stringBuffer!!.appendint(start)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(commonLabels!!.TOTAL_LABEL)
stringBuffer!!.appendint(size)
this.logUtil!!.putF(stringBuffer!!.toString(), this, ScrollSelectionForm.GET_SELECTED_INDEX)

    var item: ABCustomItem


    var width: Int= 0


    var height: Int= 0


    var diffX: Int= 0





                        for (index in start until size)

        {
item= this.get(index)
width= item.getMinimumWidth()
height= item.getMinimumHeight()
diffX= this.formTypeItemIndexDx!!.getDx(index, item, dx, dy)

    
                        if(this.rectangleCollisionUtil!!.isInside(diffX, dy -this.halfBorder, diffX +width +this.border, dy +height +this.halfBorder +1, point.getX(), point.getY()))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(commonLabels!!.ITEM_LABEL)
stringBuffer!!.append(item.getLabel())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(commonLabels!!.INDEX_LABEL)
stringBuffer!!.appendint(index)
this.logUtil!!.putF(stringBuffer!!.toString(), this, ScrollSelectionForm.GET_SELECTED_INDEX)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                

    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    dx= dx +width +this.border

    
                        if(dx > this.rectangle.getMaxX())
                        
                                    {
                                    break;

                    

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    dy= dy +height +this.border

    
                        if(dy > this.rectangle.getMaxY())
                        
                                    {
                                    break;

                    

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.NULL_FORM_TYPE)
                        
                                    {
                                    
                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


                @Throws(Exception::class)
            
    open fun processInputKey(gameKeyCode: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var gameKeyCode = gameKeyCode

    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!


    
                        if(this.size() == 0)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1

                                    }
                                

    var index: Int = this.getSelectedIndex()!!


    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM || this.formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM)
                        
                                    {
                                    
    
                        if(gameKeyCode == Canvas.RIGHT)
                        
                                    {
                                    index++

                                    }
                                
                             else 
    
                        if(gameKeyCode == Canvas.LEFT)
                        
                                    {
                                    index--

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    
    
                        if(gameKeyCode == Canvas.DOWN)
                        
                                    {
                                    index++

                                    }
                                
                             else 
    
                        if(gameKeyCode == Canvas.UP)
                        
                                    {
                                    index--

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.NULL_FORM_TYPE)
                        
                                    {
                                    
                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            

    var max: Int = this.size() -1


    
                        if(index < 0)
                        
                                    {
                                    this.setSelectedIndex(0)

                                    }
                                
                             else 
    
                        if(index > max)
                        
                                    {
                                    this.setSelectedIndex(max)

                                    }
                                
                        else {
                            this.setSelectedIndex(index)

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


    open fun isInForm(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
    //var point = point

    
                        if(this.rectangleCollisionUtil!!.isInside(this.x, this.y -this.halfBorder, this.rectangle.getMaxX() +this.border, this.rectangle.getMaxY() +this.border, point.getX(), point.getY()))
                        
                                    {
                                    this.logUtil!!.putF(StringMaker().
                            append(StringUtil.getInstance()!!.toString(point))!!.append(ScrollSelectionForm.INSIDE_FORM)!!.toString(), this, ScrollSelectionForm.IS_IN_FORM)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
    open fun paintItem(graphics: Graphics, index: Int, item: ABCustomItem, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var graphics = graphics
    //var index = index
    //var item = item
    //var x = x
    //var y = y
item.paintXY(graphics, x, y)

    var width: Int = item.getMinimumWidth()!!


    var height: Int = item.getMinimumHeight()!!

graphics.setColor(this.getButtonBasicColor()!!.toInt())

    var adjustedBorder: Int = 3

graphics.drawRect(x -this.halfBorder -adjustedBorder, y -this.halfBorder -adjustedBorder, width +this.border -adjustedBorder, height +this.border -adjustedBorder)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.formTypeItemIndexPaintable!!.paint(graphics, index, item, x, y)
}


                @Throws(Exception::class)
            
    open fun paintUnselectedItem(graphics: Graphics, index: Int, item: ABCustomItem, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var graphics = graphics
    //var index = index
    //var item = item
    //var x = x
    //var y = y
graphics.setColor(this.getButtonBasicColor()!!.toInt())
item.paintUnselected(graphics, x, y)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.formTypeItemIndexPaintable!!.paint(graphics, index, item, x, y)
}


    open fun getDiffX(item: ABCustomItem)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var item = item



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    open fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.x
}


    open fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.y
}


    open fun setButtonBasicColor(buttonBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{
    //var buttonBasicColor = buttonBasicColor
this.buttonBasicColor= buttonBasicColor
}


    open fun getButtonBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.buttonBasicColor
}


}
                
            

