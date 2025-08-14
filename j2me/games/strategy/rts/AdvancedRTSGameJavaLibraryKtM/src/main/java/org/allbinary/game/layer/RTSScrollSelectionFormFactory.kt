
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.graphics.PointFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColorFactory
import org.allbinary.graphics.displayable.DisplayInfoSingleton
import org.allbinary.graphics.form.FormTypeFactory
import org.allbinary.graphics.form.MultipleScrollSelectionHorizontalForm
import org.allbinary.input.motion.button.CommonButtons
import org.allbinary.input.motion.button.TouchButtonInput
import org.allbinary.input.motion.button.TouchButtonLocationHelper

open public class RTSScrollSelectionFormFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(formLabel: String, items: Array<CustomItem?>)
        //nullable =  from not(true or (false and false)) = 
: MultipleScrollSelectionHorizontalForm{

                    var formLabel = formLabel


                    var items = items

    var basicColorFactory: BasicColorFactory = BasicColorFactory.getInstance()!!
            


    var touchButtonLocationHelper: TouchButtonLocationHelper = TouchButtonLocationHelper()


    var displayInfo: DisplayInfoSingleton = DisplayInfoSingleton.getInstance()!!
            


    var menuX: Int = CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE +touchButtonLocationHelper!!.getColumnsRemainderHalf()


    var width: Int = displayInfo!!.getLastWidth() -(menuX *2)


    var menuRectangle: Rectangle = Rectangle(PointFactory.getInstance()!!.getInstance(menuX, 16), width, CommonButtons.getInstance()!!.STANDARD_BUTTON_SIZE)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return MultipleScrollSelectionHorizontalForm(formLabel, items, menuRectangle, FormTypeFactory.getInstance()!!.HORIZONTAL_FORM, 0, basicColorFactory!!.BLACK, basicColorFactory!!.WHITE)
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

