
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
import org.allbinary.game.layer.AllBinaryGameLayer

open public class AdvancedPlayerOwnedRTSLayers : PlayerOwnedRTSLayers {
        

            //Auto Generated
            public constructor() : super()
            {
            }            
        
    private val unitsList: BasicArrayList = BasicArrayList()

    private val waypointsList: BasicArrayList = BasicArrayList()

    private val buildingList: BasicArrayList = BasicArrayList()

    private val baseList: BasicArrayList = BasicArrayList()

    private val garrisonList: BasicArrayList = BasicArrayList()

    private val houseList: BasicArrayList = BasicArrayList()

    private val labList: BasicArrayList = BasicArrayList()

    private val factoryList: BasicArrayList = BasicArrayList()

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
                        return unitsList
}


open fun getWaypointsList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return waypointsList
}


open fun getBaseList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return baseList
}


open fun getGarrisonList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return garrisonList
}


open fun getHouseList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return houseList
}


open fun getLabList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return labList
}


open fun getFactoryList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return factoryList
}


open fun getTotalBuildings()
        //nullable = true from not(false or (false and true)) = true
: Int{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return baseList!!.size() +garrisonList!!.size() +houseList!!.size() +labList!!.size() +factoryList!!.size()
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
stringBuffer!!.append(
                            " Bases: ")
stringBuffer!!.append(this.getBaseList()!!.size())
stringBuffer!!.append(
                            " Factory: ")
stringBuffer!!.append(this.getFactoryList()!!.size())
stringBuffer!!.append(
                            " Garrison: ")
stringBuffer!!.append(this.getGarrisonList()!!.size())
stringBuffer!!.append(
                            " Labs: ")
stringBuffer!!.append(this.getLabList()!!.size())
stringBuffer!!.append(
                            " Houses: ")
stringBuffer!!.append(this.getHouseList()!!.size())
stringBuffer!!.append(
                            " Waypoints: ")
stringBuffer!!.append(this.getWaypointsList()!!.size())
stringBuffer!!.append(
                            " Units: ")
stringBuffer!!.append(this.getUnitsList()!!.size())



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


open fun getBuildingList()
        //nullable = true from not(false or (false and true)) = true
: BasicArrayList{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return buildingList
}


}
                
            

