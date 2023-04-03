package com.example.manorroom

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.manorroom.databinding.FragmentZodiacListBinding
import java.sql.Types.NULL

private const val TAG = "ZodiacListFragment"

class ZodiacListFragment : Fragment() {

    private val zodiacListViewModel: ZodiacListViewModel by viewModels()
    private var _binding: FragmentZodiacListBinding? = null
    private val binding
        get() = checkNotNull(_binding){
            "Cannot access binding beause it is null. Is the view visible?"
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentZodiacListBinding.inflate(inflater, container, false)
        binding.zodiacRecyclerView.layoutManager = LinearLayoutManager(context)

        val zodiacs = zodiacListViewModel.zodiacs
        val adapter = ZodiacListAdapter(zodiacs)
        binding.zodiacRecyclerView.adapter = adapter

        return binding.root
        }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}