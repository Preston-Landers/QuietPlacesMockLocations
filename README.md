
# Mock Location Provider

This is the mock location provider app for QuietPlaces.

This app is based on code from here:

http://developer.android.com/training/location/location-testing.html

# TODO

This app is currently just the sample app given by Google.

It has a few hardcoded locations but you're supposed to customize the app
to have new locations, or ideally read the locations from a file or website.

In other words, nothing has been done.

# Usage

This is how this app is supposed to be used, in theory:

1. Install the mock location provider app on a device that has Google Play services installed.
Location Services is part of Google Play services.

2. On the device, enable mock locations. To learn how to do this, see the topic
Setting up a Device for Development in the link above.

3. Start the provider app from the Launcher, then choose the options you want from the main screen.

4. Unless you've removed the pause interval feature, the mock location provider app pauses for a few seconds, and
then starts sending mock location data to Location Services.

5. Run the app you want to test. While the mock location provider app is running, the app you're testing receives
mock locations instead of real locations.

6. If the provider app is in the midst of a continuous test, you can switch back to real locations by
clicking Stop test. This forces the started Service to turn off mock mode and then stop itself. When the
service stops itself, the background thread is also destroyed.

