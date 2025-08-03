
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
        package org.allbinary.game.score



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.io.ByteArrayInputStream
import java.io.DataInputStream
import java.io.EOFException
import java.io.IOException
import java.util.Hashtable
import javax.microedition.rms.RecordComparator
import javax.microedition.rms.RecordEnumeration
import javax.microedition.rms.RecordStore
import javax.microedition.rms.RecordStoreException
import javax.microedition.rms.RecordStoreNotFoundException
import org.allbinary.game.GameInfo
import org.allbinary.game.configuration.persistance.NullRecordComparator
import org.allbinary.game.configuration.persistance.NullRecordFilter
import org.allbinary.game.configuration.persistance.NullRecordStore
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.communication.log.PreLogUtil
import org.allbinary.logic.string.StringMaker
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.persistance.PlatformRecordIdUtil
import org.allbinary.string.CommonSeps
import org.allbinary.string.CommonStrings
import org.allbinary.util.BasicArrayList

open public class RecordStoreHighScores : HighScores {
        

        companion object {


    private val hashTable: Hashtable<Any, Any> = Hashtable<Any, Any>()

open fun getInstance(abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo, highScoreName: String, heading: String, columnTwoHeading: String, recordComparatorInterface: RecordComparator)
        //nullable =  from not(true or (false and false)) = 
: HighScores{

                    var abeClientInformation = abeClientInformation


                    var gameInfo = gameInfo


                    var highScoreName = highScoreName


                    var heading = heading


                    var columnTwoHeading = columnTwoHeading


                    var recordComparatorInterface = recordComparatorInterface

    var highScores: HighScores = hashTable!!.get(highScoreName as Object) as HighScores


    
                        if(highScores == 
                                    null
                                )
                        
                                    {
                                    highScores= RecordStoreHighScores(abeClientInformation, gameInfo, highScoreName, heading, columnTwoHeading, recordComparatorInterface)
hashTable!!.put(highScores!!.getName(), highScores)

                                    }
                                



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return highScores
}



        }
            
    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private val platformRecordIdUtil: PlatformRecordIdUtil = PlatformRecordIdUtil.getInstance()!!
            

    private val RECORD_ID: String = "_HS"

    private val MAXHIGHSCORES: Int = 100

    private val gameInfo: GameInfo

    private val abeClientInformation: AbeClientInformationInterface

    private val recordComparatorInterface: RecordComparator
private constructor        (abeClientInformation: AbeClientInformationInterface, gameInfo: GameInfo, name: String, heading: String, columnTwoHeading: String, recordComparatorInterface: RecordComparator)                        

                            : super(name, heading, columnTwoHeading){

                    var abeClientInformation = abeClientInformation


                    var gameInfo = gameInfo


                    var name = name


                    var heading = heading


                    var columnTwoHeading = columnTwoHeading


                    var recordComparatorInterface = recordComparatorInterface


                            //For kotlin this is before the body of the constructor.
                    
this.abeClientInformation= abeClientInformation
this.gameInfo= gameInfo
this.recordComparatorInterface= recordComparatorInterface
this.load()
}


open fun getRecordId(abeClientInformation: AbeClientInformationInterface)
        //nullable = true from not(false or (false and false)) = true
: String{

                    var abeClientInformation = abeClientInformation



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return platformRecordIdUtil!!.getRecordId(abeClientInformation, StringMaker().
                            append(CommonSeps.getInstance()!!.UNDERSCORE)!!.append(this.getName())!!.append(RECORD_ID)!!.toString())
}

override fun addHighScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true
{

                    var newHighScore = newHighScore

    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            logUtil!!.put(StringMaker().
                            append(
                            "Adding HighScore: ")!!.append(newHighScore!!.getScore())!!.toString(), this, commonStrings!!.ADD)

    
                        if(this.isTooManyHighScores())
                        
                                    {
                                    logUtil!!.put(
                            "Removing Lowest Score", this, commonStrings!!.ADD)
this.removeLowestHighScore()

                                    }
                                
recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)

    var highScoreBytes: ByteArray = newHighScore!!.getAsBytes()!!
            


