SUMMARY = "Python implementation of subunit test streaming protocol"
HOMEPAGE = "https://pypi.org/project/python-subunit/"
SECTION = "devel/python"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://README.rst;beginline=1;endline=20;md5=571e2d702e247b9d8a7745b3b54315ed"

PYPI_PACKAGE = "python-subunit"

SRC_URI[sha256sum] = "9ee76092d5b0a02055219763f1aa9e28835f2dd722f03ea9fd8d68e4066b3378"

inherit pypi setuptools3

RDEPENDS:${PN} = " python3-testtools"

BBCLASSEXTEND = "nativesdk"
