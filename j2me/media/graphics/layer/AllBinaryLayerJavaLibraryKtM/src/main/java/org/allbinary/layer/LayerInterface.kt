
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
        package org.allbinary.layer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.identification.GroupInterfaceCompositeInterface
import org.allbinary.graphics.paint.PaintableInterface

interface LayerInterface : NamedInterface, PaintableInterface, GroupInterfaceCompositeInterface, PositionInterface {
        

    open fun getHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getHalfHeight()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getHalfWidth()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getXP()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getYP()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getZP()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getX2()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getY2()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun getZ2()
        //nullable = true from not(false or (false and true)) = true
: Int

    open fun isVisible()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun move(dx: Int, dy: Int, dz: Int)
        //nullable = true from not(false or (false and false)) = true


    open fun setVisible(visible: Boolean)
        //nullable = true from not(false or (false and false)) = true


    open fun implmentsTickableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun implmentsCollidableInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun implmentsGameInputInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun implmentsArtificialIntelligenceCompositeInterface()
        //nullable = true from not(false or (false and true)) = true
: Boolean

    open fun getType()
        //nullable = true from not(false or (false and true)) = true
: Int

}
                
            

