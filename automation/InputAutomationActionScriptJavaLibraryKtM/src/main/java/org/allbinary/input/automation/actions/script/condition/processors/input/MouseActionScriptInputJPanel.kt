
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
        package org.allbinary.input.automation.actions.script.condition.processors.input



        import java.lang.Integer
        import java.lang.Math
        import java.lang.Object
        import java.lang.System
        
        
        import kotlin.Array
        import kotlin.reflect.KClass
        
        import kotlin.experimental.xor
        
import java.awt.event.InputEvent
import javax.swing
import org.allbinary.input.automation.robot.InputRobot
import org.allbinary.input.automation.robot.InputRobotFactory
import org.allbinary.input.automation.robot.TempInputRobotNames
import org.allbinary.logic.communication.log.LogUtil
import org.allbinary.logic.string.StringValidationUtil
import org.allbinary.string.CommonLabels
import org.allbinary.string.CommonPhoneStrings
import org.allbinary.string.CommonStrings

open public class MouseActionScriptInputJPanel : swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!
            

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!
            

    private var mouseActionScriptInputInterface: MouseActionScriptInputInterface
public constructor        (mouseActionScriptInputInterface: MouseActionScriptInputInterface){

                    var mouseActionScriptInputInterface = mouseActionScriptInputInterface
logUtil!!.put(CommonLabels.getInstance()!!.START +mouseActionScriptInputInterface, this, commonStrings!!.CONSTRUCTOR)
initComponents()
this.mouseActionScriptInputInterface= mouseActionScriptInputInterface

    var defaultComboBoxModel: DefaultComboBoxModel = DefaultComboBoxModel()

defaultComboBoxModel!!.addElement(TempInputRobotNames.LOW_NAME)
defaultComboBoxModel!!.addElement(TempInputRobotNames.SYS_NAME)
defaultComboBoxModel!!.addElement(InputRobot.NAME)
this.inputAutomationTypeJComboBox!!.setModel(defaultComboBoxModel)
this.set()
}


open fun set()
        //nullable = true from not(false or (false and true)) = true
{
    var inputTypeComboBoxModel: ComboBoxModel = this.inputAutomationTypeJComboBox!!.getModel()!!
            

inputTypeComboBoxModel!!.setSelectedItem(this.mouseActionScriptInputInterface!!.getInputRobotInterface()!!.getName())

    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON1_MASK) != 0)
                        
                                    {
                                    this.button1JCheckBox!!.setSelected(true)

                                    }
                                
                        else {
                            this.button1JCheckBox!!.setSelected(false)

                        }
                            

    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON2_MASK) != 0)
                        
                                    {
                                    this.button2JCheckBox!!.setSelected(true)

                                    }
                                
                        else {
                            this.button2JCheckBox!!.setSelected(false)

                        }
                            
this.mouseDelayJTextField!!.setText(getTime.toString())
this.mouseXJTextField!!.setText(x.toString())
this.mouseYJTextField!!.setText(y.toString())
this.mouseActionScriptInputInterface!!.log()
}


                @Throws(Exception::class)
            
open fun updateInputType()
        //nullable = true from not(false or (false and true)) = true
{
    var comboBoxModel: ComboBoxModel = this.inputAutomationTypeJComboBox!!.getModel()!!
            


    var selectedItem: String = comboBoxModel!!.getSelectedItem() as String


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(selectedItem))
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setInputRobotInterface(InputRobotFactory.getInstance()!!.get(selectedItem))

                                    }
                                
}


                @Throws(Exception::class)
            
open fun update()
        //nullable = true from not(false or (false and true)) = true
{this.updateInputType()
this.mouseActionScriptInputInterface!!.setTime(getText.valueOf())
logUtil!!.put("Button State: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, 
                            "update")

    
                        if(this.button1JCheckBox!!.isSelected())
                        
                                    {
                                    
    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON1_MASK) == 0)
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setButtonClicks(this.mouseActionScriptInputInterface!!.getButtonClicks() or InputEvent.BUTTON1_MASK)
logUtil!!.put("Button 1 Selected: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, 
                            "update")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON1_MASK) != 0)
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setButtonClicks(this.mouseActionScriptInputInterface!!.getButtonClicks() xor InputEvent.BUTTON1_MASK)
logUtil!!.put("Button 1 Deselected: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, 
                            "update")

                                    }
                                

                        }
                            

    
                        if(this.button2JCheckBox!!.isSelected())
                        
                                    {
                                    
    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON2_MASK) == 0)
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setButtonClicks(this.mouseActionScriptInputInterface!!.getButtonClicks() or InputEvent.BUTTON2_MASK)
logUtil!!.put("Button 2 Selected: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, 
                            "update")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON2_MASK) != 0)
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setButtonClicks(this.mouseActionScriptInputInterface!!.getButtonClicks() xor InputEvent.BUTTON2_MASK)
logUtil!!.put("Button 2 Deselected: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, 
                            "update")

                                    }
                                

                        }
                            

    var mouseXString: String = this.mouseXJTextField!!.getText()!!
            


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(mouseXString) && StringValidationUtil.getInstance()!!.isNumber(mouseXString))
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.getPoint()!!.x= Integer.parseInt(mouseXString)

                                    }
                                

    var mouseYString: String = this.mouseYJTextField!!.getText()!!
            


    
                        if(!StringValidationUtil.getInstance()!!.isEmpty(mouseYString) && StringValidationUtil.getInstance()!!.isNumber(mouseYString))
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.getPoint()!!.y= Integer.parseInt(mouseYString)

                                    }
                                
this.mouseActionScriptInputInterface!!.log()
}


open fun getMouseActionJDialog()
        //nullable = true from not(false or (false and true)) = true
: JDialog{


                        //if statement needs to be on the same line and ternary does not work the same way.
                        return mouseActionJDialog
}


