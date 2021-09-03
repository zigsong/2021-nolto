package com.wooteco.nolto.feed.ui.dto;

import com.wooteco.nolto.feed.domain.Feed;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Objects;

@Getter
@AllArgsConstructor
public class FeedCardPaginationResponse {

    private final List<FeedCardResponse> feeds;
    private final Long nextFeedId;

    public static FeedCardPaginationResponse of(List<Feed> findFeeds, Feed nextFeed) {
        List<FeedCardResponse> feedCardResponses = FeedCardResponse.toList(findFeeds);
        if (Objects.isNull(nextFeed)) {
            return new FeedCardPaginationResponse(feedCardResponses, null);
        }
        return new FeedCardPaginationResponse(feedCardResponses, nextFeed.getId());
    }
}
