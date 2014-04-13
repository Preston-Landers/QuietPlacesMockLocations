
# Mock Location Provider

This is the mock location provider app for QuietPlaces.

This app is based on code from here:

http://developer.android.com/training/location/location-testing.html

# TODO

This app is currently just the sample app given by Google.

It has a 46 hardcoded locations but you're supposed to customize the app
to read the locations from a file or website.

Locations for JJ Pickle Research Campus, The University of Texas at Austin

in the future we will set up this app to read a sequence of locations from a
website that we set up. It does not have to be anything complex. Just a series of comma separated
values in a text file.

# Usage

This is how this app is supposed to be used.

1. Install this app (the mock location provider) on a device that has Google Play services installed.
Location Services is part of Google Play services.

2. On the device, enable mock locations. To learn how to do this, see the topic
Setting up a Device for Development in the link above. Basically go into Settings -> Developer Options
and enable Mock Locations there.

3. Start the provider app from the Launcher, then choose the options you want from the main screen.

4. Unless you've removed the pause interval feature, the mock location provider app pauses for a few seconds, and
then starts sending mock location data to Location Services.

5. Run the app you want to test. While the mock location provider app is running, the app you're testing receives
mock locations instead of real locations.

6. If the provider app is in the midst of a continuous test, you can switch back to real locations by
clicking Stop test. This forces the started Service to turn off mock mode and then stop itself. When the
service stops itself, the background thread is also destroyed.

