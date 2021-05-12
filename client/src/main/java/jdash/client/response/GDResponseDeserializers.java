package jdash.client.response;

import jdash.common.entity.*;
import reactor.util.function.Tuple2;

import java.util.List;
import java.util.function.Function;

public final class GDResponseDeserializers {

    private static final LevelSearchResponseDeserializer LEVEL_SEARCH_RESPONSE = new LevelSearchResponseDeserializer();
    private static final LoginResponseDeserializer LOGIN_RESPONSE = new LoginResponseDeserializer();
    private static final UserProfileResponseDeserializer USER_PROFILE_RESPONSE = new UserProfileResponseDeserializer();
    private static final UserSearchResponseDeserializer USER_SEARCH_RESPONSE = new UserSearchResponseDeserializer();
    private static final SongInfoResponseDeserializer SONG_INFO_RESPONSE = new SongInfoResponseDeserializer();
    private static final LevelDownloadResponseDeserializer LEVEL_DOWNLOAD_RESPONSE =
            new LevelDownloadResponseDeserializer();
    private static final TimelyInfoResponseDeserializer TIMELY_INFO_RESPONSE = new TimelyInfoResponseDeserializer();
    private static final CommentsResponseDeserializer COMMENTS_RESPONSE = new CommentsResponseDeserializer();
    private static final PrivateMessagesResponseDeserializer PRIVATE_MESSAGES_RESPONSE =
            new PrivateMessagesResponseDeserializer();

    private GDResponseDeserializers() {
        throw new AssertionError();
    }

    public static Function<String, List<GDLevel>> levelSearchResponse() {
        return LEVEL_SEARCH_RESPONSE;
    }

    public static Function<String, Tuple2<Long, Long>> loginResponse() {
        return LOGIN_RESPONSE;
    }

    public static Function<String, GDUserProfile> userProfileResponse() {
        return USER_PROFILE_RESPONSE;
    }

    public static Function<String, List<GDUserStats>> userSearchResponse() {
        return USER_SEARCH_RESPONSE;
    }

    public static Function<String, GDSong> songInfoResponse() {
        return SONG_INFO_RESPONSE;
    }

    public static Function<String, GDLevelDownload> levelDownloadResponse() {
        return LEVEL_DOWNLOAD_RESPONSE;
    }

    public static Function<String, GDTimelyInfo> timelyInfoResponse() {
        return TIMELY_INFO_RESPONSE;
    }

    public static Function<String, List<GDComment>> commentsResponse() {
        return COMMENTS_RESPONSE;
    }

    public static Function<String, List<GDMessage>> privateMessagesResponse() {
        return PRIVATE_MESSAGES_RESPONSE;
    }
}
