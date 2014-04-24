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
 * Constants used in other classes in the app
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

/*
    //  Locations for JJ Pickle Research Campus, The University of Texas at Austin updated on 04-12-2014
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
    3.12f,  //10
    3.0f,   //11
    3.12f,  //12
    3.5f,   //13
    3.7f,   //14
    3.12f,  //15
    3.0f,   //16
    3.12f,  //17
    3.7f,   //18
    3.0f,   //19
    3.12f,  //20
    3.0f,   //21
    3.12f,  //22
    3.5f,   //23
    3.7f,   //24
    3.12f,  //25
    3.0f,   //26
    3.12f,  //27
    3.7f,   //28
    3.0f,   //29
    3.12f,  //30
    3.0f,   //31
    3.12f,  //32
    3.5f,   //33
    3.7f,   //34
    3.12f,  //35
    3.0f,   //36
    3.12f,  //37
    3.7f,   //38
    3.0f,   //39
    3.12f,  //40
    3.0f,   //41
    3.12f,  //42
    3.5f,   //43
    3.7f,   //44
    3.12f,  //45
    3.0f};  //46
*/


    // The following points were generated from
    // the "QuietPlaces Austin.kmz" file on Google Drive
    // as used by the extractTestData.py script.
    // Updated 4/21/2014
