#include <jni.h>
#include <string>
#include "libmp3lame/lame.h"

extern "C"
JNIEXPORT jstring JNICALL
Java_com_xuexiang_libmp3lame_Lame_getVersion(JNIEnv *env, jclass type) {
    return env->NewStringUTF(get_lame_version());
}