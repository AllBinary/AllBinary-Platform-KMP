
        /*
                *  
                *  AllBinary Open License Version 1 
                *  Copyright (c) 2006 AllBinary 
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
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.logic.string.StringMaker
import org.allbinary.util.BasicArrayList
import org.allbinary.util.BasicArrayListD

open public class AdvancedPlayerOwnedRTSLayers : PlayerOwnedRTSLayers {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val unitsList: BasicArrayList = BasicArrayListD()

    private val waypointsList: BasicArrayList = BasicArrayListD()

    private val buildingList: BasicArrayList = BasicArrayListD()

    private val baseList: BasicArrayList = BasicArrayListD()

    private val garrisonList: BasicArrayList = BasicArrayListD()

    private val houseList: BasicArrayList = BasicArrayListD()

    private val labList: BasicArrayList = BasicArrayListD()

    private val factoryList: BasicArrayList = BasicArrayListD()

    open fun addUnit(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.unitsList!!.add(rtsLayer)
this.rtsLayerList!!.add(rtsLayer)
}


    open fun addWaypoint(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.waypointsList!!.add(rtsLayer)
this.rtsLayerList!!.add(rtsLayer)
}


    open fun addBase(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.baseList!!.add(rtsLayer)
this.buildingList!!.add(rtsLayer)
this.rtsLayerList!!.add(rtsLayer)
}


    open fun addGarrison(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.garrisonList!!.add(rtsLayer)
this.buildingList!!.add(rtsLayer)
this.rtsLayerList!!.add(rtsLayer)
}


    open fun addHouse(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.houseList!!.add(rtsLayer)
this.buildingList!!.add(rtsLayer)
this.rtsLayerList!!.add(rtsLayer)
}


    open fun addLab(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.labList!!.add(rtsLayer)
this.buildingList!!.add(rtsLayer)
this.rtsLayerList!!.add(rtsLayer)
}


    open fun addFactory(rtsLayer: RTSLayer)
        //nullable = true from not(false or (false and false)) = true
{
var rtsLayer = rtsLayer
this.factoryList!!.add(rtsLayer)
this.buildingList!!.add(rtsLayer)
this.rtsLayerList!!.add(rtsLayer)
}


    open fun removeUnit(gameLayer: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
var gameLayer = gameLayer
this.unitsList!!.remove(gameLayer)
this.rtsLayerList!!.remove(gameLayer)
}


    open fun removeWaypoint(gameLayer: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
var gameLayer = gameLayer
this.waypointsList!!.remove(gameLayer)
this.rtsLayerList!!.remove(gameLayer)
}


    open fun getUnitsList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.unitsList
}


    open fun getWaypointsList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.waypointsList
}


    open fun getBaseList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.baseList
}


    open fun getGarrisonList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.garrisonList
}


    open fun getHouseList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.houseList
}


    open fun getLabList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.labList
}


    open fun getFactoryList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.factoryList
}


    open fun getTotalBuildings()
        //nullable = true from not(false or (false and true)) = true
: Int{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.baseList!!.size() +this.garrisonList!!.size() +this.houseList!!.size() +this.labList!!.size() +this.factoryList!!.size()
}


    open fun removeBuilding(layerInterface: AllBinaryGameLayer)
        //nullable = true from not(false or (false and false)) = true
{
var layerInterface = layerInterface
this.buildingList!!.add(layerInterface)

    
                        if(this.getBaseList()!!.remove(layerInterface))
                        
                                    {
                                    this.rtsLayerList!!.remove(layerInterface)

                                    }
                                
                             else 
    
                        if(this.getFactoryList()!!.remove(layerInterface))
                        
                                    {
                                    this.rtsLayerList!!.remove(layerInterface)

                                    }
                                
                             else 
    
                        if(this.getGarrisonList()!!.remove(layerInterface))
                        
                                    {
                                    this.rtsLayerList!!.remove(layerInterface)

                                    }
                                
                             else 
    
                        if(this.getLabList()!!.remove(layerInterface))
                        
                                    {
                                    this.rtsLayerList!!.remove(layerInterface)

                                    }
                                
                             else 
    
                        if(this.getHouseList()!!.remove(layerInterface))
                        
                                    {
                                    this.rtsLayerList!!.remove(layerInterface)

                                    }
                                
}


    override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{

    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString())
stringBuffer!!.append(" Bases: ")
stringBuffer!!.appendint(this.getBaseList()!!.size())
stringBuffer!!.append(" Factory: ")
stringBuffer!!.appendint(this.getFactoryList()!!.size())
stringBuffer!!.append(" Garrison: ")
stringBuffer!!.appendint(this.getGarrisonList()!!.size())
stringBuffer!!.append(" Labs: ")
stringBuffer!!.appendint(this.getLabList()!!.size())
stringBuffer!!.append(" Houses: ")
stringBuffer!!.appendint(this.getHouseList()!!.size())
stringBuffer!!.append(" Waypoints: ")
stringBuffer!!.appendint(this.getWaypointsList()!!.size())
stringBuffer!!.append(" Units: ")
stringBuffer!!.appendint(this.getUnitsList()!!.size())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


    open fun getBuildingList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.buildingList
}


}
                
            

