
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
        package org.allbinary.business.category.store.theme




        import java.lang.Object        
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import java.util.Vector
import org.allbinary.business.category.CategoryInterface
import org.allbinary.data.tables.TableMappingInterface
import org.allbinary.logic.control.validate.ValidationInterface
import org.allbinary.logic.visual.theme.ThemeValidation
import org.allbinary.logic.visual.transform.info.CompositeTransformInfoInterface

interface StoreThemeCategoryInterface : CategoryInterface, TableMappingInterface, ValidationInterface, CompositeTransformInfoInterface {
        

    open fun addTheme(themeValidation: ThemeValidation)
        //nullable = true from not(false or (false and false)) = true


    open fun getThemes()
        //nullable = true from not(false or (false and true)) = true
: Vector

}
                
            

