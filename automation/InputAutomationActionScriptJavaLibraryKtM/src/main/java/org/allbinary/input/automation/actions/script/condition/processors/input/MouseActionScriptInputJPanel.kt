
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




        import java.lang.Object        
        
        import java.lang.Integer
        
        
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

open public class MouseActionScriptInputJPanel : javax.swing.JPanel {
        

    val logUtil: LogUtil = LogUtil.getInstance()!!

    private val commonStrings: CommonStrings = CommonStrings.getInstance()!!

    private var mouseActionScriptInputInterface: MouseActionScriptInputInterface
public constructor (mouseActionScriptInputInterface: MouseActionScriptInputInterface){
    //var mouseActionScriptInputInterface = mouseActionScriptInputInterface
this.logUtil!!.putF(CommonLabels.getInstance()!!.START +mouseActionScriptInputInterface, this, commonStrings!!.CONSTRUCTOR)
this.initComponents()
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
                            
this.mouseDelayJTextField!!.setText(this.mouseActionScriptInputInterface!!.getTime().toString())
this.mouseXJTextField!!.setText(this.mouseActionScriptInputInterface!!.getPoint()!!.x.toString())
this.mouseYJTextField!!.setText(this.mouseActionScriptInputInterface!!.getPoint()!!.y.toString())
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
{
this.updateInputType()
this.mouseActionScriptInputInterface!!.setTime(getText.valueOf())
this.logUtil!!.putF("Button State: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, "update")

    
                        if(this.button1JCheckBox!!.isSelected())
                        
                                    {
                                    
    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON1_MASK) == 0)
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setButtonClicks(this.mouseActionScriptInputInterface!!.getButtonClicks() or InputEvent.BUTTON1_MASK)
this.logUtil!!.putF("Button 1 Selected: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, "update")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON1_MASK) != 0)
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setButtonClicks(this.mouseActionScriptInputInterface!!.getButtonClicks() xor InputEvent.BUTTON1_MASK)
this.logUtil!!.putF("Button 1 Deselected: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, "update")

                                    }
                                

                        }
                            

    
                        if(this.button2JCheckBox!!.isSelected())
                        
                                    {
                                    
    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON2_MASK) == 0)
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setButtonClicks(this.mouseActionScriptInputInterface!!.getButtonClicks() or InputEvent.BUTTON2_MASK)
this.logUtil!!.putF("Button 2 Selected: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, "update")

                                    }
                                

                                    }
                                
                        else {
                            
    
                        if((this.mouseActionScriptInputInterface!!.getButtonClicks() and InputEvent.BUTTON2_MASK) != 0)
                        
                                    {
                                    this.mouseActionScriptInputInterface!!.setButtonClicks(this.mouseActionScriptInputInterface!!.getButtonClicks() xor InputEvent.BUTTON2_MASK)
this.logUtil!!.putF("Button 2 Deselected: " +this.mouseActionScriptInputInterface!!.getButtonClicks(), this, "update")

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
: javax.swing.JDialog{



                        //if statement needs to be on the same line and ternary does not work the same way.
                        return this.mouseActionJDialog
}


    open fun setMouseActionJDialog(mouseActionJDialog: javax.swing.JDialog)
        //nullable = true from not(false or (false and false)) = true
{
var mouseActionJDialog = mouseActionJDialog
this.mouseActionJDialog= mouseActionJDialog
}


    open fun initComponents()
        //nullable = true from not(false or (false and true)) = true
{
this.mouseActionJDialog= javax.swing.JDialog()
this.titleJLabel= javax.swing.JLabel()
this.okJButton= javax.swing.JButton()
this.jLabel2= javax.swing.JLabel()
this.jLabel3= javax.swing.JLabel()
this.button1JCheckBox= javax.swing.JCheckBox()
this.button2JCheckBox= javax.swing.JCheckBox()
this.jLabel4= javax.swing.JLabel()
this.mouseXJTextField= javax.swing.JTextField()
this.jLabel5= javax.swing.JLabel()
this.mouseYJTextField= javax.swing.JTextField()
this.inputTypeJLabel= javax.swing.JLabel()
this.inputAutomationTypeJComboBox= javax.swing.JComboBox()
this.jLabel6= javax.swing.JLabel()
this.mouseDelayJTextField= javax.swing.JTextField()
this.mouseActionJButton= javax.swing.JButton()
this.jLabel1= javax.swing.JLabel()
this.mouseActionJDialog!!.setMinimumSize(java.awt.Dimension(275, 185))
this.titleJLabel!!.setText("Mouse Input Options")
this.okJButton!!.setText("OK")
this.okJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
okJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel2!!.setText("Buttons:")
this.jLabel3!!.setText("Move To:")
this.button1JCheckBox!!.setText(CommonPhoneStrings.getInstance()!!.ONE)
this.button1JCheckBox!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.button1JCheckBox!!.setMargin(java.awt.Insets(0, 0, 0, 0))
this.button2JCheckBox!!.setText(CommonPhoneStrings.getInstance()!!.TWO)
this.button2JCheckBox!!.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0))
this.button2JCheckBox!!.setMargin(java.awt.Insets(0, 0, 0, 0))
this.button2JCheckBox!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
button2JCheckBoxActionPerformed(evt)
}

                                }
                            )
