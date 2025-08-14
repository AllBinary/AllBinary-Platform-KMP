
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        
import javax.microedition.lcdui.Graphics
import org.allbinary.graphics.paint.InitUpdatePaintable
import org.allbinary.graphics.paint.NullInitUpdatePaintable

open public class RTSLayerInfoPaintable : InitUpdatePaintable {
        

    private var initUpdatePaintable: InitUpdatePaintable = NullInitUpdatePaintable.getInstance()!!
            
public constructor        (){}


open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.initUpdatePaintable!!.update()
}


open fun paint(graphics: Graphics)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics
this.initUpdatePaintable!!.paint(graphics)
}


open fun updateRTSLayerInfo(hudPaintable: InitUpdatePaintable)
        //nullable = true from not(false or (false and false)) = true
{

                    var hudPaintable = hudPaintable
this.initUpdatePaintable= hudPaintable
}


open fun updateRTSLayerInfo(hudPaintable: SelectionHudPaintable)
        //nullable = true from not(false or (false and false)) = true
{

                    var hudPaintable = hudPaintable
hudPaintable!!.updateSelectionInfo()
this.initUpdatePaintable= hudPaintable
}


}
                
            

