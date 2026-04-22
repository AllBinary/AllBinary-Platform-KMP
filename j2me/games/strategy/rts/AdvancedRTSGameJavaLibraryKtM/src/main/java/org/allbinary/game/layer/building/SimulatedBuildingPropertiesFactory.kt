
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2025 AllBinary 
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
        package org.allbinary.game.layer.building




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.game.combat.damage.DamageFloaters
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.logic.NullUtil

open public class SimulatedBuildingPropertiesFactory : BuildingPropertiesFactory {
        
companion object {
            
    private val instance: SimulatedBuildingPropertiesFactory = SimulatedBuildingPropertiesFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: SimulatedBuildingPropertiesFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    override fun getEfficiencyPerLevel(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var buildingLayer = buildingLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 0
}


    override fun getDamageFloaters(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true
: DamageFloaters{
    //var buildingLayer = buildingLayer

    var damageFloaters: DamageFloaters = DamageFloaters.getInstance()!!

this.damageFloatersPaintableInterface= damageFloaters



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return damageFloaters
}


                @Throws(Exception::class)
            
    override fun getHealthBar(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true
: Paintable{
    //var buildingLayer = buildingLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullPaintable.getInstance()
}


    override fun getHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return NullUtil.getInstance()!!.NULL_TABLE
}


    override fun getTrackingEvent(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true
: TrackingEvent{
    //var buildingLayer = buildingLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TrackingEvent()
}


}
                
            

