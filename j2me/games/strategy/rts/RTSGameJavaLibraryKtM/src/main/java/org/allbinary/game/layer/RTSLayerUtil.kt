
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2003 AllBinary 
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
        package org.allbinary.game.layer




        import java.lang.Object        
        
        import java.lang.Integer
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Hashtable
import org.allbinary.util.BasicArrayList
import org.allbinary.logic.communication.log.LogFactory
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.direction.DirectionFactory
import org.allbinary.game.combat.weapon.WeaponProperties
import org.allbinary.game.identification.BasicGroupFactory
import org.allbinary.game.identification.Group
import org.allbinary.game.part.weapon.BasicWeaponPart
import org.allbinary.logic.string.StringMaker
import org.allbinary.media.graphics.geography.map.BasicGeographicMap
import org.allbinary.media.graphics.geography.map.racetrack.BaseRaceTrackGeographicMap

open public class RTSLayerUtil
            : Object
         {
        

        companion object {
            
    private val instance: RTSLayerUtil = RTSLayerUtil()

open fun getInstance()
        //nullable =  from not(true or (false and true)) = 
: RTSLayerUtil{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return instance
}


        }
            
            //Auto Generated
            public constructor() : super()
            {
            }            
        
    val logUtil: LogUtil = LogUtil.getInstance()!!

open fun createWeaponProperties(weaponProperties: WeaponProperties, currentLevel: Int, lastLevel: Int)
        //nullable = true from not(false or (false and false)) = true
: WeaponProperties{

                    var weaponProperties = weaponProperties


                    var currentLevel = currentLevel


                    var lastLevel = lastLevel

    var reloadTime: Long = weaponProperties!!.getReloadTime()!!


    
                        if(lastLevel > currentLevel)
                        
                                    {
                                    reloadTime= reloadTime +50

                                    }
                                
                             else 
    
                        if(lastLevel < currentLevel)
                        
                                    {
                                    reloadTime= reloadTime -50

                                    }
                                

    var newWeaponProperties: WeaponProperties = WeaponProperties(reloadTime, weaponProperties!!.getTargetingTime(), weaponProperties!!.getSpeed()!!.getUnscaled().toInt(), weaponProperties!!.getDamage() /lastLevel *currentLevel, weaponProperties!!.getDissipation())




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return newWeaponProperties
}


open fun downgrade(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsLayer = rtsLayer
rtsLayer!!.setLevel(rtsLayer!!.getLevel() -1)

    var partInterface: BasicWeaponPart





                        for (index in rtsLayer!!.getPartInterfaceArray()!!.length  - 1  downTo 0)


        {partInterface= rtsLayer!!.getPartInterfaceArray()[index]!! as BasicWeaponPart
partInterface!!.setWeaponProperties(this.createWeaponProperties(partInterface!!.getWeaponProperties(), rtsLayer!!.getLevel(), rtsLayer!!.getLevel() +1))
}

rtsLayer!!.select()
}


open fun upgrade(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{

                    var rtsLayer = rtsLayer
rtsLayer!!.setLevel(rtsLayer!!.getLevel() +1)

    var partInterface: BasicWeaponPart





                        for (index in rtsLayer!!.getPartInterfaceArray()!!.length  - 1  downTo 0)


        {partInterface= rtsLayer!!.getPartInterfaceArray()[index]!! as BasicWeaponPart
partInterface!!.setWeaponProperties(this.createWeaponProperties(partInterface!!.getWeaponProperties(), rtsLayer!!.getLevel(), rtsLayer!!.getLevel() -1))
}

rtsLayer!!.select()
}


    private val MAX_RELOAD_TIME: Long = Integer.MAX_VALUE /100000

open fun getCostExponential(cost: Long)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var cost = cost



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return ((cost *cost *cost) /(cost *1000)).toInt()
}


open fun getWeaponPropertiesCost(weaponProperties: WeaponProperties)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var weaponProperties = weaponProperties

    var cost: Int = (weaponProperties!!.getDamage() +weaponProperties!!.getRange() +((MAX_RELOAD_TIME /weaponProperties!!.getReloadTime()) shr 1)).toInt()

cost= this.getCostExponential(cost)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return cost
}


