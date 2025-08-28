
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
        
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.TouchFeatureFactory
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.form.item.CustomItem

open public class CommandCurrentSelectionFormFactory
            : Object
         {
        

        companion object {
            
                @Throws(Exception::class)
            
open fun getInstance(title: String, items: Array<CustomItem?>, rectangle: Rectangle, formType: FormType, border: Int, moveForSmallScreen: Boolean, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)
        //nullable =  from not(true or (false and false)) = 
: ScrollSelectionForm

        Updates for KMP build        
        {
    //var title = title
    //var items = items
    //var rectangle = rectangle
    //var formType = formType
    //var border = border
    //var moveForSmallScreen = moveForSmallScreen
    //var backgroundBasicColor = backgroundBasicColor
    //var foregroundBasicColor = foregroundBasicColor

    
                        if(Features.getInstance()!!.isFeature(TouchFeatureFactory.getInstance()!!.TOUCH_ENABLED))
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return CommandCurrentSelectionForm(title, items, rectangle, formType, border, moveForSmallScreen, backgroundBasicColor, foregroundBasicColor)

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ScrollSelectionFormNoneFactory.getInstance()

                        }
                            
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

