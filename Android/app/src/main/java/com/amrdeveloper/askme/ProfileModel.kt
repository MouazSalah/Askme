package com.amrdeveloper.askme

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.amrdeveloper.askme.contracts.ProfileContract
import com.amrdeveloper.askme.events.LoadFinishEvent
import com.amrdeveloper.askme.models.FeedViewModel
import org.greenrobot.eventbus.EventBus

class ProfileModel : ProfileContract.Model {

    override fun loadFeedFromServer(feedModel: FeedViewModel, lifecycleOwner: LifecycleOwner) {
        feedModel.getFeedPagedList().observe(lifecycleOwner, Observer {
            EventBus.getDefault().post(LoadFinishEvent(it))
        })
    }
}