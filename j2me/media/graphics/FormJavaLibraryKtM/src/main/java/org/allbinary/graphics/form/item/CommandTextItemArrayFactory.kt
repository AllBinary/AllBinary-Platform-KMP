
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
        package org.allbinary.graphics.form.item




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import javax.microedition.lcdui.Command
import javax.microedition.lcdui.ImageItem
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.form.ScreenInfo
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.util.visitor.Visitor
import org.allbinary.util.BasicArrayList

open public class CommandTextItemArrayFactory
            : Object
         {
        

    private val list: BasicArrayList = BasicArrayList()

    private val visitorInterface: Visitor
public constructor        (visitorInterface: Visitor)
            : super()
        {

                    var visitorInterface = visitorInterface
this.visitorInterface= visitorInterface
}


open fun getInstance(vector: Vector<Any>, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)
        //nullable =  from not(true or (false and false)) = 
: Array<CustomItem?>{

                    var vector = vector


                    var backgroundBasicColor = backgroundBasicColor


                    var foregroundBasicColor = foregroundBasicColor

    var size: Int = vector.size!!

list.clear()

    var textItem: CommandTextItem


    var priorityLimit: Int = 7


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!


    var isLargeEnoughDisplayForBigMenu: Boolean = (displayInfo!!.isPortrait() && displayInfo!!.getLastHeight() >= ScreenInfo.getInstance()!!.MEDIUM_WIDTH) || (!displayInfo!!.isPortrait() && displayInfo!!.getLastWidth() >= ScreenInfo.getInstance()!!.MEDIUM_WIDTH)


    
                        if(!isLargeEnoughDisplayForBigMenu && size > 3)
                        
                                    {
                                    priorityLimit= 3

                                    }
                                

    var command: Command





                        for (index in 0 until size)

        {command= vector.elementAt(index) as Command

    
                        if(command.getPriority() < priorityLimit)
                        
                                    {
                                    
    var aBoolean: Boolean = this.visitorInterface!!.visit(command) as Boolean


    
                        if(aBoolean)
                        
                                    {
                                    textItem= CommandTextItem(command, ImageItem.LAYOUT_DEFAULT, StringUtil.getInstance()!!.EMPTY_STRING, backgroundBasicColor, foregroundBasicColor)
list.add(textItem)

                                    }
                                

                                    }
                                
}


    var textItemArray: Array<CustomItem?> = arrayOfNulls(list.size())


    var size2: Int = textItemArray!!.size
                





                        for (index in 0 until size2)

        {textItemArray[index]= list.objectArray[index]!! as CustomItem
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return textItemArray
}


}
                
            

