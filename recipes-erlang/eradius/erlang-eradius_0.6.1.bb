SUMMARY = "Erlang RADIUS server"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT_LICENSE;md5=7a8830d51731fc79efbb8166db8d2859"

S = "${WORKDIR}/git"

SRCREV="52272c750001914395338f32b5ed767bb3dd5ee8"

PR = "r5"

SRC_URI = "git://github.com/travelping/eradius.git;protocol=git"

inherit tetrapak

DEPENDS = "erlang-lager"

python () {
    erlang_def_package("eradius", "eradius-*", "ebin priv", "src include mibs test NEWS.md README_eradius_journal.adoc README.md MIT_LICENSE", d)
}