open fun getCost(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var rtsLayer = rtsLayer

    var total: Int = 0


    var partInterface: BasicWeaponPart


    var weaponProperties: WeaponProperties





                        for (index in rtsLayer!!.getPartInterfaceArray()!!.length -1 downTo 0)


        {partInterface= rtsLayer!!.getPartInterfaceArray()[index]!! as BasicWeaponPart
weaponProperties= partInterface!!.getWeaponProperties()
total += this.getWeaponPropertiesCost(weaponProperties)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return total
}


open fun getDowngradeCost(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var rtsLayer = rtsLayer

    var downgradeCost: Int = 0


    var partInterface: BasicWeaponPart


    var weaponProperties: WeaponProperties


    var downgradeWeaponCost: Int= 0


    var currentWeaponCost: Int= 0





                        for (index in rtsLayer!!.getPartInterfaceArray()!!.length -1 downTo 0)


        {partInterface= rtsLayer!!.getPartInterfaceArray()[index]!! as BasicWeaponPart
weaponProperties= partInterface!!.getWeaponProperties()
downgradeWeaponCost= this.getWeaponPropertiesCost(this.createWeaponProperties(weaponProperties, rtsLayer!!.getLevel() -1, rtsLayer!!.getLevel()))
currentWeaponCost= this.getWeaponPropertiesCost(weaponProperties)
downgradeCost += (currentWeaponCost -downgradeWeaponCost)
}

downgradeCost= downgradeCost *9 /10
logUtil!!.put(StringMaker().
                            append("Total Cost: ")!!.append(downgradeCost)!!.toString(), this, "getDowngradeCost")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return downgradeCost
}


open fun getUpgradeCost(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
: Int{

                    var rtsLayer = rtsLayer

    var upgradeCost: Int = 0


    var partInterface: BasicWeaponPart


    var weaponProperties: WeaponProperties


    var upgradedWeaponCost: Int= 0


    var currentWeaponCost: Int= 0





                        for (index in rtsLayer!!.getPartInterfaceArray()!!.length -1 downTo 0)


        {partInterface= rtsLayer!!.getPartInterfaceArray()[index]!! as BasicWeaponPart
weaponProperties= partInterface!!.getWeaponProperties()
upgradedWeaponCost= this.getWeaponPropertiesCost(this.createWeaponProperties(weaponProperties, rtsLayer!!.getLevel() +1, rtsLayer!!.getLevel()))
currentWeaponCost= this.getWeaponPropertiesCost(weaponProperties)
upgradeCost += (upgradedWeaponCost -currentWeaponCost)
}

logUtil!!.put(StringMaker().
                            append("Total Cost: ")!!.append(upgradeCost)!!.toString(), this, "getUpgradeCost")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return upgradeCost
}


                @Throws(Exception::class)
            
open fun destroyAndClear(list: BasicArrayList)
        //nullable = true from not(false or (false and false)) = true
{

                    var list = list

    var rtsLayer: RTSLayer





                        for (index in list.size() -1 downTo 0)


        {rtsLayer= list.get(index) as RTSLayer
rtsLayer!!.setDestroyed(true)
}

list.clear()
}


open fun createFakeRTSLayerHashtable(baseRaceTrackGeographicMap: BaseRaceTrackGeographicMap)
        //nullable = true from not(false or (false and false)) = true
: Hashtable<Any, Any>{

                    var baseRaceTrackGeographicMap = baseRaceTrackGeographicMap

    var hashtable: Hashtable<Any, Any> = Hashtable<Any, Any>()


    var layerManager: FakeLayerManager = FakeLayerManager(
                            null)

layerManager!!.setGeographicMapInterface(arrayOf(baseRaceTrackGeographicMap))
hashtable.put(AllBinaryGameLayerManager.ID, layerManager)
hashtable.put(DirectionFactory.getInstance()!!.NAME, DirectionFactory.getInstance()!!.LEFT)
hashtable.put(Group.ID, BasicGroupFactory.getInstance()!!.NONE_ARRAY)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return hashtable
}


}
                
            

