
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
        package org.allbinary.game.input




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.input.mapping.PersistentInputMapping
import org.allbinary.input.motion.button.BasicTouchInputFactory
import org.allbinary.input.motion.gesture.TouchMotionGestureFactory
import org.allbinary.input.motion.gesture.TrackballMotionGestureFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface

open public class PCGameInputMapping : PersistentInputMapping {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
                @Throws(Exception::class)
            
    override fun init(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
{
    //var abeClientInformation = abeClientInformation
logUtil!!.put(this.commonStrings!!.START, this, this.commonStrings!!.INIT)
PCKeyFactory.getInstance()
TouchMotionGestureFactory.getInstance()
TrackballMotionGestureFactory.getInstance()
BasicTouchInputFactory.getInstance()
super.init(abeClientInformation)

    
                        if(this.getTotalMapped() == 0 || this.isDefaultNew())
                        
                                    {
                                    this.getInputMapping()!!.add(this.getDefault())
this.save(abeClientInformation)

                                    }
                                
}


    override fun isDelete(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input

    
                        if(input == PCKeyFactory.getInstance()!!.DEL)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                        }
                            
}


    override fun isSystemInput(input: Input)
        //nullable = true from not(false or (false and false)) = true
: Boolean{
var input = input



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
}


}
                
            