open fun setMouseActionJDialog(mouseActionJDialog: JDialog)
        //nullable = true from not(false or (false and false)) = true
{

                    var mouseActionJDialog = mouseActionJDialog
this.mouseActionJDialog= mouseActionJDialog
}


open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{mouseActionJDialog= JDialog()
titleJLabel= JLabel()
okJButton= JButton()
jLabel2= JLabel()
jLabel3= JLabel()
button1JCheckBox= JCheckBox()
button2JCheckBox= JCheckBox()
jLabel4= JLabel()
mouseXJTextField= JTextField()
jLabel5= JLabel()
mouseYJTextField= JTextField()
inputTypeJLabel= JLabel()
inputAutomationTypeJComboBox= JComboBox()
jLabel6= JLabel()
mouseDelayJTextField= JTextField()
mouseActionJButton= JButton()
jLabel1= JLabel()
mouseActionJDialog!!.setMinimumSize(Dimension(275, 185))
titleJLabel!!.setText(
                            "Mouse Input Options")
okJButton!!.setText(
                            "OK")
okJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
jLabel2!!.setText(
                            "Buttons:")
jLabel3!!.setText(
                            "Move To:")
button1JCheckBox!!.setText(CommonPhoneStrings.getInstance()!!.ONE)
button1JCheckBox!!.setBorder(javax!!.swing!!.BorderFactory.createEmptyBorder(0, 0, 0, 0))
button1JCheckBox!!.setMargin(Insets(0, 0, 0, 0))
button2JCheckBox!!.setText(CommonPhoneStrings.getInstance()!!.TWO)
button2JCheckBox!!.setBorder(javax!!.swing!!.BorderFactory.createEmptyBorder(0, 0, 0, 0))
button2JCheckBox!!.setMargin(Insets(0, 0, 0, 0))
button2JCheckBox!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
button2JCheckBoxActionPerformed(evt)
}

                                }
                            )
jLabel4!!.setText(
                            "x:")
mouseXJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
jLabel5!!.setText(
                            "y:")
mouseYJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
inputTypeJLabel!!.setText(
                            "Input Type:")
jLabel6!!.setText(
                            "Delay:")
mouseDelayJTextField!!.setText(
                            "100")

    var mouseActionJDialogLayout: GroupLayout = GroupLayout(mouseActionJDialog!!.getContentPane())

mouseActionJDialog!!.getContentPane()!!.setLayout(mouseActionJDialogLayout)
mouseActionJDialogLayout!!.setHorizontalGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(inputTypeJLabel)!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING, mouseActionJDialogLayout!!.createSequentialGroup()!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING, mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(jLabel2)!!.addGap(25, 25, 25))!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel3)!!.addComponent(jLabel6))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)))!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(mouseDelayJTextField, javax!!.swing!!.GroupLayout.Alignment.TRAILING, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addGap(45, 45, 45))!!.addGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING, mouseActionJDialogLayout!!.createSequentialGroup()!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(inputAutomationTypeJComboBox, 0, 154, Short.MAX_VALUE))!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(button1JCheckBox)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(button2JCheckBox))!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.TRAILING)!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(okJButton))!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)!!.addComponent(mouseXJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 59, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel5)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(mouseYJTextField, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))))!!.addContainerGap()))
mouseActionJDialogLayout!!.setVerticalGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(inputTypeJLabel)!!.addComponent(inputAutomationTypeJComboBox, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel2, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, 15, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(button1JCheckBox)!!.addComponent(button2JCheckBox)))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel6)!!.addComponent(mouseDelayJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel3)!!.addComponent(jLabel4)!!.addComponent(jLabel5)!!.addComponent(mouseYJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE)!!.addComponent(mouseXJTextField, javax!!.swing!!.GroupLayout.PREFERRED_SIZE, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, javax!!.swing!!.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, javax!!.swing!!.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(okJButton)!!.addContainerGap()))
setMinimumSize(Dimension(100, 0))
mouseActionJButton!!.setText(
                            "Edit")
mouseActionJButton!!.addActionListener(object: ActionListener()
                                {
                                
open override fun actionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
mouseActionJButtonActionPerformed(evt)
}

                                }
                            )
jLabel1!!.setText(
                            "Mouse:")

    var layout: GroupLayout = GroupLayout(this)

this.setLayout(layout)
layout!!.setHorizontalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax!!.swing!!.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)!!.addComponent(mouseActionJButton)))
layout!!.setVerticalGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.LEADING)!!.addGroup(layout!!.createParallelGroup(javax!!.swing!!.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(mouseActionJButton)))
}


open fun button2JCheckBoxActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
}


open fun okJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt

        try {
            this.update()
this.getMouseActionJDialog()!!.setVisible(false)
} catch(e: Exception)
            {logUtil!!.put(commonStrings!!.EXCEPTION, this, 
                            "okButtonActionPerformed", e)
}

}


open fun mouseActionJButtonActionPerformed(evt: ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{

                    var evt = evt
this.getMouseActionJDialog()!!.setVisible(true)
}


    private var button1JCheckBox: JCheckBox

    private var button2JCheckBox: JCheckBox

    private var inputAutomationTypeJComboBox: JComboBox

    private var inputTypeJLabel: JLabel

    private var jLabel1: JLabel

    private var jLabel2: JLabel

    private var jLabel3: JLabel

    private var jLabel4: JLabel

    private var jLabel5: JLabel

    private var jLabel6: JLabel

    private var mouseActionJButton: JButton

    private var mouseActionJDialog: JDialog

    private var mouseDelayJTextField: JTextField

    private var mouseXJTextField: JTextField

    private var mouseYJTextField: JTextField

    private var okJButton: JButton

    private var titleJLabel: JLabel

}
                
            

