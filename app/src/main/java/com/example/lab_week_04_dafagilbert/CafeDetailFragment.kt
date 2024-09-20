package com.example.lab_week_04_dafagilbert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

private const val ARG_DESC = "desc"

class CafeDetailFragment : Fragment() {

    companion object {
        fun newInstance(description: String): CafeDetailFragment {
            val fragment = CafeDetailFragment()
            val args = Bundle()
            args.putString(ARG_DESC, description)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_cafe_detail, container, false)
        val description = arguments?.getString(ARG_DESC) ?: ""
        val textView = view.findViewById<TextView>(R.id.content_description)
        textView.text = description
        return view
    }
}
