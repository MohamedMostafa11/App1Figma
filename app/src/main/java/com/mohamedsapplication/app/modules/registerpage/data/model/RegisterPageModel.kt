package com.mohamedsapplication.app.modules.registerpage.`data`.model

import com.mohamedsapplication.app.R
import com.mohamedsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class RegisterPageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignup: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGender: String? = MyApp.getInstance().resources.getString(R.string.lbl_male)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGenderOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_female)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlreadyhanean: String? =
      MyApp.getInstance().resources.getString(R.string.msg_already_hane_an)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmailValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etUsernameValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etConfirmPassworValue: String? = null
)
