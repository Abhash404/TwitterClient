# Project 2 - TwitterClient

TwitterClient is an android app that allows a user to view his Twitter timeline. The app utilizes [Twitter REST API](https://dev.twitter.com/rest/public).

Time spent: 8 hours spent in total

## User Stories

The following functionality is completed:

- [x] User can **sign in to Twitter** using OAuth login
- [x]	User can **view tweets from their home timeline**
  - [x] User is displayed the username, name, and body for each tweet
  - [x] User is displayed the [relative timestamp](https://gist.github.com/nesquena/f786232f5ef72f6e10a7) for each tweet "8m", "7h"
- [x] User can refresh tweets timeline by pulling down to refresh

The following optional features are implemented:

- [x] User can view more tweets as they scroll with infinite pagination
- [x] Improve the user interface and theme the app to feel "twitter branded"
- [ ] Links in tweets are clickable and will launch the web browser
- [ ] User can tap a tweet to display a "detailed" view of that tweet
- [ ] User can see embedded image media within the tweet detail view
- [ ] User can watch embedded video within the tweet
- [ ] User can open the twitter app offline and see last loaded tweets
- [x] On the Twitter timeline, leverage the CoordinatorLayout to apply scrolling behavior that hides.

The following additional features are implemented:

- [x] Splash screed added.
- [x] Progress bar with duration added.
- [x] UI enhanced.

## Video Walkthrough

Here's a walkthrough of implemented user stories:

![walkthrough](https://user-images.githubusercontent.com/80597347/157810246-759935a3-9c0a-4cc3-825d-6d9ccd129a52.gif)

GIF created with [LiceCap](http://www.cockos.com/licecap/).

## Notes

Challenges encountered while building the app:

- Version Control issues.
- Moshi Kotlin issues.
- Gradle build errors due to operations errors.
- java.lang Errors.

## Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

## License

    Copyright [2022] [name of copyright owner]

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
