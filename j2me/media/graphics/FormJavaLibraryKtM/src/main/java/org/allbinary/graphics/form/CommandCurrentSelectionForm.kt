
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
        
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.Graphics
import org.allbinary.J2MEUtil
import org.allbinary.animation.Animation
import org.allbinary.animation.NullAnimationFactory
import org.allbinary.animation.vector.RectangleAdjustedAnimation
import org.allbinary.animation.vector.RectangleFilledAdjustedAnimation
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.form.item.CommandTextItem
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.graphics.form.item.CustomItemInterface

open public class CommandCurrentSelectionForm : ScrollCurrentSelectionForm {
        

    val selectedAnimationArray: Array<Animation?> = arrayOfNulls(16)

    val unSelectedAnimationArray: Array<Animation?> = arrayOfNulls(16)
public constructor        (title: String, items: Array<CustomItem?>, rectangle: Rectangle, formType: FormType, border: Int, moveForSmallScreen: Boolean, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, rectangle, formType, border, moveForSmallScreen, backgroundBasicColor, foregroundBasicColor){

                    var title = title


                    var items = items


                    var rectangle = rectangle


                    var formType = formType


                    var border = border


                    var moveForSmallScreen = moveForSmallScreen


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
this.initAnimations()
this.update(items)
}


open fun initAnimations()
        //nullable = true from not(false or (false and true)) = true
{
    var nullAnimation: Animation = NullAnimationFactory.getFactoryInstance()!!.getInstance(0)!!
            





                        for (index in selectedAnimationArray!!.size downTo 0)


        {this.selectedAnimationArray[index]= nullAnimation
}





                        for (index in unSelectedAnimationArray!!.size downTo 0)


        {this.unSelectedAnimationArray[index]= nullAnimation
}

}


open fun update(items: Array<CustomItem?>)
        //nullable = true from not(false or (false and false)) = true
{

                    var items = items




                        for (index in items.size downTo 0)


        {this.update(index, items[index]!!)
}

}


open fun update(index: Int, item: CustomItem)
        //nullable = true from not(false or (false and false)) = true
{

                    var index = index


                    var item = item

    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
            


    var buttonColor: BasicColor = basicColorFactory!!.TRANSPARENT_GREY


    var selectedButtonColor: BasicColor = basicColorFactory!!.TRANSPARENT_RED


    var width: Int = item.getMinimumWidth()!!
            


    var height: Int = item.getMinimumHeight()!!
            


    var adjustedBorder: Int = 1


    var offset: Int =  -(halfBorder +adjustedBorder)


    
                        if(J2MEUtil.isJ2ME())
                        
                                    {
                                    this.selectedAnimationArray[index]= RectangleAdjustedAnimation(width +border -adjustedBorder, height +border -adjustedBorder, offset, offset, selectedButtonColor)

                                    }
                                
                        else {
                            this.selectedAnimationArray[index]= RectangleFilledAdjustedAnimation(width +border -adjustedBorder, height +border -adjustedBorder, offset, offset, selectedButtonColor)

                        }
                            
adjustedBorder= 2

    
                        if(J2MEUtil.isJ2ME())
                        
                                    {
                                    this.unSelectedAnimationArray[index]= RectangleAdjustedAnimation(width +border -adjustedBorder, height +border -adjustedBorder, offset, offset, buttonColor)

                                    }
                                
                        else {
                            this.unSelectedAnimationArray[index]= RectangleFilledAdjustedAnimation(width +border -adjustedBorder, height +border -adjustedBorder, offset, offset, buttonColor)

                        }
                            
}


open fun getSelectedCommand()
        //nullable = true from not(false or (false and true)) = true
: Command{
    var index: Int = super.getSelectedIndex()!!
            


    var commandTextItem: CommandTextItem = this.get(index) as CommandTextItem




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return commandTextItem!!.getCommand()
}

override fun append(item: CustomItem)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var item = item

    var result: Int = super.append(item)!!
            

this.update(result, item)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return result
}

override fun delete(itemNum: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var itemNum = itemNum
super.delete(itemNum)
}

override fun deleteAll()
        //nullable = true from not(false or (false and true)) = true
{this.initAnimations()
super.deleteAll()
}

override fun insert(itemNum: Int, item: CustomItem)
        //nullable = true from not(false or (false and false)) = true
{

                    var itemNum = itemNum


                    var item = item
super.insert(itemNum, item)
}

override fun set(itemNum: Int, item: CustomItem)
        //nullable = true from not(false or (false and false)) = true
{

                    var itemNum = itemNum


                    var item = item
super.set(itemNum, item)
}


                @Throws(Exception::class)
            override fun paintItem(graphics: Graphics, index: Int, item: CustomItemInterface, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var graphics = graphics


                    var index = index


                    var item = item


                    var x = x


                    var y = y
this.selectedAnimationArray[index]!!.paint(graphics, x, y)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.paintItem(graphics, index, item, x, y)
}


                @Throws(Exception::class)
            override fun paintUnselectedItem(graphics: Graphics, index: Int, item: CustomItemInterface, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var graphics = graphics


                    var index = index


                    var item = item


                    var x = x


                    var y = y
this.unSelectedAnimationArray[index]!!.paint(graphics, x, y)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return super.paintUnselectedItem(graphics, index, item, x, y)
}


}
                
            

