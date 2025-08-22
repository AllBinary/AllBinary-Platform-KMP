
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
import org.allbinary.animation.Animation
import org.allbinary.animation.FeaturedAnimationInterfaceFactoryInterfaceFactory
import org.allbinary.logic.system.security.licensing.LockedResources
import org.allbinary.logic.system.security.licensing.LockedUtil

open public class LockablePaintable : ItemPaintable {
        

    private val animation: Animation = FeaturedAnimationInterfaceFactoryInterfaceFactory.getInstance()!!.get(LockedResources.getInstance()!!.LOCKED_DEMO_GAME_FEATURE_RESOURCE)!!.getInstance(0)!!

    private val lockedIndex: Int
public constructor        (lockedIndex: Int){

                    var lockedIndex = lockedIndex
this.lockedIndex= lockedIndex
}

override fun paint(graphics: Graphics, currentIndex: Int, x: Int, y: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var graphics = graphics


                    var currentIndex = currentIndex


                    var x = x


                    var y = y

    
                        if(LockedUtil.getInstance()!!.isLockedFeature() && currentIndex >= this.getLockedIndex())
                        
                                    {
                                    this.getAnimation()!!.paint(graphics, x, y)

                                    }
                                
}


open fun getLockedIndex()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return lockedIndex
}


open fun getAnimation()
        //nullable = true from not(false or (false and true)) = true
: Animation{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return animation
}


}
                
            

