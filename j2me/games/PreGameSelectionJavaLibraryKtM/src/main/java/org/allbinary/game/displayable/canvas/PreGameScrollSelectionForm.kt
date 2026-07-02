
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
        package org.allbinary.game.displayable.canvas




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.graphics.form.item.ABCustomItem
import org.allbinary.graphics.Rectangle
import org.allbinary.graphics.color.BasicColor
import org.allbinary.graphics.form.FormTypeFactory
import org.allbinary.graphics.form.ItemPaintableFactory
import org.allbinary.graphics.form.ScrollCurrentSelectionForm

open public class PreGameScrollSelectionForm : ScrollCurrentSelectionForm {
        
public constructor (title: String, items: Array<ABCustomItem?>, formPaintableFactory: ItemPaintableFactory, backgroundBasicColor: BasicColor, foregroundBasicColor: BasicColor)                        

                            : super(title, items, formPaintableFactory, 0, 3, false, backgroundBasicColor, foregroundBasicColor){
    //var title = title
    //var items = items
    //var formPaintableFactory = formPaintableFactory
    //var backgroundBasicColor = backgroundBasicColor
    //var foregroundBasicColor = foregroundBasicColor


                            //For kotlin this is before the body of the constructor.
                    
}


                @Throws(Exception::class)
            
    open fun init(rectangle: Rectangle)
        //nullable = true from not(false or (false and false)) = true
{
    //var rectangle = rectangle
super.init(rectangle, FormTypeFactory.getInstance()!!.TEMP_HORIZONTAL_FORM)
}


}
                
            