    var recordId: Int = recordStore!!.addRecord(highScoreBytes, 0, highScoreBytes!!.size)!!
            

this.load()
} catch(e: RecordStoreException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.ADD, e)
}
 catch(e: IOException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.ADD, e)
}
 catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.ADD, e)
}

         finally {
            
        try {
            
    
                        if(recordStore != 
                                    null
                                )
                        
                                    {
                                    PreLogUtil.put(
                            "Closing RecordStore", this, commonStrings!!.ADD)
recordStore!!.closeRecordStore()

                                    }
                                
} catch(e: RecordStoreException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.ADD, e)
}


         }
        
}


open fun removeLowestHighScore()
        //nullable = true from not(false or (false and true)) = true
{
    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)

    var recordEnum: RecordEnumeration = recordStore!!.enumerateRecords(NullRecordFilter.NULL_RECORD_FILTER, NullRecordComparator.NULL_RECORD_COMPARATOR, true)!!
            


    var scoreComparator: ScoreComparator = (this.recordComparatorInterface as ScoreComparator)


    var bestHighScore: HighScore = HighScore( -1, 
                            "none", GameInfo.NONE, scoreComparator!!.getBestScore())


    var recordAsBytes: ByteArray


    var byteArrayInputStream: ByteArrayInputStream


    var inputStream: DataInputStream


        while(recordEnum!!.hasNextElement())
        {
    var id: Int = recordEnum!!.nextRecordId()!!
            

recordAsBytes= recordStore!!.getRecord(id)

    
                        if(recordAsBytes != 
                                    null
                                )
                        
                                    {
                                    byteArrayInputStream= ByteArrayInputStream(recordAsBytes)
inputStream= DataInputStream(byteArrayInputStream)

    var name: String = inputStream!!.readUTF()!!
            


    var nextScore: Long = inputStream!!.readLong()!!
            


    var nextCurrentHighScore: HighScore = HighScore(id, name, GameInfo.NONE, nextScore)


    
                        if(this.recordComparatorInterface!!.compare(nextCurrentHighScore!!.getAsBytes(), bestHighScore!!.getAsBytes()) == RecordComparator.FOLLOWS)
                        
                                    {
                                    bestHighScore= nextCurrentHighScore

                                    }
                                

                                    }
                                
}


    
                        if(bestHighScore!!.getId() !=  -1)
                        
                                    {
                                    logUtil!!.put(StringMaker().
                            append(
                            "Removing Lowest HighScore: ")!!.append(bestHighScore!!.getScore())!!.toString(), this, commonStrings!!.LOAD)
recordStore!!.deleteRecord(bestHighScore!!.getId())

                                    }
                                
} catch(e: RecordStoreException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "removeLowestHighScore", e)
}
 catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "removeLowestHighScore", e)
}

         finally {
            
        try {
            
    
                        if(recordStore != 
                                    null
                                )
                        
                                    {
                                    PreLogUtil.put(
                            "Closing RecordStore", this, 
                            "removeLowestHighScore")
recordStore!!.closeRecordStore()

                                    }
                                
} catch(e: RecordStoreException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "removeLowestHighScore", e)
}


         }
        
}


