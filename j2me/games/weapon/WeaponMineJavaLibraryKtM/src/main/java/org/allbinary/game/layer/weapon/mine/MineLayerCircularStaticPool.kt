
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
        package org.allbinary.game.layer.weapon.mine




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.weapon.WeaponLayerCircularPool
import org.allbinary.view.ViewPositionFactoryInterface

open public class MineLayerCircularStaticPool
            : Object
         {
        

        companion object {
            
    private var WEAPON_LAYER_CIRCULAR_STATIC_POOL: WeaponLayerCircularPool = WeaponLayerCircularPool()

                @Throws(Exception::class)
            
open fun init(viewPositionFactoryInterface: ViewPositionFactoryInterface)
        //nullable = true from not(false or (false and false)) = true
{
var viewPositionFactoryInterface = viewPositionFactoryInterface
MineCountedPickedUpLayerInterfaceFactory.init()
WEAPON_LAYER_CIRCULAR_STATIC_POOL.init(MineLayerFactory(viewPositionFactoryInterface), 20)
}


open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: WeaponLayerCircularPool{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return WEAPON_LAYER_CIRCULAR_STATIC_POOL
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
}
                
            

