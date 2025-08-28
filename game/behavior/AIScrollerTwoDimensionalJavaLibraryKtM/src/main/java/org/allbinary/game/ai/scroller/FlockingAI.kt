
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
        package org.allbinary.game.ai.scroller




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import javax.microedition.lcdui.Canvas
import org.allbinary.game.ai.BasicAI
import org.allbinary.game.identification.BasicGroupFactory
import org.allbinary.game.input.GameInput
import org.allbinary.game.layer.identification.GroupLayerManagerListener
import org.allbinary.game.layer.weapon.WeaponLayer
import org.allbinary.layer.AllBinaryLayer
import org.allbinary.layer.AllBinaryLayerManager
import org.allbinary.logic.math.MathUtil
import org.allbinary.util.BasicArrayList

open public class FlockingAI : BasicAI {
        

    private val allowedDistance: Int
public constructor        (hashtable: Hashtable<Any, Any>, ownerLayerInterface: AllBinaryLayer, gameInput: GameInput)                        

                            : super(ownerLayerInterface, gameInput){
var hashtable = hashtable
var ownerLayerInterface = ownerLayerInterface
var gameInput = gameInput


                            //For kotlin this is before the body of the constructor.
                    

    var allowedDistance: Integer = hashtable.get(BasePatrolAI.MAX_DISTANCE) as Integer

this.allowedDistance= allowedDistance!!.toInt()
}


                @Throws(Exception::class)
            override fun processAI(allBinaryLayerManager: AllBinaryLayerManager)
        //nullable = true from not(false or (false and false)) = true
{
var allBinaryLayerManager = allBinaryLayerManager

    var maxDistance: Int = 0


    var farAllbinaryLayer: AllBinaryLayer = AllBinaryLayer.NULL_ALLBINARY_LAYER


    var groupLayerManagerListener: GroupLayerManagerListener = GroupLayerManagerListener.getInstance()!!


    var list: BasicArrayList = groupLayerManagerListener!!.getList(BasicGroupFactory.getInstance()!!.ENEMY)!!


    var size: Int = list.size()!!





                        for (index in 0 until size)

        {

    var allBinaryLayer: AllBinaryLayer = list.get(index) as AllBinaryLayer


    
                        if(allBinaryLayer!!.getType() != WeaponLayer.getStaticType())
                        
                                    {
                                    
    var distance: Int = this.getXYDistance(allBinaryLayer)!!


    
                        if(distance > maxDistance)
                        
                                    {
                                    maxDistance= distance
farAllbinaryLayer= allBinaryLayer

    
                        if(distance > this.allowedDistance)
                        
                                    {
                                    break;

                    

                                    }
                                

                                    }
                                

                                    }
                                
}


    
                        if(maxDistance > this.allowedDistance)
                        
                                    {
                                    
    
                        if(farAllbinaryLayer != AllBinaryLayer.NULL_ALLBINARY_LAYER)
                        
                                    {
                                    
    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!


    
                        if(farAllbinaryLayer!!.getXP() < ownerLayerInterface!!.getXP())
                        
                                    {
                                    this.processAI(Canvas.LEFT)

                                    }
                                
                             else 
    
                        if(farAllbinaryLayer!!.getXP() > ownerLayerInterface!!.getXP())
                        
                                    {
                                    this.processAI(Canvas.RIGHT)

                                    }
                                
                             else 
    
                        if(farAllbinaryLayer!!.getYP() > ownerLayerInterface!!.getYP())
                        
                                    {
                                    this.processAI(Canvas.UP)

                                    }
                                
                             else 
    
                        if(farAllbinaryLayer!!.getYP() < ownerLayerInterface!!.getYP())
                        
                                    {
                                    this.processAI(Canvas.DOWN)

                                    }
                                

                                    }
                                

                                    }
                                
}


open fun getXYDistance(allBinaryLayer: AllBinaryLayer)
        //nullable = true from not(false or (false and false)) = true
: Int{
var allBinaryLayer = allBinaryLayer

    var ownerLayerInterface: AllBinaryLayer = this.getOwnerLayerInterface()!!


    var xTotalDistance: Int = (allBinaryLayer!!.getXP() +allBinaryLayer!!.getHalfWidth()) -(ownerLayerInterface!!.getXP() +ownerLayerInterface!!.getHalfWidth())


    var yTotalDistance: Int = (allBinaryLayer!!.getYP() +allBinaryLayer!!.getHalfHeight()) -(ownerLayerInterface!!.getYP() +ownerLayerInterface!!.getHalfHeight())


    var mathUtil: MathUtil = MathUtil.getInstance()!!


    var totalDistance: Int = mathUtil!!.abs(xTotalDistance) +mathUtil!!.abs(yTotalDistance)




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return totalDistance
}


}
                
            

