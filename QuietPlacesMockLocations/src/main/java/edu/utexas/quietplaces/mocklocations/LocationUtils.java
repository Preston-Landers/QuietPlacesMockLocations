/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package edu.utexas.quietplaces.mocklocations;

/**
 *  Constants used in other classes in the app
 */
public final class LocationUtils {

    // Debugging tag for the application
    public static final String APPTAG = "QuietPlaces Location Mock Tester";

    // Create an empty string for initializing strings
    public static final String EMPTY_STRING = new String();

    // Conversion factor for boot time
    public static final long NANOSECONDS_PER_MILLISECOND = 1000000;

    // Conversion factor for time values
    public static final long MILLISECONDS_PER_SECOND = 1000;

    // Conversion factor for time values
    public static final long NANOSECONDS_PER_SECOND =
                    NANOSECONDS_PER_MILLISECOND * MILLISECONDS_PER_SECOND;

    /*
     * Action values sent by Intent from the main activity to the service
     */
    // Request a one-time test
    public static final String ACTION_START_ONCE =
            "edu.utexas.quietplaces.mocklocations.ACTION_START_ONCE";

    // Request continuous testing
    public static final String ACTION_START_CONTINUOUS =
                    "edu.utexas.quietplaces.mocklocations.ACTION_START_CONTINUOUS";

    // Stop a continuous test
    public static final String ACTION_STOP_TEST =
                    "edu.utexas.quietplaces.mocklocations.ACTION_STOP_TEST";

    /*
     * Extended data keys for the broadcast Intent sent from the service to the main activity.
     * Key1 is the base connection message.
     * Key2 is extra data or error codes.
     */
    public static final String KEY_EXTRA_CODE1 =
            "edu.utexas.quietplaces.mocklocations.KEY_EXTRA_CODE1";

    public static final String KEY_EXTRA_CODE2 =
            "edu.utexas.quietplaces.mocklocations.KEY_EXTRA_CODE2";

    /*
     * Codes for communicating status back to the main activity
     */

    // The location client is disconnected
    public static final int CODE_DISCONNECTED = 0;

    // The location client is connected
    public static final int CODE_CONNECTED = 1;

    // The client failed to connect to Location Services
    public static final int CODE_CONNECTION_FAILED = -1;

    // Report in the broadcast Intent that the test finished
    public static final int CODE_TEST_FINISHED = 3;

    /*
     * Report in the broadcast Intent that the activity requested the start to a test, but a
     * test is already underway
     *
     */
    public static final int CODE_IN_TEST = -2;

    // The test was interrupted by clicking "Stop testing"
    public static final int CODE_TEST_STOPPED = -3;

    // The name used for all mock locations
    public static final String LOCATION_PROVIDER = "fused";

    //  Locations for JJ Pickle Research Campus, The University of Texas at Austin
    // An array of latitudes for constructing test data
    public static final double[] WAYPOINTS_LAT = {
    30.387157,
    30.387275,
    30.387076,
    30.386157,
    30.385926,
    30.387411,
    30.387865,
    30.388887};

    // An array of longitudes for constructing test data
    public static final double[] WAYPOINTS_LNG = {
    -97.727037,
    -97.726061,
    -97.726759,
    -97.727036,
    -97.728077,
    -97.729949,
    -97.730067,
    -97.729247};

    // An array of accuracy values for constructing test data
    public static final float[] WAYPOINTS_ACCURACY = {
        3.0f,
        3.12f,
        3.5f,
        3.7f,
        3.12f,
        3.0f,
        3.12f,
        3.7f
    };

    // Mark the broadcast Intent with an action
    public static final String ACTION_SERVICE_MESSAGE =
            "edu.utexas.quietplaces.mocklocations.ACTION_SERVICE_MESSAGE";

    /*
     * Key for extended data in the Activity's outgoing Intent that records the type of test
     * requested.
     */
    public static final String EXTRA_TEST_ACTION =
            "edu.utexas.quietplaces.mocklocations.EXTRA_TEST_ACTION";

    /*
     * Key for extended data in the Activity's outgoing Intent that records the requested pause
     * value.
     */
    public static final String EXTRA_PAUSE_VALUE =
            "edu.utexas.quietplaces.mocklocations.EXTRA_PAUSE_VALUE";

    /*
     * Key for extended data in the Activity's outgoing Intent that records the requested interval
     * for mock locations sent to Location Services.
     */
    public static final String EXTRA_SEND_INTERVAL =
            "edu.utexas.quietplaces.mocklocations.EXTRA_SEND_INTERVAL";
}
