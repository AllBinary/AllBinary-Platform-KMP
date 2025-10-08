
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
        package org.allbinary.game.layer.pickup.points




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.game.score.ScoreableInterface
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerCircularPool
import org.allbinary.layer.AllBinaryLayerFactoryInterface

open public class PointsLayerCircularStaticPool : AllBinaryLayerCircularPool {
        
public constructor (allbinaryLayerFactoryInterface: AllBinaryLayerFactoryInterface, total: Int){
var allbinaryLayerFactoryInterface = allbinaryLayerFactoryInterface
var total = total
super.init(allbinaryLayerFactoryInterface, total)
}


                @Throws(Exception::class)
            
    open fun visit(sourceLayerInterface: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
{
var sourceLayerInterface = sourceLayerInterface

    var pointsLayer: PointsLayer = this.getNextInstance() as PointsLayer


    var scoreableInterface: ScoreableInterface = sourceLayerInterface as ScoreableInterface

pointsLayer!!.visit(scoreableInterface)
}


}
                
            

