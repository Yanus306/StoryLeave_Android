package kr.ac.anu.storyleave.feature.auth

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import kr.ac.anu.storyleave.R
import kr.ac.anu.storyleave.core.ui.BaseBindingFragment
import kr.ac.anu.storyleave.databinding.FragmentAuthEntryBinding

@AndroidEntryPoint
class AuthEntryFragment : BaseBindingFragment<FragmentAuthEntryBinding>(
    FragmentAuthEntryBinding::inflate,
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.continueButton.setOnClickListener {
            findNavController().navigate(R.id.action_authEntryFragment_to_main_nav_graph)
        }
    }
}
