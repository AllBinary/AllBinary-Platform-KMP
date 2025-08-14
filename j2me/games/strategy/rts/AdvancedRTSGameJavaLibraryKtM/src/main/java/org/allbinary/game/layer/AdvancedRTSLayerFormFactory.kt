
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
        
import org.allbinary.game.input.RTSLayerFormFactory
import org.allbinary.graphics.form.item.CustomItem
import org.allbinary.string.CommonStrings
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.graphics.form.ScrollSelectionForm
import org.allbinary.graphics.form.item.ItemArraySingletonFactoryInterface

open public class AdvancedRTSLayerFormFactory : RTSLayerFormFactory {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private var scrollSelectionForm: ScrollSelectionForm
protected constructor        (label: String, itemArrayFactoryInterface: ItemArraySingletonFactoryInterface){

                    var label = label


                    var itemArrayFactoryInterface = itemArrayFactoryInterface

        try {
            
    var items: Array<CustomItem?> = itemArrayFactoryInterface!!.getItems()!!
            

this.scrollSelectionForm= RTSScrollSelectionFormFactory.getInstance(label, items)
} catch(e: Exception)
            {
    var commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.CONSTRUCTOR, e)
}

}


open fun getInstance(rtsLayer: RTSLayer)
        //nullable =  from not(true or (false and false)) = 
: ScrollSelectionForm{

                    var rtsLayer = rtsLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.scrollSelectionForm
}


}
                
            

