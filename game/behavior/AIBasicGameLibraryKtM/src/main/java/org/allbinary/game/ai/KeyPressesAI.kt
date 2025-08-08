
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
        package org.allbinary.game.ai



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.game.input.GameInput
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.util.HashtableUtil

open public class KeyPressesAI : BasicAI {
        

    private var on: Boolean = true

    var keys: Array<Integer?>
public constructor        (hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){

                    var hashtable = hashtable


                    var ownerLayerInterface = ownerLayerInterface


                    var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
this.keys= arrayOfNulls(hashtable.size)

    var objectArray: Array<Any?> = HashtableUtil.getInstance()!!.getKeysAsArray(hashtable)!!
            


    var size: Int = objectArray!!.size
                





                        for (index in 0 until size)


        {keys[index]= hashtable.get(objectArray[index]!! as Object) as Integer
}

}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{

                    var allBinaryLayerManager = allBinaryLayerManager

    
                        if(on)
                        
                                    {
                                    



                        for (index in 0 until keys.size)


        {super.processAI(keys[index]!!.toInt())
}


                                    }
                                
}


                @Throws(Exception::class)
            
open fun toggle()
        //nullable = true from not(false or (false and true)) = true
{
    
                        if(isOn())
                        
                                    {
                                    setOn(false)

                                    }
                                
                        else {
                            setOn(true)

                        }
                            
}


                @Throws(Exception::class)
            
open fun disable()
        //nullable = true from not(false or (false and true)) = true
{setOn(false)
}


                @Throws(Exception::class)
            
open fun enable()
        //nullable = true from not(false or (false and true)) = true
{setOn(true)
}


open fun setOn(on: Boolean)
        //nullable = true from not(false or (false and false)) = true
{

                    var on = on
this.on= on
}


open fun isOn()
        //nullable = true from not(false or (false and true)) = true
: Boolean{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return on
}


}
                
            

