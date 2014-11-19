#include <stdio.h>
#include "cc_zhuran_jni_NativePrinter.h"
JNIEXPORT void JNICALL Java_cc_zhuran_jni_NativePrinter_print(JNIEnv * env, jobject target, jobject object){
        jclass classobject = (*env)->GetObjectClass(env, object);
//        if (classobject == 0){
//            printf("something wrong!");
//        }else{
//            printf("all right");
//        }
        jmethodID mid = (*env)->GetMethodID(env, classobject, "toString", "()Ljava/lang/String;");
//        if (mid != 0){
//            printf("something wrong!");
//        }
        jstring result = (jstring)((*env)->CallObjectMethod(env, object, mid));
        char* test=(char*)(*env)->GetStringUTFChars(env, result,NULL);
//        printf("%c",test[0]);
//	cout << object->toString() << endl;
}
