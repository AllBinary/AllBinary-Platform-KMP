
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
        package org.allbinary.business.installer




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import org.allbinary.business.init.db.DatabaseConnectionInfoInterface
import org.allbinary.business.init.db.InitDbHelperFactory
import org.allbinary.logic.system.security.licensing.AbeClientInformationInterface
import org.allbinary.logic.system.security.licensing.LicensingException

open public class DynamicInitDb : InitDb {
        
public constructor (abeClientInformation: AbeClientInformationInterface){
    //var abeClientInformation = abeClientInformation
this.setHelper(InitDbHelperFactory.getInstance(abeClientInformation))
}

public constructor (abeClientInformation: AbeClientInformationInterface, databaseConnectionInfoInterface: DatabaseConnectionInfoInterface){
    //var abeClientInformation = abeClientInformation
var databaseConnectionInfoInterface = databaseConnectionInfoInterface
this.setHelper(InitDbHelperFactory.getInstance(abeClientInformation, databaseConnectionInfoInterface))
}


}
                
            

