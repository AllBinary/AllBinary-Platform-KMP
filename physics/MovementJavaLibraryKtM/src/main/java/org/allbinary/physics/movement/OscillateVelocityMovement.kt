
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
        package org.allbinary.physics.movement




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.layer.AllBinaryGameLayer
import org.allbinary.game.physics.velocity.VelocityProperties
import org.allbinary.logic.math.BasicDecimal

open public class OscillateVelocityMovement : BasicConstantVelocityMovement {
        

    private var oscillateMin: Int

    private var oscillateMax: Int

    private var oscillate: Int= 0

    private var oscillatePositive: Boolean= false
public constructor        (speedBasicDecimal: BasicDecimal, oscillateMin: Int, oscillateMax: Int)                        

                            : super(speedBasicDecimal, VelocityProperties(speedBasicDecimal!!.getUnscaled().toInt(), speedBasicDecimal!!.getUnscaled().toInt())){

                    var speedBasicDecimal = speedBasicDecimal


                    var oscillateMin = oscillateMin


                    var oscillateMax = oscillateMax


                            //For kotlin this is before the body of the constructor.
                    
this.oscillateMin= oscillateMin
this.oscillateMax= oscillateMax
}


                @Throws(Exception::class)
            override fun process(layer: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var layer = layer
super.process(layer)

    
                        if(this.oscillate < this.oscillateMin)
                        
                                    {
                                    this.oscillatePositive= true

                                    }
                                
                             else 
    
                        if(this.oscillate > this.oscillateMax)
                        
                                    {
                                    this.oscillatePositive= false

                                    }
                                

    
                        if(this.oscillatePositive)
                        
                                    {
                                    this.oscillate++
this.getVelocityProperties()!!.getVelocityXBasicDecimalP()!!.add(2000)

                                    }
                                
                        else {
                            this.oscillate--
this.getVelocityProperties()!!.getVelocityXBasicDecimalP()!!.subtract(2000)

                        }
                            
}


}
                
            

