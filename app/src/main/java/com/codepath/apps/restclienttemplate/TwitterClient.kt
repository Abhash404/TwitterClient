package com.codepath.apps.restclienttemplate

import android.content.Context
import com.codepath.asynchttpclient.RequestParams
import com.codepath.asynchttpclient.callback.JsonHttpResponseHandler
import com.codepath.oauth.OAuthBaseClient
import com.github.scribejava.apis.TwitterApi

class TwitterClient(context: Context) : OAuthBaseClient(context, REST_API_INSTANCE, REST_URL, REST_CONSUMER_KEY, REST_CONSUMER_SECRET,
    null, String.format(REST_CALLBACK_URL_TEMPLATE, context.getString(R.string.intent_host), context.getString(R.string.intent_scheme),
        context.packageName, FALLBACK_URL)) {

    companion object {

        val REST_API_INSTANCE: TwitterApi = TwitterApi.instance()
        const val REST_URL = "https://api.twitter.com/1.1"
        const val REST_CONSUMER_KEY = BuildConfig.CONSUMER_KEY
        const val REST_CONSUMER_SECRET = BuildConfig.CONSUMER_SECRET
        const val FALLBACK_URL = "https://codepath.github.io/android-rest-client-template/success.html"
        const val REST_CALLBACK_URL_TEMPLATE = "intent://%s#Intent;action=android.intent.action.VIEW;scheme=%s;package=%s;S.browser_fallback_url=%s;end"
    }

    fun getHomeTimeline(handler: JsonHttpResponseHandler, params: RequestParams = RequestParams().also {

            it["count"] = "25"
            it["since_id"] = "1"
        }

    ) {
        val apiUrl = getApiUrl("/statuses/home_timeline.json")

        client.get(apiUrl, params, handler)
    }

    /* 1. Define the endpoint URL with getApiUrl and pass a relative path to the endpoint
	 * 	  i.e getApiUrl("statuses/home_timeline.json")
	 * 2. Define the parameters to pass to the request (query or body)
	 *    i.e val params = RequestParams("foo", "bar")
	 * 3. Define the request method and make a call to the client
	 *    i.e client.get(apiUrl, params, handler)
	 *    i.e client.post(apiUrl, params, handler)
	 */
}