package com.mohamedsapplication.app.modules.appnavigation.`data`.model

import com.mohamedsapplication.app.R
import com.mohamedsapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginPage: String? = MyApp.getInstance().resources.getString(R.string.lbl_login_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRegisterPage: String? = MyApp.getInstance().resources.getString(R.string.lbl_register_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgetPasswordPage: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forget_password2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgetPasswordVirify: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forget_password3)

)
