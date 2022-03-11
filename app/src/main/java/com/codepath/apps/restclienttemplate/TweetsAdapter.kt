package com.codepath.apps.restclienttemplate

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.codepath.apps.restclienttemplate.models.Tweet

class TweetsAdapter(val tweets: ArrayList<Tweet>) : RecyclerView.Adapter<TweetsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TweetsAdapter.ViewHolder {

        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_tweet, parent, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: TweetsAdapter.ViewHolder, position: Int) {

        val tweet = tweets[position]

        holder.tvUserName.text = tweet.user?.name
        holder.tvScreenName.text = "@" + tweet.user?.screenName
        holder.tvTweetBody.text = tweet.body
        holder.tvRelativeTimestamp.text = tweet.relativeTimestamp
        Glide.with(holder.itemView).load(tweet.user?.publicImageUrl).transform(RoundedCorners(8)).into(holder.ivProfileImage)
    }

    override fun getItemCount(): Int {

        return tweets.size
    }

    fun clear() {

        tweets.clear()
        notifyDataSetChanged()
    }

    fun addAll(tweetList: List<Tweet>) {

        tweets.addAll(tweetList)
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val ivProfileImage = itemView.findViewById<ImageView>(R.id.ivProfileImage)
        val tvUserName = itemView.findViewById<TextView>(R.id.tvUsername)
        val tvScreenName = itemView.findViewById<TextView>(R.id.tvScreenName)
        val tvTweetBody = itemView.findViewById<TextView>(R.id.tvTweetBody)
        val tvRelativeTimestamp = itemView.findViewById<TextView>(R.id.tvRelativeTimestamp)
    }
}