
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
        package org.allbinary.graphics.j2me.workarea.properties



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
import javax.swing

open public class PropertiesJPanel : swing.JPanel {
        
public constructor        (){initComponents()
}


open fun set(panel: JPanel)
        //nullable = true from not(false or (false and false)) = true
{

                    var panel = panel
workAreaPropertiesJPanel!!.add(panel)
this.repaint()
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{workAreaPropertiesJPanel= JPanel()
modifierJPanel= JPanel()
copyVerticalJButton= JButton()
copyHorizontalJButton= JButton()
rotateJPanel= JPanel()
rotateJButton= JButton()
angleJTextField= JTextField()
jPanel7= JPanel()
upJButton= JButton()
downJButton= JButton()
jPanel8= JPanel()
leftJButton= JButton()
rightJButton= JButton()
setLayout(GridLayout(2, 1))
workAreaPropertiesJPanel!!.setLayout(GridLayout())
add(workAreaPropertiesJPanel)
modifierJPanel!!.setLayout(GridLayout(6, 0))
copyVerticalJButton!!.setFont(Font(
                            "Dialog", 0, 10))
copyVerticalJButton!!.setText(
                            "Copy Vertical")
modifierJPanel!!.add(copyVerticalJButton)
copyHorizontalJButton!!.setFont(Font(
                            "Dialog", 0, 10))
copyHorizontalJButton!!.setText(
                            "Copy Horizontal")
modifierJPanel!!.add(copyHorizontalJButton)
rotateJPanel!!.setLayout(GridLayout(1, 2))
rotateJButton!!.setFont(Font(
                            "Dialog", 0, 10))
rotateJButton!!.setText(
                            "Rotate")
rotateJPanel!!.add(rotateJButton)
angleJTextField!!.setText(
                            "Angle")
rotateJPanel!!.add(angleJTextField)
modifierJPanel!!.add(rotateJPanel)
jPanel7!!.setLayout(GridLayout(1, 2))
upJButton!!.setFont(Font(
                            "Dialog", 0, 10))
upJButton!!.setText(
                            "Up")
jPanel7!!.add(upJButton)
downJButton!!.setFont(Font(
                            "Dialog", 0, 10))
downJButton!!.setText(
                            "Down")
jPanel7!!.add(downJButton)
modifierJPanel!!.add(jPanel7)
jPanel8!!.setLayout(GridLayout(1, 2))
leftJButton!!.setFont(Font(
                            "Dialog", 0, 10))
leftJButton!!.setText(
                            "Left")
jPanel8!!.add(leftJButton)
rightJButton!!.setFont(Font(
                            "Dialog", 0, 10))
rightJButton!!.setText(
                            "Right")
jPanel8!!.add(rightJButton)
modifierJPanel!!.add(jPanel8)
add(modifierJPanel)
}


    private var rotateJButton: JButton

    private var copyVerticalJButton: JButton

    private var leftJButton: JButton

    private var rotateJPanel: JPanel

    private var angleJTextField: JTextField

    private var workAreaPropertiesJPanel: JPanel

    private var modifierJPanel: JPanel

    private var upJButton: JButton

    private var jPanel8: JPanel

    private var downJButton: JButton

    private var jPanel7: JPanel

    private var rightJButton: JButton

    private var copyHorizontalJButton: JButton

}
                
            