this.jLabel4!!.setText("x:")
this.mouseXJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.jLabel5!!.setText("y:")
this.mouseYJTextField!!.setText(CommonPhoneStrings.getInstance()!!.ZERO)
this.inputTypeJLabel!!.setText("Input Type:")
this.jLabel6!!.setText("Delay:")
this.mouseDelayJTextField!!.setText("100")

    var mouseActionJDialogLayout: javax.swing.GroupLayout = javax.swing.GroupLayout(this.mouseActionJDialog!!.getContentPane())

this.mouseActionJDialog!!.getContentPane()!!.setLayout(mouseActionJDialogLayout)
mouseActionJDialogLayout!!.setHorizontalGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addContainerGap()!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(inputTypeJLabel)!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mouseActionJDialogLayout!!.createSequentialGroup()!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(jLabel2)!!.addGap(25, 25, 25))!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel3)!!.addComponent(jLabel6))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(mouseDelayJTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addGap(45, 45, 45))!!.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mouseActionJDialogLayout!!.createSequentialGroup()!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(inputAutomationTypeJComboBox, 0, 154, Short.MAX_VALUE))!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(button1JCheckBox)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(button2JCheckBox))!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(okJButton))!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(jLabel4)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 5, Short.MAX_VALUE)!!.addComponent(mouseXJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(jLabel5)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addComponent(mouseYJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)))))!!.addContainerGap()))
mouseActionJDialogLayout!!.setVerticalGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(mouseActionJDialogLayout!!.createSequentialGroup()!!.addComponent(titleJLabel)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(inputTypeJLabel)!!.addComponent(inputAutomationTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(button1JCheckBox)!!.addComponent(button2JCheckBox)))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel6)!!.addComponent(mouseDelayJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)!!.addGroup(mouseActionJDialogLayout!!.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel3)!!.addComponent(jLabel4)!!.addComponent(jLabel5)!!.addComponent(mouseYJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)!!.addComponent(mouseXJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)!!.addComponent(okJButton)!!.addContainerGap()))
setMinimumSize(java.awt.Dimension(100, 0))
this.mouseActionJButton!!.setText("Edit")
this.mouseActionJButton!!.addActionListener(object: java.awt.event.ActionListener()
                                {
                                
    open override fun actionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
mouseActionJButtonActionPerformed(evt)
}

                                }
                            )
this.jLabel1!!.setText("Mouse:")

    var layout: javax.swing.GroupLayout = javax.swing.GroupLayout(this)

this.setLayout(layout)
layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createSequentialGroup()!!.addComponent(jLabel1)!!.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)!!.addComponent(mouseActionJButton)))
layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)!!.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)!!.addComponent(jLabel1)!!.addComponent(mouseActionJButton)))
}


    open fun button2JCheckBoxActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
}


    open fun okJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt

        try {
            this.update()
this.getMouseActionJDialog()!!.setVisible(false)
} catch(e: Exception)
            {
this.logUtil!!.put(this.commonStrings!!.EXCEPTION, this, "okButtonActionPerformed", e)
}

}


    open fun mouseActionJButtonActionPerformed(evt: java.awt.event.ActionEvent)
        //nullable = true from not(false or (false and false)) = true
{
var evt = evt
this.getMouseActionJDialog()!!.setVisible(true)
}


    private var button1JCheckBox: javax.swing.JCheckBox

    private var button2JCheckBox: javax.swing.JCheckBox

    private var inputAutomationTypeJComboBox: javax.swing.JComboBox

    private var inputTypeJLabel: javax.swing.JLabel

    private var jLabel1: javax.swing.JLabel

    private var jLabel2: javax.swing.JLabel

    private var jLabel3: javax.swing.JLabel

    private var jLabel4: javax.swing.JLabel

    private var jLabel5: javax.swing.JLabel

    private var jLabel6: javax.swing.JLabel

    private var mouseActionJButton: javax.swing.JButton

    private var mouseActionJDialog: javax.swing.JDialog

    private var mouseDelayJTextField: javax.swing.JTextField

    private var mouseXJTextField: javax.swing.JTextField

    private var mouseYJTextField: javax.swing.JTextField

    private var okJButton: javax.swing.JButton

    private var titleJLabel: javax.swing.JLabel

}
                
            

