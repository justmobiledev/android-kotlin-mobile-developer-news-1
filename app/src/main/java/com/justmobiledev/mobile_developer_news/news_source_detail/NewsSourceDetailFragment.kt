package com.justmobiledev.mobile_developer_news.news_source_detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.justmobiledev.mobile_developer_news.R
import com.justmobiledev.mobile_developer_news.models.NewsSourceItem

/**
 * A fragment representing a single NewsSourceItem detail screen.
 * This fragment is either contained in a [NewsSourceListActivity]
 * in two-pane mode (on tablets) or a [NewsSourceDetailActivity]
 * on handsets.
 */
class NewsSourceDetailFragment : Fragment() {

    /**
     * The dummy content this fragment is presenting.
     */
    private var newsItemId = 0
    private var newsItemTitle = ""
    private var newsItemUrl = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(NewsSourceItem.NEWS_SOURCE_ITEM_ID)) {
                newsItemId = it.getInt(NewsSourceItem.NEWS_SOURCE_ITEM_ID)
            }
            if (it.containsKey(NewsSourceItem.NEWS_SOURCE_ITEM_TITLE)) {
                newsItemTitle = it.getString(NewsSourceItem.NEWS_SOURCE_ITEM_TITLE)
            }
            if (it.containsKey(NewsSourceItem.NEWS_SOURCE_ITEM_URL)) {
                newsItemUrl = it.getString(NewsSourceItem.NEWS_SOURCE_ITEM_URL)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.newssource_detail, container, false)

        return rootView
    }
}