
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
        package org.allbinary.game.layer.weapon




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.util.CircularIndexUtil

open public class WeaponLayerArrayLayerCircularStaticPool
            : Object
         {
        
companion object {
            
    private val instance: WeaponLayerArrayLayerCircularStaticPool = WeaponLayerArrayLayerCircularStaticPool()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: WeaponLayerArrayLayerCircularStaticPool{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val MAX: Int = 5

    private var circularIndexUtil: CircularIndexUtil = CircularIndexUtil.getInstance(MAX)!!

    private var ALL_WEAPONLAYER_ARRAY: Array<Array<Array<Any?>?>?> = arrayOfNulls(4)
                                                        

    open fun init()
        //nullable = true from not(false or (false and true)) = true
{

    var WEAPONLAYER_ARRAY: Array<Array<Any?>?> = arrayOfNulls<Array<Any?>>(MAX *2)
                                                            


    var TWO_WEAPONLAYER_ARRAY: Array<Array<Any?>?> = arrayOfNulls<Array<Any?>>(MAX)
                                                            


    var THREE_WEAPONLAYER_ARRAY: Array<Array<Any?>?> = arrayOfNulls<Array<Any?>>(MAX)
                                                            





                        for (index in 0 until MAX)

        {
WEAPONLAYER_ARRAY[index]= arrayOfNulls(1)
TWO_WEAPONLAYER_ARRAY[index]= arrayOfNulls(2)
THREE_WEAPONLAYER_ARRAY[index]= arrayOfNulls(3)
}

ALL_WEAPONLAYER_ARRAY[1]= WEAPONLAYER_ARRAY
ALL_WEAPONLAYER_ARRAY[2]= TWO_WEAPONLAYER_ARRAY
ALL_WEAPONLAYER_ARRAY[3]= THREE_WEAPONLAYER_ARRAY
}


                @Throws(Exception::class)
            @Synchronized //TWB - This is not allowed for Kotlin native. Instead use Coroutine logic instead.

    open fun getInstance(size: Int)
        //nullable =  from not(true or (false and false)) = 
: Array<WeaponLayer?>{
var size = size

    var weaponLayerArray: Array<WeaponLayer?> = ALL_WEAPONLAYER_ARRAY[size]!![circularIndexUtil!!.getIndex()]!! as Array<WeaponLayer?>

circularIndexUtil!!.next()



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return weaponLayerArray
}


}
                
            

