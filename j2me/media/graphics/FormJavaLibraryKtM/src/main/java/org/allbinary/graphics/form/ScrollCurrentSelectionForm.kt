
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.graphics.form.item.CustomItemInterface
import org.allbinary.logic.communication.log.LogUtil

open public class ScrollCurrentSelectionForm : ScrollSelectionForm {
        

    private var dx: Int= 0

    private var dy: Int= 0

    private var maxWidth: Int = 0

    private val moveForSmallScreen: Boolean
public constructor        (title: String, items: Array<CustomItem?>, formPaintableFactory: ItemPaintableFactory, rectangle: Rectangle, formType: FormType, border: Int, moveForSmallScreen: Boolean, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, formPaintableFactory, rectangle, formType, border, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var items = items


                    var formPaintableFactory = formPaintableFactory


                    var rectangle = rectangle


                    var formType = formType


                    var border = border


                    var moveForSmallScreen = moveForSmallScreen


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.moveForSmallScreen= moveForSmallScreen
this.init()
}

public constructor        (title: String, items: Array<CustomItem?>, rectangle: Rectangle, formType: FormType, border: Int, moveForSmallScreen: Boolean, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, rectangle, formType, border, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var items = items


                    var rectangle = rectangle


                    var formType = formType


                    var border = border


                    var moveForSmallScreen = moveForSmallScreen


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.moveForSmallScreen= moveForSmallScreen
this.init()
}


                @Throws(Exception::class)
            override fun init(rectangle: Rectangle, formType: FormType)
        //nullable = true from not(false or (false and false)) = true
{

                    var rectangle = rectangle


                    var formType = formType
super.init(rectangle, formType)
this.init()
}


open fun init()
        //nullable = true from not(false or (false and true)) = true
{
    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!


    
                        if(this.formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM)
                        
                                    {
                                    dx= x -30 +(this.rectangle.getWidth() shr 1)
dy= y

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    
    var size: Int = this.size()!!


    var totalWidth: Int = 0





                        for (index in 0 until size)


        {
    var item: CustomItemInterface = this.get(index) as CustomItemInterface

totalWidth += item.getMinimumWidth() +border
}

dx= x +(this.rectangle.getWidth() shr 1) -(totalWidth shr 1)
dy= y +(this.rectangle.getHeight() shr 1)

    
                        if(this.moveForSmallScreen)
                        
                                    {
                                    
    var maxTitleHeight: Int = 175


    
                        if(dy < maxTitleHeight)
                        
                                    {
                                    dy= maxTitleHeight

                                    }
                                

                                    }
                                

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    
    var totalHeight: Int = 0


    var size: Int = this.size()!!





                        for (index in 0 until size)


        {
    var item2: CustomItem = this.get(index)!!


    
                        if(maxWidth < item2.getMinimumWidth())
                        
                                    {
                                    maxWidth= item2.getMinimumWidth()

                                    }
                                
totalHeight += item2.getMinimumHeight() +border
}

dx= ((this.rectangle.getWidth() -maxWidth) /2)

    
                        if(this.size() > 0)
                        
                                    {
                                    dy= y +((this.rectangle.getHeight() -totalHeight) /2)

    
                        if(this.moveForSmallScreen)
                        
                                    {
                                    
    var maxTitleHeight: Int = 175


    
                        if(dy < maxTitleHeight)
                        
                                    {
                                    dy= maxTitleHeight

                                    }
                                

                                    }
                                

                                    }
                                
                        else {
                            dy= y

                        }
                            

                                    }
                                
                        else {
                            logUtil!!.put(formTypeFactory!!.UNK, this, commonStrings!!.INIT)

                        }
                            
}

override fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics

        try {
            
    var delta: Int = 0


    var deltaX: Int = getDx()!!


    var deltaY: Int = getDy()!!


    var size: Int = this.size()!!


    var formTypeFactory: FormTypeFactory = FormTypeFactory.getInstance()!!





                        for (index in 0 until size)


        {
    var item: CustomItemInterface = this.get(index) as CustomItemInterface


    var diffX: Int = 0


    
                        if(this.formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM)
                        
                                    {
                                    diffX= this.getDiffX(item)

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    diffX= this.getDiffX(item) +this.halfBorder

                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            

    
                        if(index == this.getSelectedIndex())
                        
                                    {
                                    delta= this.paintItem(graphics, index, item, deltaX +diffX, deltaY)
this.paintable.paint(graphics, index, deltaX +diffX, deltaY)

                                    }
                                
                        else {
                            delta= this.paintUnselectedItem(graphics, index, item, deltaX +diffX, deltaY)
this.paintable.paint(graphics, index, deltaX +diffX, deltaY)

                        }
                            

    
                        if(this.formType == formTypeFactory!!.TEMP_HORIZONTAL_FORM)
                        
                                    {
                                    
                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.HORIZONTAL_FORM)
                        
                                    {
                                    deltaX= delta

                                    }
                                
                             else 
    
                        if(this.formType == formTypeFactory!!.VERTICAL_CENTER_FORM)
                        
                                    {
                                    deltaY= delta

                                    }
                                
                        else {
                            


                            throw Exception(formTypeFactory!!.UNK)

                        }
                            
}

} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, canvasStrings!!.PAINT, e)
}

}

override fun getDiffX(item: CustomItemInterface)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var item = item



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ((maxWidth -item.getMinimumWidth()) shr 1)
}

override fun getDx()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dx
}

override fun getDy()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return dy
}


}
                
            

