
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
        package org.allbinary.business.user.commerce.inventory.item.download



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Calendar
import java.util.HashMap
import java.util.Vector
import org.allbinary.business.entry.EntryData
import org.allbinary.business.user.commerce.inventory.item.BasicItemData
import org.allbinary.data.generator.ProductIdGenerator
import org.allbinary.logic.string.StringUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.time.TimeUtil

open public class DownloadableItem
            : Object
         {
        

    private val id: String

    private val basicItemId: String

    private val enabled: String

    private val system: String

    private val platform: String

    private val specialName: String

    private val version: String

    private val changes: String

    private val licenseFile: String

    private val file: String

    private val size: Long

    private val validTime: Long

    private val retries: String
public constructor        (id: String)
            : super()
        {

                    var id = id

    var EMPTY_STRING: String = StringUtil.getInstance()!!.EMPTY_STRING

this.id= ProductIdGenerator().
                            getNext()
this.basicItemId= id
this.enabled= EntryData.getInstance()!!.YES
this.system= "Java"
this.platform= "Android"
this.specialName= EMPTY_STRING
this.version= EMPTY_STRING
this.changes= EMPTY_STRING
this.licenseFile= EMPTY_STRING
this.file= EMPTY_STRING
this.size= .concatToString()

                                
this.validTime= .concatToString()

                                
this.retries= EMPTY_STRING
}

public constructor        (hashMap: HashMap<Any, Any>)
            : super()
        {

                    var hashMap = hashMap
this.id= hashMap!!.get(DownloadItemData.ID) as String
this.basicItemId= hashMap!!.get(BasicItemData.ID) as String
this.enabled= hashMap!!.get(EntryData.getInstance()!!.ENABLE) as String
this.system= hashMap!!.get(DownloadItemData.SYSTEM) as String
this.platform= hashMap!!.get(DownloadItemData.PLATFORM) as String
this.specialName= hashMap!!.get(DownloadItemData.SPECIAL_NAME) as String
this.version= hashMap!!.get(DownloadItemData.VERSION) as String
this.changes= hashMap!!.get(DownloadItemData.CHANGES) as String
this.licenseFile= hashMap!!.get(DownloadItemData.LICENSE_FILE) as String
this.file= hashMap!!.get(DownloadItemData.FILE) as String

    var value: String = hashMap!!.get(DownloadItemData.SIZE) as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(value))
                        
                                    {
                                    this.size= value.concatToString()

                                

                                    }
                                
                        else {
                            this.size= 0 as Long

                        }
                            

    var validTime: String = hashMap!!.get(DownloadItemData.VALID_TIME) as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(validTime))
                        
                                    {
                                    this.validTime= validTime.concatToString()

                                

                                    }
                                
                        else {
                            
    var totalYears: String = hashMap!!.get(DownloadItemData.VALID_TIME_YEARS) as String


    var totalMonths: String = hashMap!!.get(DownloadItemData.VALID_TIME_MONTHS) as String


    var totalDays: String = hashMap!!.get(DownloadItemData.VALID_TIME_DAYS) as String


    var totalHours: String = hashMap!!.get(DownloadItemData.VALID_TIME_HOURS) as String


    var totalMinutes: String = hashMap!!.get(DownloadItemData.VALID_TIME_MINUTES) as String


    var totalSeconds: String = hashMap!!.get(DownloadItemData.VALID_TIME_SECONDS) as String


    var totalTime: Long = TimeUtil.getInstance()!!.getTotalTime(totalYears, totalMonths, totalDays, totalHours, totalMinutes, totalSeconds)!!
            

this.validTime= totalTime as Long

                        }
                            
this.retries= hashMap!!.get(DownloadItemData.RETRIES) as String
}


open fun toVector()
        //nullable = true from not(false or (false and true)) = true
: Vector{
    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = Long(calendar!!.getTimeInMillis()).
                            toString()!!
            


    var values: Vector = Vector()

values!!.add(getId())
values!!.add(this.basicItemId)
values!!.add(this.enabled)
values!!.add(this.getSpecialName())
values!!.add(this.getVersion())
values!!.add(this.getChanges())
values!!.add(this.getSystem())
values!!.add(this.getPlatform())
values!!.add(this.getLicenseFile())
values!!.add(this.getFile())
values!!.add(this.getSize()!!.toString())
values!!.add(this.getValidTime()!!.toString())
values!!.add(this.getRetries())
values!!.add(time)
values!!.add(time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


open fun toHashMap()
        //nullable = true from not(false or (false and true)) = true
: HashMap<Any, Any>{
    var values: HashMap<Any, Any> = HashMap<Any, Any>()

values!!.put(DownloadItemData.ID, this.getId())
values!!.put(BasicItemData.ID, this.basicItemId)
values!!.put(EntryData.getInstance()!!.ENABLE, this.enabled)
values!!.put(DownloadItemData.SYSTEM, this.getSystem())
values!!.put(DownloadItemData.PLATFORM, this.getPlatform())
values!!.put(DownloadItemData.SPECIAL_NAME, this.getSpecialName())
values!!.put(DownloadItemData.VERSION, this.getVersion())
values!!.put(DownloadItemData.CHANGES, this.getChanges())
values!!.put(DownloadItemData.LICENSE_FILE, this.getLicenseFile())
values!!.put(DownloadItemData.FILE, this.getFile())
values!!.put(DownloadItemData.SIZE, this.getSize()!!.toString())
values!!.put(DownloadItemData.VALID_TIME, this.getValidTime()!!.toString())
values!!.put(DownloadItemData.RETRIES, this.getRetries())

    var calendar: Calendar = Calendar.getInstance()!!
            


    var time: String = Long(calendar!!.getTimeInMillis()).
                            toString().toCharArray().concatToString()
                                

values!!.put(EntryData.getInstance()!!.LASTMODIFIED, time)



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return values
}


open fun getId()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return id
}


open fun getSystem()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return system
}


open fun getPlatform()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return platform
}


open fun getSpecialName()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return specialName
}


open fun getVersion()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return version
}


open fun getChanges()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return changes
}


open fun getLicenseFile()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return licenseFile
}


open fun getFile()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return file
}


open fun getSize()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return size
}


open fun getValidTime()
        //nullable = true from not(false or (false and true)) = true
: Long{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return validTime
}


open fun getRetries()
        //nullable = true from not(false or (false and true)) = true
: String{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return retries
}


}
                
            

