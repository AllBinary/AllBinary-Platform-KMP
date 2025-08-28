
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
        
import org.allbinary.graphics.form.ItemPaintable
import org.allbinary.graphics.form.ItemPaintableFactory
import org.allbinary.graphics.form.PaintableForm
import org.allbinary.graphics.form.ScrollCurrentSelectionForm

open public class PreGameLockableFormPaintableFactory : ItemPaintableFactory {
        

    private val lockedIndex: Int
public constructor        (lockedIndex: Int)

        Updates for KMP build        
        {
var lockedIndex = lockedIndex
this.lockedIndex= lockedIndex
}


                @Throws(Exception::class)
            
open fun getInstance(paintableForm: PaintableForm)
        //nullable =  from not(true or (false and false)) = 
: ItemPaintable

        Updates for KMP build        
        {
var paintableForm = paintableForm



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return PreGameLockablePaintable(paintableForm as ScrollCurrentSelectionForm, this.lockedIndex)
}


}
                
            

