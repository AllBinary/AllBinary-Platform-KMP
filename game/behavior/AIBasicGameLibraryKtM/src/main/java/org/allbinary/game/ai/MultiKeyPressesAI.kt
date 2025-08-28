
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.game.input.GameInput
import org.allbinary.game.input.event.GameKeyEventFactory
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.time.GameTickTimeDelayHelper
import org.allbinary.time.GameTickTimeDelayHelperFactory
import org.allbinary.time.TimeDelayHelper

open public class MultiKeyPressesAI : KeyPressesAI {
        

    private val toggleTimeHelper: TimeDelayHelper = TimeDelayHelper(600)

    private val gameTickTimeDelayHelper: GameTickTimeDelayHelper = GameTickTimeDelayHelperFactory.getInstance()!!
public constructor        (hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(hashtable, ownerLayerInterface, gameInput)

        Updates for KMP build        
        {
var hashtable = hashtable
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    
this.update()
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true


        Updates for KMP build        
        {
var allBinaryLayerManager = allBinaryLayerManager
}


    private val gameKeyEventFactory: GameKeyEventFactory = GameKeyEventFactory.getInstance()!!

                @Throws(Exception::class)
            
open fun update()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    var gameInput: GameInput = this.getGameInput()!!


    var keys: Array<Integer?> = this.keys


    var size: Int = keys.size
                


    
                        if(isOn())
                        
                                    {
                                    



                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var key: Int = keys[index]!!.toInt()!!


    
                        if(key !=  -1)
                        
                                    {
                                    gameInput!!.add(gameKeyEventFactory!!.getInstance(this, key))

                                    }
                                
}


                                    }
                                
                        else {
                            



                        for (index in 0 until size)

        

        Updates for KMP build        
        {

    var key: Int = keys[index]!!.toInt()!!


    
                        if(key !=  -1)
                        
                                    {
                                    gameInput!!.addForRemoval(gameKeyEventFactory!!.getInstance(this, key))

                                    }
                                
}


                        }
                            
}


                @Throws(Exception::class)
            override fun toggle()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(this.toggleTimeHelper!!.isTime(this.gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    super.toggle()
this.update()

                                    }
                                
}


                @Throws(Exception::class)
            override fun disable()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(this.toggleTimeHelper!!.isTime(this.gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    super.disable()
this.update()

                                    }
                                
}


                @Throws(Exception::class)
            override fun enable()
        //nullable = true from not(false or (false and true)) = true


        Updates for KMP build        
        {

    
                        if(this.toggleTimeHelper!!.isTime(this.gameTickTimeDelayHelper!!.startTime))
                        
                                    {
                                    super.enable()
this.update()

                                    }
                                
}


}
                
            

