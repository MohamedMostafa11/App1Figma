package com.mohamedsapplication.app.modules.forgetpasswordpage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.mohamedsapplication.app.R
import com.mohamedsapplication.app.appcomponents.base.BaseActivity
import com.mohamedsapplication.app.databinding.ActivityForgetPasswordPageBinding
import com.mohamedsapplication.app.modules.forgetpasswordpage.`data`.viewmodel.ForgetPasswordPageVM
import com.mohamedsapplication.app.modules.forgetpasswordvirify.ui.ForgetPasswordVirifyActivity
import kotlin.String
import kotlin.Unit

class ForgetPasswordPageActivity :
    BaseActivity<ActivityForgetPasswordPageBinding>(R.layout.activity_forget_password_page) {
  private val viewModel: ForgetPasswordPageVM by viewModels<ForgetPasswordPageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forgetPasswordPageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnNext.setOnClickListener {
      val destIntent = ForgetPasswordVirifyActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FORGET_PASSWORD_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ForgetPasswordPageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