/*
    public static final double[] WAYPOINTS_LAT = {
            30.26666218560745,  // 0   Untitled Placemark
            30.26616388366184,  // 1   Untitled Placemark
            30.26566098390549,  // 2   Untitled Placemark
            30.26584669121913,  // 3   Untitled Placemark
            30.26876012482933,  // 4   Untitled Placemark
            30.26911276283758,  // 5   Untitled Placemark
            30.26928353206412,  // 6   Untitled Placemark
            30.26945619955625,  // 7   Untitled Placemark
            30.27845072695519,  // 8   Untitled Placemark
            30.27944658571599,  // 9   Untitled Placemark
            30.28022025853266,  // 10   Untitled Placemark
            30.27996383249719,  // 11   Untitled Placemark
            30.2799998334694,  // 12   Untitled Placemark
            30.28020887522843,  // 13   Untitled Placemark
            30.2802505159768,  // 14   Untitled Placemark
            30.27976563756156,  // 15   Untitled Placemark
            30.28027825811799,  // 16   Untitled Placemark
            30.28066978879694,  // 17   Untitled Placemark
            30.28091135024082,  // 18   Untitled Placemark
            30.28103962529279,  // 19   Untitled Placemark
            30.28066925634563,  // 20   Untitled Placemark
            30.28103802336788,  // 21   Untitled Placemark
            30.28158961415471,  // 22   Untitled Placemark
            30.28239961776549,  // 23   Untitled Placemark
            30.28356652673127,  // 24   Untitled Placemark
            30.28401058358635,  // 25   Untitled Placemark
            30.284312231995,  // 26   Untitled Placemark
            30.28442482451198,  // 27   Untitled Placemark
            30.28573430681488,  // 28   Untitled Placemark
            30.28626888052704,  // 29   Untitled Placemark
            30.2866063694676,  // 30   Untitled Placemark
            30.28676133467996,  // 31   Untitled Placemark
            30.28696002219407,  // 32   Untitled Placemark
            30.28755273555359,  // 33   Untitled Placemark
            30.2856409952898,  // 34   Untitled Placemark
            30.28546267319536,  // 35   Untitled Placemark
            30.2849382468996,  // 36   Untitled Placemark
            30.28496821588526,  // 37   Untitled Placemark
            30.28485567073177,  // 38   Untitled Placemark
            30.28487832272581,  // 39   Untitled Placemark
            30.28329665062009,  // 40   Untitled Placemark
            30.28375922266917,  // 41   Untitled Placemark
            30.28374124669888,  // 42   Untitled Placemark
            30.28363921209206,  // 43   Untitled Placemark
            30.28292726677044,  // 44   Untitled Placemark
            30.2819701332689,  // 45   Untitled Placemark
            30.28073203312825,  // 46   Untitled Placemark
            30.27011844102005,  // 47   Untitled Placemark
            30.26847859221816,  // 48   Untitled Placemark
            30.26817260466306,  // 49   Untitled Placemark
            30.26841881982167,  // 50   Untitled Placemark
            30.26856445670131,  // 51   Untitled Placemark
            30.26902510254989,  // 52   Untitled Placemark
            30.26899601490847,  // 53   Untitled Placemark
            30.27177787813933,  // 54   Untitled Placemark
            30.27325718364995,  // 55   Untitled Placemark
            30.2739683098445,  // 56   Texas State Library
            30.27515322844826,  // 57   Untitled Placemark
            30.27611629188143,  // 58   Untitled Placemark
            30.27634671143449,  // 59   Untitled Placemark
            30.27671130906993,  // 60   Untitled Placemark
            30.2770622463537,  // 61   Untitled Placemark
            30.27635246657126,  // 62   Untitled Placemark
            30.27587682359599,  // 63   State Law Library
            30.27650065140812,  // 64   Untitled Placemark
            30.27006335118182,  // 65   Untitled Placemark
            30.26935652175714   // 66   Paramount Theater
    };

    public static final double[] WAYPOINTS_LNG = {
            -97.74855109686816,  // 0   Untitled Placemark
            -97.74869767153345,  // 1   Untitled Placemark
            -97.74861185453229,  // 2   Untitled Placemark
            -97.74813669627071,  // 3   Untitled Placemark
            -97.74276682159166,  // 4   Untitled Placemark
            -97.74263366232307,  // 5   Untitled Placemark
            -97.74283564429749,  // 6   Untitled Placemark
            -97.74276785165077,  // 7   Untitled Placemark
            -97.74144530073262,  // 8   Untitled Placemark
            -97.74115667660341,  // 9   Untitled Placemark
            -97.74074493172577,  // 10   Untitled Placemark
            -97.73973147105956,  // 11   Untitled Placemark
            -97.73916923627839,  // 12   Untitled Placemark
            -97.73862014916959,  // 13   Untitled Placemark
            -97.73911001039863,  // 14   Untitled Placemark
            -97.73858450541663,  // 15   Untitled Placemark
            -97.73805864371435,  // 16   Untitled Placemark
            -97.73789014072212,  // 17   Untitled Placemark
            -97.73759523573955,  // 18   Untitled Placemark
            -97.7373074455332,  // 19   Untitled Placemark
            -97.73747762571897,  // 20   Untitled Placemark
            -97.73915367288164,  // 21   Untitled Placemark
            -97.74092460988153,  // 22   Untitled Placemark
            -97.74082064411799,  // 23   Untitled Placemark
            -97.74076118424657,  // 24   Untitled Placemark
            -97.74091389135802,  // 25   Untitled Placemark
            -97.74123177689238,  // 26   Untitled Placemark
            -97.74106006417981,  // 27   Untitled Placemark
            -97.74166090943915,  // 28   Untitled Placemark
            -97.74122907472628,  // 29   Untitled Placemark
            -97.74115370977836,  // 30   Untitled Placemark
            -97.741150596056,  // 31   Untitled Placemark
            -97.74150336652176,  // 32   Untitled Placemark
            -97.74147275770135,  // 33   Untitled Placemark
            -97.74188215901327,  // 34   Untitled Placemark
            -97.74215337814934,  // 35   Untitled Placemark
            -97.7419753323222,  // 36   Untitled Placemark
            -97.74240246711943,  // 37   Untitled Placemark
            -97.74254636071935,  // 38   Untitled Placemark
            -97.74269954947951,  // 39   Untitled Placemark
            -97.7420879419722,  // 40   Untitled Placemark
            -97.74292509620372,  // 41   Untitled Placemark
            -97.74243304710032,  // 42   Untitled Placemark
            -97.74233854683759,  // 43   Untitled Placemark
            -97.74212413042919,  // 44   Untitled Placemark
            -97.74227533489733,  // 45   Untitled Placemark
            -97.74209532691965,  // 46   Untitled Placemark
            -97.73952838612374,  // 47   Untitled Placemark
            -97.74020045634418,  // 48   Untitled Placemark
            -97.73962626627348,  // 49   Untitled Placemark
            -97.73961616203523,  // 50   Untitled Placemark
            -97.73958136520771,  // 51   Untitled Placemark
            -97.73957577226524,  // 52   Untitled Placemark
            -97.73846342060259,  // 53   Untitled Placemark
            -97.73857684855894,  // 54   Untitled Placemark
            -97.73807161620836,  // 55   Untitled Placemark
            -97.73845157729397,  // 56   Texas State Library
            -97.73769177217058,  // 57   Untitled Placemark
            -97.73730387077731,  // 58   Untitled Placemark
            -97.73812528993021,  // 59   Untitled Placemark
            -97.73934500144729,  // 60   Untitled Placemark
            -97.74076964073805,  // 61   Untitled Placemark
            -97.7411010756211,  // 62   Untitled Placemark
            -97.74117390122369,  // 63   State Law Library
            -97.74221464314624,  // 64   Untitled Placemark
            -97.7422593109856,  // 65   Untitled Placemark
            -97.74191232366295   // 66   Paramount Theater
    };

    // An array of accuracy values for constructing test data
    public static final float[] WAYPOINTS_ACCURACY = {
            10.5f,  // 0   Untitled Placemark
            1.5f,  // 1   Untitled Placemark
            9.5f,  // 2   Untitled Placemark
            1.5f,  // 3   Untitled Placemark
            5.02f,  // 4   Untitled Placemark
            10.5f,  // 5   Untitled Placemark
            3.9f,  // 6   Untitled Placemark
            5.02f,  // 7   Untitled Placemark
            3.4f,  // 8   Untitled Placemark
            5.02f,  // 9   Untitled Placemark
            9.5f,  // 10   Untitled Placemark
            5.02f,  // 11   Untitled Placemark
            5.02f,  // 12   Untitled Placemark
            3.4f,  // 13   Untitled Placemark
            9.5f,  // 14   Untitled Placemark
            1.5f,  // 15   Untitled Placemark
            3.9f,  // 16   Untitled Placemark
            5.02f,  // 17   Untitled Placemark
            10.5f,  // 18   Untitled Placemark
            1.5f,  // 19   Untitled Placemark
            3.4f,  // 20   Untitled Placemark
            9.5f,  // 21   Untitled Placemark
            3.4f,  // 22   Untitled Placemark
            10.5f,  // 23   Untitled Placemark
            3.9f,  // 24   Untitled Placemark
            3.9f,  // 25   Untitled Placemark
            3.9f,  // 26   Untitled Placemark
            10.5f,  // 27   Untitled Placemark
            1.5f,  // 28   Untitled Placemark
            3.4f,  // 29   Untitled Placemark
            1.5f,  // 30   Untitled Placemark
            5.02f,  // 31   Untitled Placemark
            3.9f,  // 32   Untitled Placemark
            10.5f,  // 33   Untitled Placemark
            3.4f,  // 34   Untitled Placemark
            1.5f,  // 35   Untitled Placemark
            3.9f,  // 36   Untitled Placemark
            9.5f,  // 37   Untitled Placemark
            3.4f,  // 38   Untitled Placemark
            3.9f,  // 39   Untitled Placemark
            3.4f,  // 40   Untitled Placemark
            10.5f,  // 41   Untitled Placemark
            3.9f,  // 42   Untitled Placemark
            9.5f,  // 43   Untitled Placemark
            5.02f,  // 44   Untitled Placemark
            5.02f,  // 45   Untitled Placemark
            9.5f,  // 46   Untitled Placemark
            9.5f,  // 47   Untitled Placemark
            5.02f,  // 48   Untitled Placemark
            3.9f,  // 49   Untitled Placemark
            9.5f,  // 50   Untitled Placemark
            3.9f,  // 51   Untitled Placemark
            10.5f,  // 52   Untitled Placemark
            3.9f,  // 53   Untitled Placemark
            3.9f,  // 54   Untitled Placemark
            9.5f,  // 55   Untitled Placemark
            1.5f,  // 56   Texas State Library
            5.02f,  // 57   Untitled Placemark
            9.5f,  // 58   Untitled Placemark
            3.4f,  // 59   Untitled Placemark
            10.5f,  // 60   Untitled Placemark
            1.5f,  // 61   Untitled Placemark
            3.9f,  // 62   Untitled Placemark
            5.02f,  // 63   State Law Library
            5.02f,  // 64   Untitled Placemark
            9.5f,  // 65   Untitled Placemark
            3.4f   // 66   Paramount Theater
    };
*/


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
