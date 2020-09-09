package com.crisspian.roomexampletodo_04_09

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.crisspian.roomexampletodo_04_09.database.Task
import kotlinx.android.synthetic.main.task_item_list.view.*
import java.text.FieldPosition

class TaskAdapter(var passTheData: PassTheData) : RecyclerView.Adapter<TaskAdapter.TaskViewHolder>(){

    private var dataList= emptyList<Task>()


    //funcion que va a actualizar el listado del adapter

    fun updateDataList(mDataList:List<Task>){
        dataList = mDataList
        notifyDataSetChanged()
    }

    inner class TaskViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val taskText = itemView.taskTv
        val checkTask = itemView.checkBoxTask
        val idText = itemView.idTv
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {

       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.task_item_list,parent,false)
       return TaskViewHolder(itemView)


    }

    override fun onBindViewHolder(holder: TaskViewHolder,position: Int) {
        val mTask: Task = dataList[position]
       holder.idText.text = mTask.task
        holder.checkTask.isChecked = mTask.completeTask
        holder.idText.text = mTask.id.toString()
    }

    override fun getItemCount() = dataList.size
//esta interface va a pasar el dato al primer fragmento
    interface PassTheData{
        fun passTheData(mtask: Task)

    }
}