open fun load()
        //nullable = true from not(false or (false and true)) = true
{
    var recordStore: RecordStore = NullRecordStore.NULL_RECORD_STORE


        try {
            recordStore= RecordStore.openRecordStore(this.getRecordId(abeClientInformation), true)
this.setList(BasicArrayList())

    var recordEnum: RecordEnumeration = recordStore!!.enumerateRecords(NullRecordFilter.NULL_RECORD_FILTER, NullRecordComparator.NULL_RECORD_COMPARATOR, true)!!
            


    var recordAsBytes: ByteArray


    var byteArrayInputStream: ByteArrayInputStream


    var inputStream: DataInputStream


        while(recordEnum!!.hasNextElement())
        {
    var id: Int = recordEnum!!.nextRecordId()!!
            

recordAsBytes= recordStore!!.getRecord(id)

    
                        if(recordAsBytes != 
                                    null
                                )
                        
                                    {
                                    byteArrayInputStream= ByteArrayInputStream(recordAsBytes)
inputStream= DataInputStream(byteArrayInputStream)

        try {
            
    var name: String = inputStream!!.readUTF()!!
            


    var score: Long = inputStream!!.readLong()!!
            


    var newHighScore: HighScore = HighScore(id, name, GameInfo.NONE, score)


    var list: BasicArrayList = this.getList()!!
            


    var size: Int = list!!.size()!!
            


    var lastIndex: Int = size





                        for (index in 0 until size)


        {
    var highScore: HighScore = list!!.objectArray[index]!! as HighScore


    
                        if(this.recordComparatorInterface!!.compare(newHighScore!!.getAsBytes(), highScore!!.getAsBytes()) == RecordComparator.PRECEDES)
                        
                                    {
                                    lastIndex= index
break;

                    

                                    }
                                
}

list!!.add(lastIndex, newHighScore)
} catch(e: EOFException)
            {logUtil!!.put(
                            "EOF", this, commonStrings!!.LOAD, e)



                            throw e
}


                                    }
                                
}

} catch(e: RecordStoreNotFoundException)
            {logUtil!!.put(
                            "No High Scores", this, commonStrings!!.LOAD, e)
}
 catch(e: RecordStoreException)
            {logUtil!!.put(commonStrings!!.UNKNOWN, this, commonStrings!!.LOAD, e)
}
 catch(e: IOException)
            {logUtil!!.put(commonStrings!!.UNKNOWN, this, commonStrings!!.LOAD, e)
}
 catch(e: Exception)
            {logUtil!!.put(commonStrings!!.UNKNOWN, this, commonStrings!!.LOAD, e)
}

         finally {
            
        try {
            
    
                        if(recordStore != 
                                    null
                                )
                        
                                    {
                                    PreLogUtil.put(
                            "Closing RecordStore", this, commonStrings!!.LOAD)
recordStore!!.closeRecordStore()

                                    }
                                
} catch(e: RecordStoreException)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.LOAD, e)
}


         }
        
}


open fun isTooManyHighScores()
        //nullable = true from not(false or (false and true)) = true
: Boolean{
    
                        if(this.getList() != 
                                    null
                                 && this.getList()!!.size() < MAXHIGHSCORES)
                        
                                    {
                                    


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false

                                    }
                                
                        else {
                            logUtil!!.put(StringMaker().
                            append(
                            "HighScores RecordStore Max Reached: ")!!.append(this.MAXHIGHSCORES)!!.toString(), this, 
                            "isTooManyHighScores")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                        }
                            
}


                @Throws(Exception::class)
            override fun isBestScore(newHighScore: HighScore)
        //nullable = true from not(false or (false and false)) = true
: Boolean{

                    var newHighScore = newHighScore

        try {
            
    
                        if(!this.isTooManyHighScores())
                        
                                    {
                                    logUtil!!.put(
                            "Slot Available for a High Score", this, 
                            "isBestScore")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
                        else {
                            
    var list: BasicArrayList = this.getList()!!
            


    var size: Int = list!!.size()!!
            





                        for (index in 0 until size)


        {
    var highScore: HighScore = list!!.objectArray[index]!! as HighScore


    
                        if(recordComparatorInterface!!.compare(newHighScore!!.getAsBytes(), highScore!!.getAsBytes()) == RecordComparator.FOLLOWS)
                        
                                    {
                                    logUtil!!.put(
                            "Obtained a High Score", this, 
                            "isBestScore")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return true

                                    }
                                
}


                        }
                            
logUtil!!.put(
                            "Not a High Score", this, 
                            "isBestScore")



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return false
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, commonStrings!!.ADD, e)



                            throw e
}

}

override fun toString()
        //nullable =  from not(false or (true and true)) = 
: String{
    var stringBuffer: StringMaker = StringMaker()

stringBuffer!!.append(super.toString())

    var list: BasicArrayList = this.getList()!!
            


    var size: Int = list!!.size()!!
            





                        for (index in 0 until size)


        {
    var highScore: HighScore = list!!.objectArray[index]!! as HighScore

stringBuffer!!.append(highScore!!.getScoreString())
stringBuffer!!.append(CommonSeps.getInstance()!!.COMMA_SEP)
}




                        //if statement needs to be on the same line and ternary does not work the same way.
                        return stringBuffer!!.toString()
}


}
                
            

