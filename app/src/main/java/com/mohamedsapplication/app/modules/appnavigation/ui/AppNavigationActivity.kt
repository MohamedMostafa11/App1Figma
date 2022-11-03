package com.mohamedsapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.mohamedsapplication.app.R
import com.mohamedsapplication.app.appcomponents.base.BaseActivity
import com.mohamedsapplication.app.databinding.ActivityAppNavigationBinding
import com.mohamedsapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.mohamedsapplication.app.modules.forgetpasswordpage.ui.ForgetPasswordPageActivity
import com.mohamedsapplication.app.modules.forgetpasswordvirify.ui.ForgetPasswordVirifyActivity
import com.mohamedsapplication.app.modules.loginpage.ui.LoginPageActivity
import com.mohamedsapplication.app.modules.registerpage.ui.RegisterPageActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearForgetPasswordPage.setOnClickListener {
      val destIntent = ForgetPasswordPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginPage.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgetPasswordVirify.setOnClickListener {
      val destIntent = ForgetPasswordVirifyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearRegisterPage.setOnClickListener {
      val destIntent = RegisterPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
