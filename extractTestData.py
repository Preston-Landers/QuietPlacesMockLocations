#!/usr/bin/env python

"""
This script extracts Mock Location test data from a Google Earth place file (kml)

Specifically, a "Folder" of "Placemarks" in Google Earth can be used as the source,
and it will output Java code suitable for this Mock Location app.

Use this like:

1) Create a folder in Google Earth and add a bunch a points to it.
   (Or open the existing "QuietPlaces Austin.kmz" from our Google Drive)

   The order the placemarks are listed in this folder (in GEarth's organizer)
   are the same order that the mock location app will use.

2) Save this GEarth folder. It was save as a .kmz file.

3) Extract the inner doc.kml file from it using an unzip utility (such as 7-zip)

4) Run this script on the doc.kml and redirect the output to a text file

python extractTestData.py c:\path\to\doc.kml > test.txt

5) Paste/insert the contents of the text file into the appropriate spot
   in LocationUtils.java in QuietPlacesMockLocations

"""

from xml.dom.minidom import parse
import sys
import random
import os

DEFAULT_FILENAME = "c:\\Users\\Preston\\Documents\\doc.kml"

NAME = "name"
LAT = "latitude"
LONG = "longitude"
ACC = "accuracy"

# ACCURACY_CHOICES = ["3.4", "10.5", "9.5", "1.5", "3.9", "5.02"]
ACCURACY_CHOICES = ["3.4", "2.5", "1.5", "3.5", "2.6", "1.95"]

def main():
    try:
        INPUTFILENAME = sys.argv[1]
    except IndexError, e:
        INPUTFILENAME = DEFAULT_FILENAME

    if not os.path.exists(INPUTFILENAME):
        raise RuntimeError("Can't find input file " + INPUTFILENAME)
        
    pointsList = []
        
    wholeDoc = parse(INPUTFILENAME)
    doc = wholeDoc.getElementsByTagName("Document")[0]
    folder = doc.getElementsByTagName("Folder")[0]
    for placemark in folder.getElementsByTagName("Placemark"):
        nameE = placemark.getElementsByTagName(NAME)[0]
        name = nameE.firstChild.nodeValue
        
        try:
            # Handle line geometry
            lineString = placemark.getElementsByTagName("LineString")[0]
            coordsElem = lineString.getElementsByTagName("coordinates")[0]
            
            for point in coordsElem.firstChild.nodeValue.split(" "):
                pointData={}
                accuracy = random.choice(ACCURACY_CHOICES)
                coords = point.split(",")
                
                longstr = coords[0]
                lat = coords[1]

                pointData[NAME] = name.strip()
                pointData[LAT] = lat.strip()
                pointData[LONG] = longstr.strip()
                pointData[ACC] = accuracy.strip()
                # print name, coords

                pointsList.append(pointData)

            continue
        except IndexError:
            pass
        try:
            point = placemark.getElementsByTagName("Point")[0]
        except IndexError:
            continue
        coordsElem = point.getElementsByTagName("coordinates")[0]
        # print coordsElem
        coords = coordsElem.firstChild.nodeValue.split(",")
        longstr = coords[0]
        lat = coords[1]
        accuracy = random.choice(ACCURACY_CHOICES)
        
        pointData={}
        pointData[NAME] = name
        pointData[LAT] = lat.strip()
        pointData[LONG] = longstr.strip()
        pointData[ACC] = accuracy.strip()
        # print name, coords

        pointsList.append(pointData)


    # print getJavaCode(pointsList)
    exportResourceFile(pointsList)
    return


def exportResourceFile(pointsList):    
    for point in pointsList:
        print "%s,%s,%s" % (point[LAT], point[LONG], point[ACC])
        
    

def getJavaCode(pointsList):
    TEMPLATE = """
    public static final double[] WAYPOINTS_LAT = {
%(latLines)s
};

    public static final double[] WAYPOINTS_LNG = {
%(longLines)s
};

    // An array of accuracy values for constructing test data
    public static final float[] WAYPOINTS_ACCURACY = {
%(accuracyLines)s
};
"""

    latLines = getLines(pointsList, LAT)
    longLines = getLines(pointsList, LONG)
    accuracyLines = getLines(pointsList, ACC)
    
    return TEMPLATE % locals()


def getLines(pointsList, key):
    rv = []
    listSize = len(pointsList)
    for i in xrange(0, listSize):
        point = pointsList[i]
        val = point[key]
        name = point[NAME]
        comma = ","
        fformat = ""
        if i == listSize - 1:
            # no comma
            comma = " "
        if key == ACC:
            fformat = "f"
        theStr = "    %s%s%s  // %s   %s" % (val, fformat, comma, i, name)
        rv.append(theStr)

    return "\n".join(rv)
    

if __name__ == "__main__":
    main()
