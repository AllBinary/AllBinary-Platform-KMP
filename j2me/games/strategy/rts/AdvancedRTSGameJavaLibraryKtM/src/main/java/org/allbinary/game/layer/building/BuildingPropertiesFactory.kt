
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
import org.allbinary.game.combat.damage.PtsDamageFloaters
import org.allbinary.game.configuration.feature.Features
import org.allbinary.game.configuration.feature.GameFeatureFactory
import org.allbinary.game.graphics.hud.BasicHudFactory
import org.allbinary.game.health.HealthBar
import org.allbinary.game.health.HealthBarTwodAnimation
import org.allbinary.game.tracking.TrackingEvent
import org.allbinary.graphics.paint.NullPaintable
import org.allbinary.graphics.paint.Paintable
import org.allbinary.layer.AllBinaryLayer

open public class BuildingPropertiesFactory
            : Object
         {
        
companion object {
            
    private val instance: BuildingPropertiesFactory = BuildingPropertiesFactory()

    open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: BuildingPropertiesFactory{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    open fun getEfficiencyPerLevel(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true
: Int{
    //var buildingLayer = buildingLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return 10000 /buildingLayer!!.getMaxLevel() +10000 % buildingLayer!!.getMaxLevel()
}


    var damageFloatersPaintableInterface: Paintable = NullPaintable.getInstance()!!

    open fun getDamageFloaters(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true
: DamageFloaters{
    //var buildingLayer = buildingLayer

    var damageFloaters: DamageFloaters = DamageFloaters.getInstance()!!


    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.DAMAGE_FLOATERS))
                        
                                    {
                                    damageFloaters= PtsDamageFloaters(buildingLayer)
damageFloatersPaintableInterface= damageFloaters

                                    }
                                
                        else {
                            damageFloaters= DamageFloaters()

                        }
                            



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return damageFloaters
}


                @Throws(Exception::class)
            
    open fun getHealthBar(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true
: Paintable{
    //var buildingLayer = buildingLayer

    var healthBar: Paintable = NullPaintable.getInstance()!!


    
                        if(Features.getInstance()!!.isFeature(GameFeatureFactory.getInstance()!!.HEALTH_BARS))
                        
                                    {
                                    healthBar= HealthBar(buildingLayer, buildingLayer!!.getHealthInterface(), HealthBarTwodAnimation(buildingLayer as AllBinaryLayer, BasicHudFactory.getInstance()!!.BOTTOMLEFT),  -1)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return healthBar
}


    open fun getHashtable()
        //nullable = true from not(false or (false and true)) = true
: Hashtable<Any, Any>{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return Hashtable<Any, Any>()
}


    open fun getTrackingEvent(buildingLayer: BuildingLayer)
        //nullable = true from not(false or (false and false)) = true
: TrackingEvent{
    //var buildingLayer = buildingLayer



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return TrackingEvent(buildingLayer)
}


}
                
            

