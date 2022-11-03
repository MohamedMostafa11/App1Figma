package com.mohamedsapplication.app.modules.forgetpasswordvirify.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedsapplication.app.R
import com.mohamedsapplication.app.appcomponents.base.BaseActivity
import com.mohamedsapplication.app.databinding.ActivityForgetPasswordVirifyBinding
import com.mohamedsapplication.app.modules.forgetpasswordvirify.`data`.viewmodel.ForgetPasswordVirifyVM
import com.mohamedsapplication.app.modules.loginpage.ui.LoginPageActivity
import kotlin.String
import kotlin.Unit

class ForgetPasswordVirifyActivity :
    BaseActivity<ActivityForgetPasswordVirifyBinding>(R.layout.activity_forget_password_virify) {
  private val viewModel: ForgetPasswordVirifyVM by viewModels<ForgetPasswordVirifyVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPasswordVirifyVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnVerify.setOnClickListener {
      val destIntent = LoginPageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASSWORD_VIRIFY_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPasswordVirifyActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
