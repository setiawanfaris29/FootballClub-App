package com.example.footballclub.main

import com.example.footballclub.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}