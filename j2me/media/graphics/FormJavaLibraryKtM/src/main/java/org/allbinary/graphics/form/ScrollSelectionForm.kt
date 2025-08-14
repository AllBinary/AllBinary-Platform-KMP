
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
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.graphics.form.item.CustomItemInterface
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.string.StringUtil
import org.allbinary.math.RectangleCollisionUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonSeps

open public class ScrollSelectionForm : PaintableForm {
        

        companion object {
            
    val NULL_SCROLL_SELECTION_FORM: ScrollSelectionForm = ScrollSelectionForm(StringUtil.getInstance()!!.EMPTY_STRING, arrayOfNulls(0), RectangleFactory.SINGLETON, FormTypeFactory.getInstance()!!.NULL_FORM_TYPE, 0, BasicColorFactory.getInstance()!!.BLACK, BasicColorFactory.getInstance()!!.WHITE)

    private val GET_SELECTED_INDEX: String = "getSelectedIndex"

    private val INSIDE_FORM: String = " inside form"

    private val IS_IN_FORM: String = "isInForm"

        }
            
    private val rectangleCollisionUtil: RectangleCollisionUtil = RectangleCollisionUtil.getInstance()!!
            

    val border: Int

    val halfBorder: Int

    private var buttonBasicColor: BasicColor

    var paintable: ItemPaintable = ItemPaintableFactory.getInstance()!!
            
public constructor        (title: String, items: Array<CustomItem?>, formPaintableFactory: ItemPaintableFactory, rectangle: Rectangle, formType: FormType, border: Int, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : this(title, items, rectangle, formType, border, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var items = items


                    var formPaintableFactory = formPaintableFactory


                    var rectangle = rectangle


                    var formType = formType


                    var border = border


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.paintable= formPaintableFactory!!.getInstance(this)
}

public constructor        (title: String, items: Array<CustomItem?>, rectangle: Rectangle, formType: FormType, border: Int, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, rectangle, formType, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var items = items


                    var rectangle = rectangle


                    var formType = formType


                    var border = border


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.buttonBasicColor= foregroundBasicColor
this.border= border
this.halfBorder= (border shr 1)
}

override fun append(item: CustomItem)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var item = item



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.append(item)
}


                @Throws(Exception::class)
            
open fun getSelectedItem(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: CustomItem{

                    var point = point

    var index: Int = this.getSelectedIndex(point)!!
            


    
                        if(index !=  -1)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.get(index)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CustomItem.NULL_CUSTOM_ITEM

                        }
                            
}


                @Throws(Exception::class)
            
open fun getItemIndex(item: CustomItem)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var item = item

    var size: Int = this.size()!!
            





                        for (index in 0 until size)


        {
    var nextItem: CustomItemInterface = this.get(index) as CustomItemInterface


    
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
            
open fun getSelectedIndex(point: GPoint)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var point = point

    var start: Int = this.getStartIndex()!!
            


    var size: Int = this.size()!!
            


    var dx: Int = this.getDx()!!
            


    var dy: Int = this.getDy()!!
            


    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!
            


    var commonLabels: CommonLabels = CommonLabels.getInstance()!!
            


    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(commonLabels!!.START_LABEL)
stringBuffer!!.append(start)
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(commonLabels!!.TOTAL_LABEL)
stringBuffer!!.append(size)
logUtil!!.put(stringBuffer!!.toString(), this, GET_SELECTED_INDEX)

    var item: CustomItemInterface


    var width: Int= 0


    var height: Int= 0





                        for (index in start until size)


        {item= this.get(index) as CustomItemInterface
width= item.getMinimumWidth()
height= item.getMinimumHeight()

    var diffX: Int = 0


    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    diffX= dx -this.halfBorder

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM || this.formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM)
                        
                                    {
                                    diffX= dx +this.getDiffX(item)

                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            

    
                        if(rectangleCollisionUtil!!.isInside(diffX, dy -this.halfBorder, diffX +width +this.border, dy +height +this.halfBorder +1, point.getX(), point.getY()))
                        
                                    {
                                    stringBuffer!!.delete(0, stringBuffer!!.length())
stringBuffer!!.append(commonLabels!!.ITEM_LABEL)
stringBuffer!!.append(item.getLabel())
stringBuffer!!.append(CommonSeps.getInstance()!!.SPACE)
stringBuffer!!.append(commonLabels!!.INDEX_LABEL)
stringBuffer!!.append(index)
logUtil!!.put(stringBuffer!!.toString(), this, GET_SELECTED_INDEX)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return index

                                    }
                                

    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    dx= dx +width +border

    
                        if(dx > this.rectangle.getMaxX())
                        
                                    {
                                    break;

                    

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    dy= dy +height +border

    
                        if(dy > this.rectangle.getMaxY())
                        
                                    {
                                    break;

                    

                                    }
                                

                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return  -1
}


                @Throws(Exception::class)
            
open fun processInput(gameKeyCode: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var gameKeyCode = gameKeyCode

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

                    var point = point

    
                        if(rectangleCollisionUtil!!.isInside(x, y -halfBorder, this.rectangle.getMaxX() +border, this.rectangle.getMaxY() +border, point.getX(), point.getY()))
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append(StringUtil.getInstance()!!.toString(point))!!.append(INSIDE_FORM)!!.toString(), this, IS_IN_FORM)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


                @Throws(Exception::class)
            
open fun paintItem(graphics: Graphics, index: Int, item: CustomItemInterface, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var graphics = graphics


                    var index = index


                    var item = item


                    var x = x


                    var y = y

    var width: Int = item.getMinimumWidth()!!
            


    var height: Int = item.getMinimumHeight()!!
            


    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!
            

item.paint(graphics, x, y)
graphics.setColor(this.getButtonBasicColor()!!.toInt())
graphics.drawRect(x -halfBorder, y -halfBorder, width +border, height +border)

    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x +width +border

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y +height +border

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0

                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            
}


                @Throws(Exception::class)
            
open fun paintUnselectedItem(graphics: Graphics, index: Int, item: CustomItemInterface, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var graphics = graphics


                    var index = index


                    var item = item


                    var x = x


                    var y = y

    var width: Int = item.getMinimumWidth()!!
            


    var height: Int = item.getMinimumHeight()!!
            

graphics.setColor(this.getButtonBasicColor()!!.toInt())
item.paintUnselected(graphics, x, y)

    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!
            


    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x +width +border

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y +height +border

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0

                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            
}


open fun getDiffX(item: CustomItemInterface)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var item = item



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


open fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return x
}


open fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return y
}


open fun setButtonBasicColor(buttonBasicColor: BasicColor)
        //nullable = true from not(false or (false and false)) = true
{

                    var buttonBasicColor = buttonBasicColor
this.buttonBasicColor= buttonBasicColor
}


open fun getButtonBasicColor()
        //nullable = true from not(false or (false and true)) = true
: BasicColor{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buttonBasicColor
}


}
                
            

