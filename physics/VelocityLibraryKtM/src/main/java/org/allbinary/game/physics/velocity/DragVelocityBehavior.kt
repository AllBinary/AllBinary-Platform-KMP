
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
        package org.allbinary.game.physics.velocity



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.math.BasicDecimal

open public class DragVelocityBehavior : VelocityBehaviorBase {
        

        companion object {


    val instance: DragVelocityBehavior = DragVelocityBehavior()


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        override fun reduce(velocityProperties: BasicVelocityProperties, nominator: Int, denominator: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var velocityProperties = velocityProperties


                    var nominator = nominator


                    var denominator = denominator

    
                        if(velocityProperties!!.getVelocityXBasicDecimalP()!!.getUnscaled() != 0L)
                        
                                    {
                                    
    var basicDecimal: BasicDecimal = velocityProperties!!.getVelocityXBasicDecimalP()!!
            

basicDecimal!!.multiply(nominator)
basicDecimal!!.divide(denominator)

                                    }
                                

    
                        if(velocityProperties!!.getVelocityYBasicDecimalP()!!.getUnscaled() != 0L)
                        
                                    {
                                    
    var basicDecimal: BasicDecimal = velocityProperties!!.getVelocityYBasicDecimalP()!!
            

basicDecimal!!.multiply(nominator)
basicDecimal!!.divide(denominator)

                                    }
                                
}

override fun reduceX(velocityProperties: BasicVelocityProperties, nominator: Int, denominator: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var velocityProperties = velocityProperties


                    var nominator = nominator


                    var denominator = denominator

    var basicDecimal: BasicDecimal = velocityProperties!!.getVelocityXBasicDecimalP()!!
            


    
                        if(basicDecimal!!.getUnscaled() != 0L)
                        
                                    {
                                    basicDecimal!!.multiply(nominator)
basicDecimal!!.divide(denominator)

                                    }
                                
}

override fun reduceY(velocityProperties: BasicVelocityProperties, nominator: Int, denominator: Int)
        //nullable = true from not(false or (false and false)) = true
{

                    var velocityProperties = velocityProperties


                    var nominator = nominator


                    var denominator = denominator

    
                        if(velocityProperties!!.getVelocityYBasicDecimalP()!!.getUnscaled() != 0L)
                        
                                    {
                                    
    var basicDecimal: BasicDecimal = velocityProperties!!.getVelocityYBasicDecimalP()!!
            

basicDecimal!!.multiply(nominator)
basicDecimal!!.divide(denominator)

                                    }
                                
}


}
                
            

