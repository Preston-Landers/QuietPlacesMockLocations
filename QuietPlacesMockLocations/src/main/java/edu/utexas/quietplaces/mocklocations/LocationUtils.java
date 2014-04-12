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
    30.387203,  // 01   Commons Learning Center
    30.387157,  // 02   Big Class Room PRC 1.138
    30.387275,  // 03   Commons Cafeteria
    30.387076,  // 04   Small Class Room   PRC 1.162
    30.387094,  // 05   Commons Parking
    30.386909,  // 06   Read Grandberry Tr and Rd A
    30.386607,  // 07   Read Grandberry Tr near Pet&Geo
    30.386157,  // 08   Petroleum and Geosys. Engr.
    30.386149,  // 09   Petroleum and Geosys. Engr.
    30.386197,  // 10   Petroleum and Geosys. Engr.
    30.386353,  // 11   Parking lot between buildings
    30.386172,  // 12   Parking lot between buildings
    30.385926,  // 13   Microelect. and Engr. Res. Ctr.
    30.385955,  // 14   Microelect. and Engr. Res. Ctr.
    30.38595,   // 15   Microelect. and Engr. Res. Ctr.
    30.386172,  // 16   Parking lot between buildings
    30.386353,  // 17   Parking lot between buildings
    30.386607,  // 18   Read Grandberry Tr near Pet&Geo
    30.386909,  // 19   Read Grandberry Tr and Rd A
    30.386974,  // 20   Read Grandberry Tr position 1
    30.387231,  // 21   Read Grandberry Tr position 2
    30.387397,  // 22   Read Grandberry Tr position 3
    30.387411,  // 23   PETEX Extension Svr Learning Sol Bldg.
    30.387467,  // 24   PETEX Extension Svr Learning Sol Bldg.
    30.387442,  // 25   PETEX Extension Svr Learning Sol Bldg.
    30.387682,  // 26   Read Grandberry Tr position 4
    30.387967,  // 27   In Front of CMRG Research Offices
    30.387865,  // 28   CMRG Research Offices
    30.387861,  // 29   CMRG Research Offices
    30.387886,  // 30   CMRG Research Offices
    30.387967,  // 31   In Front of CMRG Research Offices
    30.388228,  // 32   Parking Street 1
    30.388504,  // 33   Parking Street 2
    30.388876,  // 34   Parking Street 3 Intersection
    30.388821,  // 35   No Name Street 1
    30.388714,  // 36   In Front of Experimental Aerodynamics
    30.388887,  // 37   Experimental Aerodynamics
    30.388842,  // 38   Experimental Aerodynamics
    30.388879,  // 39   Experimental Aerodynamics
    30.388714,  // 40   In Front of Experimental Aerodynamics
    30.388658,  // 41   No Name Street 2
    30.388547,  // 42   No Name Street 3
    30.388316,  // 43   No Name Street 4
    30.388084,  // 44   No Name Street 5 and Rd A
    30.387797,  // 45   Commons Parking Entrance
    30.387483}; // 46   Commons Parking end
    // An array of longitudes for constructing test data
    public static final double[] WAYPOINTS_LNG = {
    -97.72669,    //01
    -97.727037,   //02
    -97.726061,   //03
    -97.726759,   //04
    -97.727332,   //05
    -97.727696,   //06
    -97.727104,   //07
    -97.727036,   //08
    -97.727098,   //09
    -97.726978,   //10
    -97.72735,    //11
    -97.727538,   //12
    -97.728077,   //13
    -97.72793,    //14
    -97.728219,   //15
    -97.727538,   //16
    -97.72735,    //17
    -97.727104,   //18
    -97.727696,   //19
    -97.728147,   //20
    -97.728941,   //21
    -97.729456,   //22
    -97.729949,   //23
    -97.729999,   //24
    -97.729878,   //25
    -97.730371,   //26
    -97.730275,   //27
    -97.730067,   //28
    -97.730128,   //29
    -97.730007,   //30
    -97.730275,   //31
    -97.730176,   //32
    -97.730069,   //33
    -97.729908,   //34
    -97.729618,   //35
    -97.729315,   //36
    -97.729247,   //37
    -97.729286,   //38
    -97.729216,   //39
    -97.729315,   //40
    -97.729123,   //41
    -97.728673,   //42
    -97.728018,   //43
    -97.727224,   //44
    -97.727342,   //45
    -97.727192};  //46
    // An array of accuracy values for constructing test data
    public static final float[] WAYPOINTS_ACCURACY = {
    3.0f,   //01
    3.12f,  //02
    3.5f,   //03
    3.7f,   //04
    3.12f,  //05
    3.0f,   //06
    3.12f,  //07
    3.7f,   //08 orig
    3.0f,   //09
    3.12f,  //  10
    3.0f,   //11
    3.12f,  //12
    3.5f,   //13
    3.7f,   //14
    3.12f,  //15
    3.0f,   //16
    3.12f,  //17
    3.7f,   //18
    3.0f,   //19
    3.12f,  //  20
    3.0f,   //21
    3.12f,  //22
    3.5f,   //23
    3.7f,   //24
    3.12f,  //25
    3.0f,   //26
    3.12f,  //27
    3.7f,   //28
    3.0f,   //29
    3.12f,  //  30
    3.0f,   //31
    3.12f,  //32
    3.5f,   //33
    3.7f,   //34
    3.12f,  //35
    3.0f,   //36
    3.12f,  //37
    3.7f,   //38
    3.0f,   //39
    3.12f,  //  40
    3.0f,   //41
    3.12f,  //42
    3.5f,   //43
    3.7f,   //44
    3.12f,  //45
    3.0f};  //46
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
