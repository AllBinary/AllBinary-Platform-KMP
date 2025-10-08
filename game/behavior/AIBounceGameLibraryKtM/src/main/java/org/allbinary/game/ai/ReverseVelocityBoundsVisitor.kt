
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.bounds.BoundsVisitorInterface
import org.allbinary.game.physics.velocity.VelocityInterface
import org.allbinary.game.physics.velocity.VelocityInterfaceCompositeInterface
import org.allbinary.layer.LayerInterface
import org.allbinary.logic.communication.log.LogUtil

open public class ReverseVelocityBoundsVisitor
            : Object
        
                , BoundsVisitorInterface {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    var velocityInterface: VelocityInterface

    private var layerInterface: LayerInterface
public constructor (layerInterface: LayerInterface)
            : super()
        {
var layerInterface = layerInterface
this.layerInterface= layerInterface

    var velocityInterfaceCompositeInterface: VelocityInterfaceCompositeInterface = layerInterface as VelocityInterfaceCompositeInterface

this.velocityInterface= velocityInterfaceCompositeInterface!!.getVelocityProperties() as VelocityInterface
}


    override fun getX()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layerInterface!!.getXP()
}


    override fun getY()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.layerInterface!!.getYP()
}


    override fun minX()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.velocityInterface!!.getVelocityXBasicDecimalP()!!.getUnscaled() < 0)
                        this.velocityInterface!!.getVelocityXBasicDecimalP()!!.multiply( -1)
}


    override fun maxX()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.velocityInterface!!.getVelocityXBasicDecimalP()!!.getUnscaled() > 0)
                        this.velocityInterface!!.getVelocityXBasicDecimalP()!!.multiply( -1)
}


    override fun minY()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.velocityInterface!!.getVelocityYBasicDecimalP()!!.getUnscaled() < 0)
                        this.velocityInterface!!.getVelocityYBasicDecimalP()!!.multiply( -1)
}


    override fun maxY()
        //nullable = true from not(false or (false and true)) = true
{

    
                        if(this.velocityInterface!!.getVelocityYBasicDecimalP()!!.getUnscaled() > 0)
                        this.velocityInterface!!.getVelocityYBasicDecimalP()!!.multiply( -1)
}


}
                
            

